package com.jaimecorg.portal.services.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jaimecorg.portal.model.Alumno;
import com.jaimecorg.portal.services.AlumnosService;

@Service
public class AlumnosServiceImpl implements AlumnosService{

    @Value("${url.matriculacion.rest.service}")
    String urlMatriculacion;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Alumno> findAll() {
        
        Alumno[] al = restTemplate.getForObject(urlMatriculacion + "alumnos", Alumno[].class);
        List<Alumno> alumnos = Arrays.asList(al);

        return alumnos;
    }

    @Override
    public Alumno findByID(int id) {
        Alumno al = restTemplate.getForObject(urlMatriculacion + "alumnos/" + id, Alumno.class);

        return al;
    }

    @Override
    public Alumno insert(Alumno alumno) {
        Alumno al = restTemplate.postForObject(urlMatriculacion + "alumnos", alumno, Alumno.class);

        return al;
    }

    @Override
    public void update(Alumno alumno) {
        restTemplate.put(urlMatriculacion + "alumnos/" + alumno.getId(), alumno);
    }

    @Override
    public void delete(int id) {
        restTemplate.delete(urlMatriculacion + "alumnos/" + id);
        
    }
    
}
