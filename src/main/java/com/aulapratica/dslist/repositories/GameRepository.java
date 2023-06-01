package com.aulapratica.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulapratica.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
