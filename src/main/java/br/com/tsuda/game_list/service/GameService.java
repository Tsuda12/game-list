package br.com.tsuda.game_list.service;

import br.com.tsuda.game_list.controller.response.GameResponseDTO;

import java.util.List;

public interface GameService {

    List<GameResponseDTO> findAll();
}
