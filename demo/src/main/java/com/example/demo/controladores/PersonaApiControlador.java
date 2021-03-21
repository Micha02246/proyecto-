/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controladores;

import com.example.demo.modelos.Persona;
import com.example.demo.servicios.PersonaServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael
 * ws=webservice
 */
@RestController
@RequestMapping(value="/ws/mostrar")
public class PersonaApiControlador {
    @Autowired
    private PersonaServicios servicio;
    
    @GetMapping(value="/")
    public List<Persona> getTodos(){
    return servicio.getTodos();
    }
    
}
