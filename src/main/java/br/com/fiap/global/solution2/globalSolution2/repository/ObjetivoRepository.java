package br.com.fiap.global.solution2.globalSolution2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.global.solution2.globalSolution2.model.Objetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, String> {

}
