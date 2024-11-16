package br.com.tsuda.game_list.service.interfaces;

import br.com.tsuda.game_list.controller.response.GameListDTO;

import java.util.List;

public interface GameListService {

    List<GameListDTO> findAll();
}
