package com.uce.edu.pa2.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.pa2.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Paciente paciente) {
       this.entityManager.persist(paciente);
    }

    @Override
    public Paciente seleccionar(Integer id) {
        return this.entityManager.find(Paciente.class, id);
    }

    @Override
    public void actualizar(Paciente paciente) {
      this.entityManager.merge(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        this.entityManager.remove(this.seleccionar(id));
    }

}
