package com.example.disneyjava.repository;

import com.example.disneyjava.entity.PeliculaOSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaOSerieRepository extends JpaRepository <PeliculaOSerie, Long> {
}
