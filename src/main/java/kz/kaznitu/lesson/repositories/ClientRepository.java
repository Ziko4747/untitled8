package main.java.kz.kaznitu.lesson.repositories;

import kz.kaznitu.lesson.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Optional<Client> findById(Long id);
}
