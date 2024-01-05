package com.uce.edu.pa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pa2.repository.IPacienteRepository;
import com.uce.edu.pa2.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{
    @Autowired
    private IPacienteRepository iPacienteRepository;
    @Override
    public void guardar(Paciente paciente) {
        this.iPacienteRepository.insertar(paciente);
    }

    @Override
    public Paciente buscar(Integer id) {
       return this.iPacienteRepository.seleccionar(id);
    }

    @Override
    public void actualizar(Paciente paciente) {
       this.iPacienteRepository.actualizar(paciente);
    }

    @Override
    public void borrar(Integer id) {
        this.iPacienteRepository.eliminar(id);
    }

}
