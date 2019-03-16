package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.RegistroSituaciones_Repositorio;
import com.helloworld.apispring.model.dao.Situaciones_Repositorio;
import com.helloworld.apispring.model.entity.registrosituaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroSituaciones_Servicio {
    
     @Autowired
    private RegistroSituaciones_Repositorio RegistroSituaciones_Repositorio;

    public RegistroSituaciones_Servicio() {
    }

    public List<registrosituaciones> getRegistro() {
        return RegistroSituaciones_Repositorio.getRegistroSituaciones();
    }

    public long registroEvento(registrosituaciones registroEvento) {
      return RegistroSituaciones_Repositorio.crearEvento(registroEvento);
      
    }
    
      List<registrosituaciones> getEventosId(int id) {
        return (List<registrosituaciones>) RegistroSituaciones_Repositorio.eventosIdCiudadano(id);
    }
   
    
}
