package com.eduardo.DS_list.repositories;

import com.eduardo.DS_list.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
