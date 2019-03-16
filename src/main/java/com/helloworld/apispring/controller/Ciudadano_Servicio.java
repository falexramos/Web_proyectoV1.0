package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.Ciudadano_Repositorio;
import com.helloworld.apispring.model.entity.ciudadanos;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ciudadano_Servicio {

    @Autowired
    private Ciudadano_Repositorio Ciudadano_Repositorio;

    public Ciudadano_Servicio() {
    }

    // TRAER TODOS LOS CIUDADANOS
    public List<ciudadanos> getCiudadanos() {
        return Ciudadano_Repositorio.getCiudadanos();
    }

    public long crearPersona(ciudadanos Ciudadano) {
        return Ciudadano_Repositorio.crearPersona(Ciudadano);
    }

   
     List<ciudadanos> getCiudadanoPorId(int id) {
        return (List<ciudadanos>) Ciudadano_Repositorio.ciudadnosPorId(id);
    }
   
}
