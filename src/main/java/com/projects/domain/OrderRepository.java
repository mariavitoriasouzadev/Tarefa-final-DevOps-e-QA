package com.projects.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Se necessário, adicione métodos específicos do repositório aqui
}
