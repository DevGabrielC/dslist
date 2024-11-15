package com.gabrielcdev.dslist.services;

import com.gabrielcdev.dslist.dto.GameMinDTO;
import com.gabrielcdev.dslist.entities.Game;
import com.gabrielcdev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
