package br.com.tsuda.game_list.service;

import br.com.tsuda.game_list.controller.response.GameResponseDTO;
import br.com.tsuda.game_list.domain.entity.Game;
import br.com.tsuda.game_list.domain.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<GameResponseDTO> findAll() {
        List<Game> response = gameRepository.findAll();

        return response.stream().map(GameResponseDTO::new).toList();
    }
}
