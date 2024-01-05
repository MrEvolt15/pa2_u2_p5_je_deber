package com.uce.edu.pa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pa2.repository.IHistoriaClinicaRepository;
import com.uce.edu.pa2.repository.modelo.HistoriaClinica;

@Service
public class HistoriaClinicaServiceImpl implements IHistoriaClinicaService{
    @Autowired
    private IHistoriaClinicaRepository clinicaRepository;
    @Override
    public void guardar(HistoriaClinica historiaClinica) {
        this.clinicaRepository.insertar(historiaClinica);
    }

    @Override
    public HistoriaClinica buscar(Integer id) {
        return this.clinicaRepository.seleccionar(id);
    }

    @Override
    public void actualizar(HistoriaClinica historiaClinica) {
       this.clinicaRepository.actualizar(historiaClinica);
    }

    @Override
    public void borrar(Integer id) {
       this.clinicaRepository.eliminar(id);
    }

}
