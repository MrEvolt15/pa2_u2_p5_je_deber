package com.uce.edu.pa2.repository;

import com.uce.edu.pa2.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
    public void insertar(CitaMedica citaMedica);
    public CitaMedica seleccionar(Integer id);
    public void actualizar(CitaMedica citaMedica);
    public void eliminar(Integer id);
}
