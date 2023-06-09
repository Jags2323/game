package com.example.game.domain.dto;

import com.example.game.domain.RawgGame;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawgGamePageDto {

    private long count;

    private List<RawgGame> results = new ArrayList<>();
}
