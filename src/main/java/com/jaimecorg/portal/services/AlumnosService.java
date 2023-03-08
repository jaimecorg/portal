package com.jaimecorg.portal.services;

import java.util.List;

import com.jaimecorg.portal.model.Alumno;

public interface AlumnosService {

    public List<Alumno> findAll();

    public Alumno findByID(int id);

    public Alumno insert(Alumno alumno);

    public void update(Alumno alumno);

    public void delete(int id);
}
