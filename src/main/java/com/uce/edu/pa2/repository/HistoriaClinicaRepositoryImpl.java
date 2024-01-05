package com.uce.edu.pa2.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.pa2.repository.modelo.HistoriaClinica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HistoriaClinicaRepositoryImpl implements IHistoriaClinicaRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(HistoriaClinica historiaClinica) {
        this.entityManager.persist(historiaClinica);
    }

    @Override
    public HistoriaClinica seleccionar(Integer id) {
        return this.entityManager.find(HistoriaClinica.class, id);
    }

    @Override
    public void actualizar(HistoriaClinica historiaClinica) {
       this.entityManager.merge(historiaClinica);
    }

    @Override
    public void eliminar(Integer id) {
       this.entityManager.remove(this.seleccionar(id));
    }


}
