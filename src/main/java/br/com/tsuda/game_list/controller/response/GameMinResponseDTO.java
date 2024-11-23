package br.com.tsuda.game_list.controller.response;

import br.com.tsuda.game_list.domain.entity.Game;
import br.com.tsuda.game_list.domain.repository.projection.GameMinProjection;

public class GameMinResponseDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinResponseDTO() {}

    public GameMinResponseDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinResponseDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
