package br.edu.infnet.carolina_2023.services;


import java.util.List;
import java.util.logging.Logger;

import br.edu.infnet.carolina_2023.exceptions.ResourceNotFoundException;
import br.edu.infnet.carolina_2023.mapper.DozerMapper;
import br.edu.infnet.carolina_2023.model.Consulta;
import br.edu.infnet.carolina_2023.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ConsultaService {

    private final Logger logger = Logger.getLogger(ConsultaService.class.getName());


    @Autowired
    ConsultaRepository repository;


    public List<Consulta> findAll() {

        logger.info("Buscar a lista de consultas");

        return DozerMapper.parseListObjects(repository.findAll(), Consulta.class);

    }

    public Consulta findById(Long id) {

        logger.info("Buscar uma consulta");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado uma consulta com este ID"));
        return DozerMapper.parseObject(entity,Consulta.class);
    }

    public Consulta create(Consulta consulta) {

        logger.info("Criar uma nova consulta!");
        var entity = DozerMapper.parseObject(consulta, Consulta.class);
        return consulta;
    }

    public Consulta update(Consulta consulta) {

        logger.info("Atualizar consulta");

        var entity = repository.findById(consulta.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrada uma consulta com este ID"));

        entity.setData(consulta.getData());
        entity.setHora(consulta.getHora());
        entity.setMedico(consulta.getMedico());
        entity.setPaciente(consulta.getPaciente());

        return repository.save(consulta);

    }

    public void delete(Long id) {

        logger.info("Apagar um registro de consulta");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado uma consulta com este ID"));
        repository.delete(entity);
    }
}