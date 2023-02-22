package unittests.mapper.mocks;



import java.util.ArrayList;
import java.util.List;
import br.edu.infnet.carolina_2023.data.vo.v1.PacienteVO;
import br.edu.infnet.carolina_2023.model.Paciente;

public class MockPaciente {


    public Paciente mockEntity() {
        return mockEntity(0);
    }

    public PacienteVO mockVO() {
        return mockVO(0);
    }

    public List<Paciente> mockEntityList() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        for (int i = 0; i < 14; i++) {
            pacientes.add(mockEntity(i));
        }
        return pacientes;
    }

    public List<PacienteVO> mockVOList() {
        List<PacienteVO> pacientes = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            pacientes.add(mockVO(i));
        }
        return pacientes;
    }

    public Paciente mockEntity(Integer number) {
        Paciente paciente = new Paciente();
        paciente.setId(number.longValue());
        paciente.setNome("Nome Teste" + number);
        paciente.setSobrenome("Sobrenome Test" + number);
        //paciente.setNascimento(date.getDate());
        paciente.setMae("Nome Mãe" + number);
        paciente.setPai("Nome Pai" + number);
        paciente.setSexo(((number % 2)==0) ? "Masculino" : "Feminino");
        paciente.setCpf("CPF" + number);
        paciente.setEmail("email" + number);
        paciente.setTelefone(number.intValue());
        //paciente.setDtAtualizacao(number.intValue());
        return paciente;
    }

    public PacienteVO mockVO(Integer number) {
        PacienteVO paciente = new PacienteVO();
        paciente.setKey(number.longValue());
        paciente.setNome("Nome Teste" + number);
        paciente.setSobrenome("Sobrenome Test" + number);
        //paciente.setNascimento(date.getDate());
        paciente.setMae("Nome Mãe" + number);
        paciente.setPai("Nome Pai" + number);
        paciente.setSexo(((number % 2)==0) ? "Masculino" : "Feminino");
        paciente.setCpf("CPF" + number);
        paciente.setEmail("email" + number);
        paciente.setTelefone(number.intValue());
        //paciente.setDtAtualizacao(number.intValue());
        return paciente;

    }

}