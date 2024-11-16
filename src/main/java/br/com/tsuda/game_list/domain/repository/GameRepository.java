package br.com.tsuda.game_list.domain.repository;

import br.com.tsuda.game_list.domain.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
