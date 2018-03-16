package main.java.kz.kaznitu.lesson.repositories;

import kz.kaznitu.lesson.models.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    Optional<Admin> findById(Long id);
}
