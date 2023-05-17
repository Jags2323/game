package com.example.game.controller;

import com.example.game.domain.RawgGame;
import com.example.game.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    public GameService gameService;
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/rawg/games")
    public List<RawgGame> getRawgData(){
        return gameService.getRawgData();
    }

//    @GetMapping("/rawg/games/{id}")
//    public List<RawgGame> getRawgDataById(){return gameService.getRawgDataById();}
}
