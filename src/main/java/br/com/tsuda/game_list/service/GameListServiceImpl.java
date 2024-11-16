package br.com.tsuda.game_list.service;

import br.com.tsuda.game_list.controller.response.GameListDTO;
import br.com.tsuda.game_list.domain.entity.GameList;
import br.com.tsuda.game_list.domain.repository.GameListRepository;
import br.com.tsuda.game_list.service.interfaces.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServiceImpl implements GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> response = gameListRepository.findAll();

        return response.stream().map(GameListDTO::new).toList();
    }
}
