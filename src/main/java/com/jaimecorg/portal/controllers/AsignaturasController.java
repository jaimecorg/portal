// package com.jaimecorg.portal.controllers;

// import java.io.IOException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.servlet.ModelAndView;

// import com.jaimecorg.portal.model.Alumno;
// import com.jaimecorg.portal.services.AlumnosService;
// import com.jaimecorg.portal.services.AsignaturasService;

// @Controller
// @RequestMapping("/alumnos")
// public class AsignaturasController {

//     @Autowired
//     AsignaturasService asignaturasService;

//     @GetMapping(value = "/list")
//     public ModelAndView listPage(Model model) {

//         List<Alumno> alumnos = alumnosService.findAll();

//         ModelAndView modelAndView = new ModelAndView("alumnos/list");
//         modelAndView.addObject("alumnos", alumnos);

//         return modelAndView;
//     }

//     @GetMapping(value = "/create")
//     public ModelAndView create(Alumno alumno) {

//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.addObject("alumno", new Alumno());
//         modelAndView.setViewName("alumnos/create");

//         return modelAndView;
//     }

//     @PostMapping(path = "/save")
//     public ModelAndView save(Alumno alumno) throws IOException {

//         Alumno ca = alumnosService.insert(alumno);

//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.setViewName("redirect:edit/" + ca.getId());

//         return modelAndView;
//     }

//     @GetMapping(path = { "/edit/{id}" })
//     public ModelAndView edit(
//             @PathVariable(name = "id", required = true) int id) {

//         Alumno alumno = alumnosService.findByID(id);

//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.addObject("alumno", alumno);
//         modelAndView.setViewName("alumnos/edit");
//         return modelAndView;
//     }

//     @PostMapping(path = { "/update" })
//     public ModelAndView update(Alumno alumno) {

//         alumnosService.update(alumno);

//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.setViewName("redirect:edit/" + alumno.getId());

//         return modelAndView;
//     }

//     @GetMapping(path = { "/delete/{id}" })
//     public ModelAndView delete(
//             @PathVariable(name = "id", required = true) int id) {

//         alumnosService.delete(id);

//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.setViewName("redirect:/alumnos/list");

//         return modelAndView;
//     }

// }
