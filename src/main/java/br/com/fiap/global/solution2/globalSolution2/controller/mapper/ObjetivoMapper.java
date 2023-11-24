package br.com.fiap.global.solution2.globalSolution2.controller.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.fiap.global.solution2.globalSolution2.controller.dto.ObjetivoDTO;
import br.com.fiap.global.solution2.globalSolution2.model.Objetivo;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ObjetivoMapper {

	private final ModelMapper modelMapper;

	public ObjetivoDTO map(Objetivo objetivo) {
		ObjetivoDTO dto = modelMapper.map(objetivo, ObjetivoDTO.class);
		dto.setId(objetivo.getId());
		return dto;
	}
}