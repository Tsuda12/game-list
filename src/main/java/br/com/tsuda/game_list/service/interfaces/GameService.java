package br.com.tsuda.game_list.service.interfaces;

import br.com.tsuda.game_list.controller.response.GameMinResponseDTO;
import br.com.tsuda.game_list.controller.response.GameResponseDTO;

import java.util.List;

public interface GameService {

    List<GameMinResponseDTO> findAll();

    GameResponseDTO findById(Long id);
}
