package br.edu.infnet.carolina_2023.services;

import br.edu.infnet.carolina_2023.controllers.MedicoController;
import br.edu.infnet.carolina_2023.exceptions.ResourceNotFoundException;
import br.edu.infnet.carolina_2023.mapper.DozerMapper;
import br.edu.infnet.carolina_2023.model.Medico;
import br.edu.infnet.carolina_2023.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.logging.Logger;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;




@Service
public class MedicoService {

    private Logger logger = Logger.getLogger(MedicoService.class.getName());


    @Autowired
    MedicoRepository repository;


    public List<Medico> findAll() {

        logger.info("Buscar a lista de medicos");

        return DozerMapper.parseListObjects(repository.findAll(), Medico.class);

    }

    public Medico findById(Long id) {

        logger.info("Buscar um médico");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado um medico com este ID"));
        return DozerMapper.parseObject(entity,Medico.class);
    }

    public Medico create(Medico medico) {

        logger.info("Criar um novo cadastro médico!");
        var entity = DozerMapper.parseObject(medico, Medico.class);
        return medico;
    }

    public Medico update(Medico medico) {

        logger.info("Atualizar médico");

        var entity = repository.findById(medico.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado um médico com este ID"));

        entity.setNome(medico.getNome());
        entity.setSobrenome(medico.getSobrenome());
        entity.setSiglaConselho(medico.getSiglaConselho());
        entity.setCodConselho(medico.getCodConselho());
        entity.setEspecialidades(medico.getEspecialidades());
        entity.setEmail(medico.getEmail());
        entity.setDtCadastro(medico.getDtCadastro());

        return repository.save(medico);

    }

    public void delete(Long id) {

        logger.info("Apagar um registro de médico");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado um médico com este ID"));
        repository.delete(entity);
    }
}