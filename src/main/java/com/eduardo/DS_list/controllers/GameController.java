package com.eduardo.DS_list.controllers;

import com.eduardo.DS_list.dto.GameMinDTO;
import com.eduardo.DS_list.entities.Game;
import com.eduardo.DS_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
       List<GameMinDTO> result = gameService.findAll();

       return result;
    }
}
