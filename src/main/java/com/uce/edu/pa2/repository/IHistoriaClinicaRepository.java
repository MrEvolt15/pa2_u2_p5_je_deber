package com.uce.edu.pa2.repository;

import com.uce.edu.pa2.repository.modelo.HistoriaClinica;

public interface IHistoriaClinicaRepository {
    public void insertar(HistoriaClinica historiaClinica);
    public HistoriaClinica seleccionar(Integer id);
    public void actualizar(HistoriaClinica historiaClinica);
    public void eliminar(Integer id);
}
