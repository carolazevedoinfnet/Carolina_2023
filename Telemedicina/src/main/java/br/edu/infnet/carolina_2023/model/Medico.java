package br.edu.infnet.carolina_2023.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "medicos")
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 80)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 80)
    private String sobrenome;

    @Column(nullable = false, length = 80)
    private String siglaConselho;

    @Column(nullable = false)
    private Integer codConselho;

    @Column(nullable = false, length = 100)
    private String especialidades;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private Date dtCadastro;


    public Medico() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getSiglaConselho() {
        return siglaConselho;
    }

    public void setSiglaConselho(String siglaConselho) {
        this.siglaConselho = siglaConselho;
    }

    public Integer getCodConselho() {
        return codConselho;
    }


    public void setCodConselho(Integer codConselho) {
        this.codConselho = codConselho;
    }

    public String getEspecialidades() {
        return especialidades;
    }


    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDtCadastro() {
        return dtCadastro;
    }


    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }


    @Override
    public int hashCode() {
        return Objects.hash(dtCadastro, email, id, siglaConselho, especialidades, nome, sobrenome, codConselho);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medico other = (Medico) obj;
        return Objects.equals(siglaConselho, other.siglaConselho) && Objects.equals(dtCadastro, other.dtCadastro)
                && Objects.equals(email, other.email) && Objects.equals(id, other.id)
                && Objects.equals(especialidades, other.especialidades) && Objects.equals(nome, other.nome)
                && Objects.equals(sobrenome, other.sobrenome) && Objects.equals(codConselho, other.codConselho);
    }


}

