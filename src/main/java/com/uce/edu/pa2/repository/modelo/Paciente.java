package com.uce.edu.pa2.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    @SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
    @Column(name = "pcte_id")
    private Integer id;
    @Column(name = "pcte_nombre")
    private String nombre;
    @Column(name = "pcte_apellido")
    private String apellido;
    @OneToOne(mappedBy = "paciente",cascade = CascadeType.ALL)
    private HistoriaClinica historiaClinica;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    
}
