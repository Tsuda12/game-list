package br.com.tsuda.game_list.controller;

import br.com.tsuda.game_list.controller.response.GameListDTO;
import br.com.tsuda.game_list.controller.response.GameMinResponseDTO;
import br.com.tsuda.game_list.controller.response.GameResponseDTO;
import br.com.tsuda.game_list.service.interfaces.GameListService;
import br.com.tsuda.game_list.service.interfaces.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListervice;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> response = gameListervice.findAll();

        return response;
    }
}
