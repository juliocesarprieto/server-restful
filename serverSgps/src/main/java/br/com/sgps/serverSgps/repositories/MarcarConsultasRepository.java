package br.com.sgps.serverSgps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.sgps.serverSgps.models.MarcarConsultas;

@Repository
public interface MarcarConsultasRepository extends JpaRepository<MarcarConsultas, Integer>{

}
