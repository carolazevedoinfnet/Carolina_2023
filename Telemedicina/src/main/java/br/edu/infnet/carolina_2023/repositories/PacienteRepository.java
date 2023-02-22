package br.edu.infnet.carolina_2023.repositories;

import br.edu.infnet.carolina_2023.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacienteRepository extends JpaRepository <Paciente, Long>{

}
