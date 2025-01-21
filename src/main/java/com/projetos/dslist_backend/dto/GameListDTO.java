package com.projetos.dslist_backend.dto;

import org.springframework.beans.BeanUtils;

import com.projetos.dslist_backend.entities.GameList;

public class GameListDTO {
	
	public Long id;
	public String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList gameList) {
		BeanUtils.copyProperties(gameList, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
