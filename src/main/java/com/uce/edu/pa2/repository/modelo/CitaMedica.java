package com.uce.edu.pa2.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cita_medica")
    @SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica", allocationSize = 1)
    @Column(name = "cita_id")
    private Integer id;
    @Column(name = "cita_fecha")
    private LocalDateTime fecha;
    @Column(name = "cita_tratante")
    private String tratante;
    @Column(name = "cita_motivo")
    private String motivo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cita_pcte_id")
    private Paciente paciente;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public String getTratante() {
        return tratante;
    }
    public void setTratante(String tratante) {
        this.tratante = tratante;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
