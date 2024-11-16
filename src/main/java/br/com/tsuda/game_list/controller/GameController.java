package br.com.tsuda.game_list.controller;

import br.com.tsuda.game_list.controller.response.GameResponseDTO;
import br.com.tsuda.game_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameResponseDTO> findAll() {
        List<GameResponseDTO> response = gameService.findAll();

        return response;
    }
}
