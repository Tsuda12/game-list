package br.com.tsuda.game_list.domain.repository;

import br.com.tsuda.game_list.domain.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
