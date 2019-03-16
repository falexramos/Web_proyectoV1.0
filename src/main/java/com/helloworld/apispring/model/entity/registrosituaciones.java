package com.helloworld.apispring.model.entity;

import com.helloworld.apispring.model.entity.situaciones;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "registrosituaciones")
public class registrosituaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRegistroSituaciones")
    private Integer idRegistroSituaciones;
    
    @ManyToOne
    @JoinColumn(name = "IdCiudadano", referencedColumnName = "IdCiudadano")
    private ciudadanos Ciudadano;
    
    @ManyToOne
    @JoinColumn(name = "IdSituacion", referencedColumnName = "IdSituacion")
    private situaciones idSituacion;

    public registrosituaciones() {
    }

    public registrosituaciones(Integer idRegistroSituaciones) {
        this.idRegistroSituaciones = idRegistroSituaciones;
    }

    public Integer getIdRegistroSituaciones() {
        return idRegistroSituaciones;
    }

    public void setIdRegistroSituaciones(Integer idRegistroSituaciones) {
        this.idRegistroSituaciones = idRegistroSituaciones;
    }

    public ciudadanos getIdCiudadano() {
        return Ciudadano;
    }

    public void setIdCiudadano(ciudadanos idCiudadano) {
        this.Ciudadano = idCiudadano;
    }

    public situaciones getIdSituacion() {
        return idSituacion;
    }

    public void setIdSituacion(situaciones idSituacion) {
        this.idSituacion = idSituacion;
    }

}
