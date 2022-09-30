package com.azuremyst.manutencao.repository;

import com.azuremyst.manutencao.domain.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long> {

}
