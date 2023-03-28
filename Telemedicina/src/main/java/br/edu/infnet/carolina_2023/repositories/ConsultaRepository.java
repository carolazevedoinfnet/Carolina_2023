package br.edu.infnet.carolina_2023.repositories;


import br.edu.infnet.carolina_2023.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {}


