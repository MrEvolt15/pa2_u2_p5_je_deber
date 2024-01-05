package com.uce.edu.pa2.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historia_clinica")
    @SequenceGenerator(name = "seq_historia_clinica", sequenceName = "seq_historia_clinica", allocationSize = 1)
    @Column(name = "hsto_id")
    private Integer id;
    @Column(name = "hsto_peso")
    private Double peso;
    @Column(name = "hsto_estatura")
    private Double estatura;
    @Column(name = "hsto_IMC")
    private Double imc;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hsto_pcte_id")
    private Paciente paciente;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public Double getImc() {
        return imc;
    }
    public void setImc(Double imc) {
        this.imc = imc;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
