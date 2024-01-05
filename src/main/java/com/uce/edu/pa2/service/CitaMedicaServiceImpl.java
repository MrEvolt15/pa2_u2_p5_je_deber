package com.uce.edu.pa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pa2.repository.ICitaMedicaRepository;
import com.uce.edu.pa2.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
    @Autowired
    private ICitaMedicaRepository citaMedicaRepository;

    @Override
    public void guardar(CitaMedica citaMedica) {
        this.citaMedicaRepository.insertar(citaMedica);
    }

    @Override
    public CitaMedica buscar(Integer id) {
       return this.citaMedicaRepository.seleccionar(id);
    }

    @Override
    public void actualizar(CitaMedica citaMedica) {
       this.citaMedicaRepository.actualizar(citaMedica);
    }

    @Override
    public void borrar(Integer id) {
       this.citaMedicaRepository.eliminar(id);
    }

}
