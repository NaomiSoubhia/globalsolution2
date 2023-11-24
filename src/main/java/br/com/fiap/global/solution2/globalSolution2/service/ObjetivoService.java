package br.com.fiap.global.solution2.globalSolution2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.global.solution2.globalSolution2.model.Objetivo;
import br.com.fiap.global.solution2.globalSolution2.repository.ObjetivoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObjetivoService {

	private final ObjetivoRepository objetivoRepository;

	public List<Objetivo> getAll() {
		return objetivoRepository.findAll();
	}

	public boolean exists(String id) {
		return objetivoRepository.existsById(id);
	}

	public Objetivo findById(String id) {
		return objetivoRepository.findById(id).orElse(null);
	}


}
