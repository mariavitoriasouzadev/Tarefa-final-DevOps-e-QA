package com.projects.adapters;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Api(value = "UserController", description = "Operations related to users")
public class UserController {

    @ApiOperation(value = "Get details of a user by ID")
    @GetMapping("/{userId}")
    public String getUserDetails(@PathVariable Long userId) {
        // Lógica para obter detalhes do usuário com o ID fornecido
        return "Detalhes do Usuário #" + userId;
    }

    @ApiOperation(value = "Create a new user")
    @PostMapping
    public String createUser(@RequestBody UserRequest userRequest) {
        // Lógica para processar e criar um novo usuário
        return "Usuário criado com sucesso!";
    }

    @ApiOperation(value = "Update an existing user")
    @PutMapping("/{userId}")
    public String updateUser(@PathVariable Long userId, @RequestBody UserRequest userRequest) {
        // Lógica para atualizar um usuário existente
        return "Usuário atualizado com sucesso!";
    }

    @ApiOperation(value = "Delete a user by ID")
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        // Lógica para excluir um usuário com o ID fornecido
        return "Usuário excluído com sucesso!";
    }

    // Outros métodos relacionados a usuários...

    // Classe interna para representar o corpo da solicitação de um novo usuário
    static class UserRequest {
        // Campos relevantes para um novo usuário
        // Inserir campos necessários para a criação de um novo usuário
    }
}
