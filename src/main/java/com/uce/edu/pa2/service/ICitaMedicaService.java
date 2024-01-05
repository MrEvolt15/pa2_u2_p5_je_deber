package com.uce.edu.pa2.service;

import com.uce.edu.pa2.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
    public void guardar(CitaMedica citaMedica);
    public CitaMedica buscar(Integer id);
    public void actualizar(CitaMedica citaMedica);
    public void borrar(Integer id);
}
