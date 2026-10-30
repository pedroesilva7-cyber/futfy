package com.seduc2.futebol.repository;

import com.seduc2.futebol.entity.jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jogadorRepository extends JpaRepository<jogador, Long> {
}