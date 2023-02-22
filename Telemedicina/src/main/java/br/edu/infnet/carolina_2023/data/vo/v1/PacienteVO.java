package br.edu.infnet.carolina_2023.data.vo.v1;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;


@JsonPropertyOrder({"id", "nome","sobrenome", "nascimento", "mae", "pai","sexo","cpf","email","telefone","dtAtualizacao"})
public class PacienteVO extends RepresentationModel<PacienteVO> implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    @Mapping("id")
    private Long key;
    private String nome;
    private String sobrenome;
    private Date nascimento;
    private String mae;
    private String pai;
    private String sexo;
    private String cpf;
    private String email;
    private Integer telefone;
    private Date dtAtualizacao;


    public PacienteVO() {}


    public Long getKey() {
        return key;
    }


    public void setKey(Long key) {
        this.key = key;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getNascimento() {
        return nascimento;
    }


    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }


    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }


    public void setPai(String pai) {
        this.pai = pai;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getTelefone() {
        return telefone;
    }


    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }


    public Date getDtAtualizacao() {
        return dtAtualizacao;
    }


    public void setDtAtualizacao(Date dtAtualizacao) {
        this.dtAtualizacao = dtAtualizacao;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + Objects.hash(cpf, dtAtualizacao, email, key, mae, nascimento, nome, pai, sexo, sobrenome, telefone);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PacienteVO other = (PacienteVO) obj;
        return Objects.equals(cpf, other.cpf) && Objects.equals(dtAtualizacao, other.dtAtualizacao)
                && Objects.equals(email, other.email) && Objects.equals(key, other.key)
                && Objects.equals(mae, other.mae) && Objects.equals(nascimento, other.nascimento)
                && Objects.equals(nome, other.nome) && Objects.equals(pai, other.pai)
                && Objects.equals(sexo, other.sexo) && Objects.equals(sobrenome, other.sobrenome)
                && Objects.equals(telefone, other.telefone);
    }





}
