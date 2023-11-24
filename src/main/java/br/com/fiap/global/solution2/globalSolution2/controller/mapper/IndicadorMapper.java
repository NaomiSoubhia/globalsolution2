package br.com.fiap.global.solution2.globalSolution2.controller.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.fiap.global.solution2.globalSolution2.controller.dto.IndicadorDTO;
import br.com.fiap.global.solution2.globalSolution2.model.Indicador;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class IndicadorMapper {

	private final ModelMapper modelMapper;

	public IndicadorDTO map(Indicador indicador) {
		IndicadorDTO dto = modelMapper.map(indicador, IndicadorDTO.class);
		dto.setId(indicador.getId());
		dto.setObjetivo_id(indicador.getObjetivo().getId());
		return dto;
	}
}

