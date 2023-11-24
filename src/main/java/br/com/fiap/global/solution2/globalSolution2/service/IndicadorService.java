package br.com.fiap.global.solution2.globalSolution2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.global.solution2.globalSolution2.model.Indicador;
import br.com.fiap.global.solution2.globalSolution2.repository.IndicadorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndicadorService {

	private final IndicadorRepository indicadorRepository;

	public List<Indicador> getAll() {
		return indicadorRepository.findAll();
	}

	public boolean exists(String id) {
		return indicadorRepository.existsById(id);
	}

	public Indicador findById(String id) {
		return indicadorRepository.findById(id).orElse(null);
	}
	
	public List<Indicador> findByObjetivo(String id) {
		return indicadorRepository.findByObjetivo(id);
	}
}
