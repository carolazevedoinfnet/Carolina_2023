package br.edu.infnet.carolina_2023.services;


import java.util.List;

import java.util.logging.Logger;

import br.edu.infnet.carolina_2023.controllers.PacienteController;
import br.edu.infnet.carolina_2023.data.vo.v1.PacienteVO;
import br.edu.infnet.carolina_2023.exceptions.ResourceNotFoundException;
import br.edu.infnet.carolina_2023.mapper.DozerMapper;
import br.edu.infnet.carolina_2023.model.Paciente;
import br.edu.infnet.carolina_2023.repositories.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.stereotype.Service;

@Service
public class PacienteServices {

    private Logger logger = Logger.getLogger(PacienteServices.class.getName());


    @Autowired
    PacienteRepository repository;


    public List<PacienteVO> findAll() {

        logger.info("Buscar a lista de pacientes");

        var pacientes = DozerMapper.parseListObjects(repository.findAll(), PacienteVO.class);
        pacientes
                .stream()
                .forEach(p -> p.add(linkTo(methodOn(PacienteController.class).findById(p.getKey())).withSelfRel()));
        return pacientes;
    }

    public PacienteVO findById(Long id) {

        logger.info("Buscar um paciente");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado paciente com este ID"));
        var vo = DozerMapper.parseObject(entity, PacienteVO.class);
        vo.add(linkTo(methodOn(PacienteController.class).findById(id)).withSelfRel());
        return vo;
    }

    public PacienteVO create(PacienteVO paciente) {

        logger.info("Criar novo paciente!");
        var entity = DozerMapper.parseObject(paciente, Paciente.class);
        var vo = DozerMapper.parseObject(repository.save(entity),PacienteVO.class);
        vo.add(linkTo(methodOn(PacienteController.class).findById(vo.getKey())).withSelfRel());
        return vo;
    }

    public PacienteVO update(PacienteVO paciente) {

        logger.info("Atualizar paciente");

        var entity = repository.findById(paciente.getKey())
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado paciente com este ID"));

        entity.setNome(paciente.getNome());
        entity.setSobrenome(paciente.getSobrenome());
        entity.setNascimento(paciente.getNascimento());
        entity.setMae(paciente.getMae());
        entity.setPai(paciente.getPai());
        entity.setSexo(paciente.getSexo());
        entity.setCpf(paciente.getCpf());
        entity.setEmail(paciente.getEmail());
        entity.setTelefone(paciente.getTelefone());
        entity.setDtAtualizacao(paciente.getDtAtualizacao());

        var vo = DozerMapper.parseObject(repository.save(entity),PacienteVO.class);
        vo.add(linkTo(methodOn(PacienteController.class).findById(vo.getKey())).withSelfRel());
        return vo;
    }

    public void delete(Long id) {

        logger.info("Apagar um paciente");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado paciente com este ID"));
        repository.delete(entity);
    }
}