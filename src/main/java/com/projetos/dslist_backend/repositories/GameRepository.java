package com.projetos.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.dslist_backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
