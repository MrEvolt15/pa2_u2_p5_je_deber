package com.uce.edu.pa2.service;

import com.uce.edu.pa2.repository.modelo.Paciente;

public interface IPacienteService {
    public void guardar(Paciente paciente);
    public Paciente buscar(Integer id);
    public void actualizar(Paciente paciente);
    public void borrar(Integer id);
}
