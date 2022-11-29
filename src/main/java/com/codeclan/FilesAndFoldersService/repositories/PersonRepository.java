package com.codeclan.FilesAndFoldersService.repositories;

import com.codeclan.FilesAndFoldersService.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
