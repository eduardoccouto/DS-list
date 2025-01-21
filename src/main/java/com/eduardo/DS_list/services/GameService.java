package com.eduardo.DS_list.services;


import com.eduardo.DS_list.dto.GameMinDTO;
import com.eduardo.DS_list.entities.Game;
import com.eduardo.DS_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }
}
