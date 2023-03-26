package br.edu.infnet.carolina_2023.repositories;

import br.edu.infnet.carolina_2023.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}