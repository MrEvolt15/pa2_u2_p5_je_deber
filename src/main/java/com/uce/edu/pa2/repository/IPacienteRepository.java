package com.uce.edu.pa2.repository;

import com.uce.edu.pa2.repository.modelo.Paciente;

public interface IPacienteRepository {
    public void insertar(Paciente paciente);
    public Paciente seleccionar(Integer id);
    public void actualizar(Paciente paciente);
    public void eliminar(Integer id);
}
