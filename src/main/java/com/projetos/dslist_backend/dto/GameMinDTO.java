package com.projetos.dslist_backend.dto;

import com.projetos.dslist_backend.entities.Game;
import com.projetos.dslist_backend.projections.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;	
	private String short_description;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game game) {
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		imgUrl = game.getImgUrl();
		short_description = game.getShort_Description();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		short_description = projection.getShortDescription();
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

	public String getShort_description() {
		return short_description;
	}
}
