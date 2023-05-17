package com.example.game.repository;

import com.example.game.domain.RawgGame;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<RawgGame, Integer> {

}
