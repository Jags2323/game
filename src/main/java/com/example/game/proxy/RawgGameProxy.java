package com.example.game.proxy;

import com.example.game.domain.dto.RawgGamePageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "rawg-game-service", url = "${rawg-base-api}")
public interface RawgGameProxy {

    @GetMapping("/games/{id}")
    RawgGamePageDto getGameDetails(@PathVariable("id") String gameId, @RequestParam("key") String apiKey);

    @GetMapping("/games")
    public RawgGamePageDto getListOfGames(@RequestParam("key") String apiKey);
}
