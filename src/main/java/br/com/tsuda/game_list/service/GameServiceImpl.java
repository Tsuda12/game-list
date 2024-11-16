package br.com.tsuda.game_list.service;

import br.com.tsuda.game_list.controller.response.GameMinResponseDTO;
import br.com.tsuda.game_list.controller.response.GameResponseDTO;
import br.com.tsuda.game_list.domain.entity.Game;
import br.com.tsuda.game_list.domain.repository.GameRepository;
import br.com.tsuda.game_list.service.interfaces.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameMinResponseDTO> findAll() {
        List<Game> response = gameRepository.findAll();

        return response.stream().map(GameMinResponseDTO::new).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public GameResponseDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();

        return new GameResponseDTO(game);
    }
}
