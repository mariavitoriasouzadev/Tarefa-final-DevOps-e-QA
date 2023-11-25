package com.projects.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Se necessário, adicione métodos específicos do repositório aqui
}
