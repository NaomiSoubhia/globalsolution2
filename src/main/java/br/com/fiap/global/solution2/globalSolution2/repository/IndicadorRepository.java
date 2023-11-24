package br.com.fiap.global.solution2.globalSolution2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fiap.global.solution2.globalSolution2.model.Indicador;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, String> {
	
	@Query("select o from Indicador o where o.objetivo.id = :id")
	List<Indicador> findByObjetivo(@Param("id") String id);
}
