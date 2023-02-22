package unittests.mapper;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import br.edu.infnet.carolina_2023.data.vo.v1.PacienteVO;
import br.edu.infnet.carolina_2023.mapper.DozerMapper;
import br.edu.infnet.carolina_2023.model.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unittests.mapper.mocks.MockPaciente;

public class DozerConverterTest {

    MockPaciente inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockPaciente();
    }

    @Test
    public void parseEntityToVOTest() {
        PacienteVO output = DozerMapper.parseObject(inputObject.mockEntity(), PacienteVO.class);
        assertEquals(Long.valueOf(0L), output.getKey());
        assertEquals("Nome Test0", output.getNome());
        assertEquals("Sobrenome Test0", output.getSobrenome());
        assertEquals("Nascimento Test0", output.getNascimento());
        assertEquals("Mãe Test0", output.getMae());
        assertEquals("Pai Test0", output.getPai());
        assertEquals("Sexo Test0", output.getSexo());
        assertEquals("CPF Test0", output.getCpf());
        assertEquals("Email Test0", output.getEmail());
        assertEquals("Telefone Test0", output.getTelefone());
        assertEquals("Data Atualização Test0", output.getDtAtualizacao());

    }

    @Test
    public void parseEntityListToVOListTest() {
        List<PacienteVO> outputList = DozerMapper.parseListObjects(inputObject.mockEntityList(), PacienteVO.class);
        PacienteVO outputZero = outputList.get(0);


        assertEquals("Nome Test0", outputZero.getNome());
        assertEquals("Sobrenome Test0", outputZero.getSobrenome());
        assertEquals("Nascimento Test0", outputZero.getNascimento());
        assertEquals("Mãe Test0", outputZero.getMae());
        assertEquals("Pai Test0", outputZero.getPai());
        assertEquals("Sexo Test0", outputZero.getSexo());
        assertEquals("CPF Test0", outputZero.getCpf());
        assertEquals("Email Test0", outputZero.getEmail());
        assertEquals("Telefone Test0", outputZero.getTelefone());
        assertEquals("Data Atualização Test0", outputZero.getDtAtualizacao());

        PacienteVO outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getKey());
        assertEquals("Nome Test7", outputSeven.getNome());
        assertEquals("Sobrenome Test7", outputSeven.getSobrenome());
        assertEquals("Nascimento Test7", outputSeven.getNascimento());
        assertEquals("Mãe Test7", outputSeven.getMae());
        assertEquals("Pai Test7", outputSeven.getPai());
        assertEquals("Sexo Test7", outputSeven.getSexo());
        assertEquals("CPF Test7", outputSeven.getCpf());
        assertEquals("Email Test7", outputSeven.getEmail());
        assertEquals("Telefone Test7", outputSeven.getTelefone());
        assertEquals("Data Atualização Test7", outputSeven.getDtAtualizacao());



        PacienteVO outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getKey());
        assertEquals("Nome Test12", outputTwelve.getNome());
        assertEquals("Sobrenome Test12", outputTwelve.getSobrenome());
        assertEquals("Nascimento Test12", outputTwelve.getNascimento());
        assertEquals("Mãe Test12", outputTwelve.getMae());
        assertEquals("Pai Test12", outputTwelve.getPai());
        assertEquals("Sexo Test12", outputTwelve.getSexo());
        assertEquals("CPF Test12", outputTwelve.getCpf());
        assertEquals("Email Test12", outputTwelve.getEmail());
        assertEquals("Telefone Test12", outputTwelve.getTelefone());
        assertEquals("Data Atualização Test12", outputTwelve.getDtAtualizacao());


    }

    @Test
    public void parseVOToEntityTest() {
        Paciente output = DozerMapper.parseObject(inputObject.mockVO(), Paciente.class);
        assertEquals(Long.valueOf(0L), output.getId());



        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("Nome Test0", output.getNome());
        assertEquals("Sobrenome Test0", output.getSobrenome());
        assertEquals("Nascimento Test0", output.getNascimento());
        assertEquals("Mãe Test0", output.getMae());
        assertEquals("Pai Test0", output.getPai());
        assertEquals("Sexo Test0", output.getSexo());
        assertEquals("CPF Test0", output.getCpf());
        assertEquals("Email Test0", output.getEmail());
        assertEquals("Telefone Test0", output.getTelefone());
        assertEquals("Data Atualização Test0", output.getDtAtualizacao());


    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Paciente> outputList = DozerMapper.parseListObjects(inputObject.mockVOList(), Paciente.class);
        Paciente outputZero = outputList.get(0);

        assertEquals(Long.valueOf(0L), outputZero.getId());


        assertEquals("Nome Test0", outputZero.getNome());
        assertEquals("Sobrenome Test0", outputZero.getSobrenome());
        assertEquals("Nascimento Test0", outputZero.getNascimento());
        assertEquals("Mãe Test0", outputZero.getMae());
        assertEquals("Pai Test0", outputZero.getPai());
        assertEquals("Sexo Test0", outputZero.getSexo());
        assertEquals("CPF Test0", outputZero.getCpf());
        assertEquals("Email Test0", outputZero.getEmail());
        assertEquals("Telefone Test0", outputZero.getTelefone());
        assertEquals("Data Atualização Test0", outputZero.getDtAtualizacao());


        Paciente outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("Nome Test7", outputSeven.getNome());
        assertEquals("Sobrenome Test7", outputSeven.getSobrenome());
        assertEquals("Nascimento Test7", outputSeven.getNascimento());
        assertEquals("Mãe Test7", outputSeven.getMae());
        assertEquals("Pai Test7", outputSeven.getPai());
        assertEquals("Sexo Test7", outputSeven.getSexo());
        assertEquals("CPF Test7", outputSeven.getCpf());
        assertEquals("Email Test7", outputSeven.getEmail());
        assertEquals("Telefone Test7", outputSeven.getTelefone());
        assertEquals("Data Atualização Test7", outputSeven.getDtAtualizacao());


        Paciente outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("Nome Test12", outputTwelve.getNome());
        assertEquals("Sobrenome Test12", outputTwelve.getSobrenome());
        assertEquals("Nascimento Test12", outputTwelve.getNascimento());
        assertEquals("Mãe Test12", outputTwelve.getMae());
        assertEquals("Pai Test12", outputTwelve.getPai());
        assertEquals("Sexo Test12", outputTwelve.getSexo());
        assertEquals("CPF Test12", outputTwelve.getCpf());
        assertEquals("Email Test12", outputTwelve.getEmail());
        assertEquals("Telefone Test12", outputTwelve.getTelefone());
        assertEquals("Data Atualização Test12", outputTwelve.getDtAtualizacao());
    }
}