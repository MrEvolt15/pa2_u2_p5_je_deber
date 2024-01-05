package com.uce.edu.pa2.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.pa2.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(CitaMedica citaMedica) {
        this.entityManager.persist(citaMedica);
    }

    @Override
    public CitaMedica seleccionar(Integer id) {
        return this.entityManager.find(CitaMedica.class, id);
    }

    @Override
    public void actualizar(CitaMedica citaMedica) {
       this.entityManager.merge(citaMedica);
    }

    @Override
    public void eliminar(Integer id) {
        this.entityManager.remove(this.seleccionar(id));
    }

}
