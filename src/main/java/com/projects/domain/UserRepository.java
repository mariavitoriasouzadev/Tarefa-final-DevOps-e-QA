package com.projects.domain;

   import org.springframework.data.jpa.repository.JpaRepository;
   import java.util.List;
   import java.util.Optional;

   public interface UserRepository extends JpaRepository<User, Long> {
       // Método para encontrar um usuário pelo seu endereço de email
       Optional<User> findByEmail(String email);

       // Método para encontrar usuários por parte do nome
       List<User> findByNomeContaining(String parteDoNome);

       // Outros métodos personalizados, se necessário
   }
   