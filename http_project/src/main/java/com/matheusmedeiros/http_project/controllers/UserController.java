package com.matheusmedeiros.http_project.controllers;

import com.matheusmedeiros.http_project.entities.User;
import com.matheusmedeiros.http_project.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//caminho para acessar o controller
@RequestMapping (value = "/users")
public class UserController {


    @Autowired //injeção de dependência
    private UserRepositorie userRepositorie;


    @GetMapping // REFERECE AO VERBO HTTP QUE ESTÀ SENDO USADO
    public List<User> findAll(){
        List<User> result =userRepositorie.findAll();
        return result;
    }

    @RequestMapping (value = "/{id}", method = RequestMethod.GET)// indica o valor que vai ser usado
    // PathVariable = relaciona o id do link com o da função
   public ResponseEntity<?> findById(@PathVariable Long id){
        User result = userRepositorie.findById(id).orElse(null);

        if (result == null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
    }

    @PostMapping
    public User create(@RequestBody  User user){
        User result = userRepositorie.save(user);
        return result;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        User uptadeUser = userRepositorie.findById(id).orElse(null);

        if (uptadeUser == null){
            return ResponseEntity.notFound().build();
        }else {
            uptadeUser.setName(user.getName());
            uptadeUser.setEmail(user.getEmail());

            userRepositorie.save(uptadeUser);
            return ResponseEntity.ok(uptadeUser);

        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id){
        User deleteUser = userRepositorie.findById(id).orElse(null);

        if (deleteUser == null){
            return ResponseEntity.notFound().build();
        }else {
            userRepositorie.deleteById(id);
            return  ResponseEntity.ok(deleteUser);

        }
    }
}
