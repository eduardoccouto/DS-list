package com.eduardo.DS_list.controllers;

import com.eduardo.DS_list.dto.GameDTO;
import com.eduardo.DS_list.dto.GameListDTO;
import com.eduardo.DS_list.dto.GameMinDTO;
import com.eduardo.DS_list.services.GameListService;
import com.eduardo.DS_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List <GameListDTO> findAll() {

       return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List <GameMinDTO> findByList(@PathVariable Long listId){

        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
