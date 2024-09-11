
# 🚀 CRUD API - Spring Boot

Uma API em Java com Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) usando métodos HTTP.

## 🛠️ Tecnologias

- **Java 11+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Postman** (para testes)

## 📑 Endpoints

| Método | Endpoint        | Descrição                        |
|--------|-----------------|----------------------------------|
| GET    | `/users`        | Lista todos os usuários          |
| GET    | `/users/{id}`   | Busca um usuário por ID          |
| POST   | `/users`        | Cria um novo usuário             |
| PUT    | `/users/{id}`   | Atualiza os dados de um usuário  |
| DELETE | `/users/{id}`   | Remove um usuário por ID         |

## 🚀 Iniciando o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/MatheusMedeiroscl/api_http.git
   ```

2. **Acesse o diretório do projeto**:
   ```bash
   cd api_http
   ```

3. **Compile e execute**:
   ```bash
   mvn spring-boot:run
   ```

4. **Teste no Postman**:
   - Acesse: `http://localhost:8080/users`

## 📬 Exemplos de Requisição

### Criar Usuário (POST)
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

### Atualizar Usuário (PUT)
```json
{
  "name": "Jane Doe",
  "email": "jane.doe@example.com"
}
```

---

Feito com 💻 por [Matheus Medeiros](https://github.com/MatheusMedeiroscl) 🧑‍💻

---

## Notas

O desenvolvimento não foi complexo graças às dependências do Spring Boot. Durante o processo, encontrei algumas dificuldades para entender a sintaxe dos métodos HTTP e da JPA, mas com prática, consegui progredir e desenvolver melhor a aplicação. Meu próximo desafio é conectar esta API a um banco de dados real e vinculá-la a um frontend.

## Aceito Sugestões e Dicas!

---
