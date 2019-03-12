package br.usjt.PrevisaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.Tempo;

public interface TempoRepository extends JpaRepository<Tempo, Long>{

}
