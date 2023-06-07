package com.aulapratica.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulapratica.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
