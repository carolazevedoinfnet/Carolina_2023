package br.edu.infnet.carolina_2023.model;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.*;


@Entity
@Table(name = "consultas")
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column (columnDefinition = "TIME")
    @Temporal(TemporalType.TIME)
    private LocalTime hora;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    public Consulta() {

    }


    @Override
    public int hashCode() {
        return Objects.hash(id, data, hora, medico, paciente);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Medico getMedico() {return medico;}

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {return paciente;}

    public void setPaciente(Paciente paciente) { this.paciente = paciente;}



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;
        Consulta other = (Consulta) obj;
        return Objects.equals(id, other.id) && Objects.equals(data, other.data)
                && Objects.equals(hora, other.hora) && Objects.equals(medico, other.medico) && Objects.equals(paciente, other.paciente);
    }


}