package com.eduardo.DS_list.services;


import com.eduardo.DS_list.dto.GameDTO;
import com.eduardo.DS_list.dto.GameMinDTO;
import com.eduardo.DS_list.entities.Game;
import com.eduardo.DS_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }
    @Transactional(readOnly = true)
    public GameDTO findByID(Long id){
        //INSERIR UM TRATAMENTO DE EXCEÇÃO
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }
}
