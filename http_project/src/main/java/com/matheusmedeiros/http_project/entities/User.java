package com.matheusmedeiros.http_project.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private String email;

    //Foreing_Key do Departamento com o User, cria a relação entre eles
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
