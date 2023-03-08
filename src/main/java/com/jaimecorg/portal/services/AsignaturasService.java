package com.jaimecorg.portal.services;

import java.util.List;

import com.jaimecorg.portal.model.Asignatura;

public interface AsignaturasService {

    public List<Asignatura> findAll();

    public Asignatura findByID(int id);

    public Asignatura insert(Asignatura asignatura);

    public void update(Asignatura asignatura);

    public void delete(int id);
}
