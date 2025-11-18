package com.example.veterinaria.repository;
//estamos llamando a la clase Mascota
import com.example.veterinaria.model.Mascota;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository <Mascota, Integer> {
}
