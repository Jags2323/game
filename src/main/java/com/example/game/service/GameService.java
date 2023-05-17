package com.example.game.service;

import com.example.game.domain.RawgGame;
import com.example.game.proxy.RawgGameProxy;
import com.example.game.repository.GameRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    private final RawgGameProxy rawgGameProxy;

    @Value("${rawg.game.api.key}")
    private String apiKey;

    public GameService(GameRepository gameRepository, RawgGameProxy rawgGame) {
        this.gameRepository = gameRepository;
        this.rawgGameProxy=rawgGame;
    }



    public List<RawgGame> getRawgData(){
        List<RawgGame> results= rawgGameProxy.getListOfGames(apiKey).getResults();
        gameRepository.saveAll(results);
        return results;
    }

//    public Optional<RawgGame> getRawgDataById(Long id) {
//        return gameRepository.findById(Math.toIntExact(id));
//
//    }

    public List<RawgGame> getRawgDataById(String gameId){
        return rawgGameProxy.getGameDetails(gameId,apiKey).getResults();


    }

}
