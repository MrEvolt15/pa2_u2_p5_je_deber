package com.uce.edu.pa2.service;

import com.uce.edu.pa2.repository.modelo.HistoriaClinica;

public interface IHistoriaClinicaService {
    public void guardar(HistoriaClinica historiaClinica);
    public HistoriaClinica buscar(Integer id);
    public void actualizar(HistoriaClinica historiaClinica);
    public void borrar(Integer id);
}
