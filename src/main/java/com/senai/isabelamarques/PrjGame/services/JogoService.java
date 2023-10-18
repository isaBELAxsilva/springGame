package com.senai.isabelamarques.PrjGame.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.isabelamarques.PrjGame.entities.Jogo;
import com.senai.isabelamarques.PrjGame.repositories.JogoRepository;


@Service
public class JogoService {
	
	private final JogoRepository jogoRepository;
	
	@Autowired
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo getJogoById(Long Id) {
		return jogoRepository.findById(Id).orElse(null);
	}
	
	public List<Jogo> getAllJogos(){
		return jogoRepository.findAll();
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public void deleteJogos(Long id) {
		jogoRepository.deleteById(id);
	}

}
