package com.azuremyst.manutencao.repository;

import com.azuremyst.manutencao.domain.UnidadeNegocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeNegocioRepository extends JpaRepository<UnidadeNegocio, Long> {

}
