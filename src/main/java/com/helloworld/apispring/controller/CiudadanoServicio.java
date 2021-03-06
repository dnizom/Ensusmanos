/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.CiudadanoRepositorio;
import com.helloworld.apispring.model.entity.Ciudadano;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CiudadanoServicio {
    
    @Autowired
    private CiudadanoRepositorio ciudadanoRepositorio;
    
    public CiudadanoServicio()
    {
        
    }
    
    public Long registrarCiudadano(Ciudadano ciudadano)
    {
        return ciudadanoRepositorio.registrarCuidadano(ciudadano);
    }
    
    public Ciudadano obtenerCiudadanoPorId(long id)
    {
        return ciudadanoRepositorio.obtenerCiudadanoPorId(id);
    }
    
    public List<Ciudadano> obtenerCiudadanos()
    {
        return ciudadanoRepositorio.obtenerCiudadanos();
    }
    
}
