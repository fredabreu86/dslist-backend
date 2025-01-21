package com.projetos.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.dslist_backend.dto.GameDTO;
import com.projetos.dslist_backend.dto.GameListDTO;
import com.projetos.dslist_backend.dto.GameMinDTO;
import com.projetos.dslist_backend.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
