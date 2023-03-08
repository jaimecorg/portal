// package com.jaimecorg.portal.services.impl;

// import java.util.Arrays;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// import com.jaimecorg.portal.model.Alumno;
// import com.jaimecorg.portal.model.Asignatura;
// import com.jaimecorg.portal.services.AlumnosService;
// import com.jaimecorg.portal.services.AsignaturasService;

// @Service
// public class AsignaturasServiceImpl implements AsignaturasService{

//     @Value("${url.matriculacion.rest.service}")
//     String urlMatriculacion;

//     @Autowired
//     RestTemplate restTemplate;

//     @Override
//     public List<Asignatura> findAll() {
        
//         Asignatura[] al = restTemplate.getForObject(urlMatriculacion + "asignaturas", Asignatura[].class);
//         List<Asignatura> asignaturas = Arrays.asList(al);

//         return asignaturas;
//     }

//     @Override
//     public Asignatura findByID(int id) {
//         Alumno al = restTemplate.getForObject(urlMatriculacion + "asignaturas/" + id, Asignatura.class);

//         return al;
//     }

//     @Override
//     public Asignatura insert(Asignatura asignatura) {
//         Asignatura al = restTemplate.postForObject(urlMatriculacion + "asignaturas", asignatura, Asignatura.class);

//         return al;
//     }

//     @Override
//     public void update(Asignatura asignatura) {
//         restTemplate.put(urlMatriculacion + "asignaturas/" + asignatura.getId(), asignatura);
//     }

//     @Override
//     public void delete(int id) {
//         restTemplate.delete(urlMatriculacion + "alumnos/" + id);
        
//     }
    
// }
