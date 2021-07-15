package com.example.disneyjava.repository;

import com.example.disneyjava.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository <Genero, Long> {
}
