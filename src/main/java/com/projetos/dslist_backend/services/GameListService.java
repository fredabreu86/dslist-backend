package com.projetos.dslist_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetos.dslist_backend.dto.GameListDTO;
import com.projetos.dslist_backend.entities.GameList;
import com.projetos.dslist_backend.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = repository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
				
	}
	
}
