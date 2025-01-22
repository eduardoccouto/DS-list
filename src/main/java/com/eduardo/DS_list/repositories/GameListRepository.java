package com.eduardo.DS_list.repositories;


import com.eduardo.DS_list.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
