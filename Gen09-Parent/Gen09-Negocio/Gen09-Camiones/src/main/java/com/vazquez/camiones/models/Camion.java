package com.vazquez.camiones.models;

import com.vazquez.camiones.enums.Marcas;
import com.vazquez.camiones.enums.Topos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "m2_camiones")
public class Camion {
//atributos
    //atributos
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
    @SequenceGenerator(sequenceName = "customer_seq1", allocationSize = 1, name = "CUST_SEQ1")

private Long id;
private String matricula;
private Topos tipoCamion;
private Integer modelo;
private Marcas marca;
private Integer capacidad;
private Double kilometraje;
private Boolean disponibilidad;



public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getMatricula() {
    return matricula;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public Topos getTipoCamion() {
    return tipoCamion;
}
public void setTipoCamion(Topos tipoCamion) {
    this.tipoCamion = tipoCamion;
}
public Integer getModelo() {
    return modelo;
}
public void setModelo(Integer modelo) {
    this.modelo = modelo;
}
public Marcas getMarca() {
    return marca;
}
public void setMarca(Marcas marca) {
    this.marca = marca;
}
public Integer getCapacidad() {
    return capacidad;
}
public void setCapacidad(Integer capacidad) {
    this.capacidad = capacidad;
}
public Double getKilometraje() {
    return kilometraje;
}
public void setKilometraje(Double kilometraje) {
    this.kilometraje = kilometraje;
}
public Boolean getDisponibilidad() {
    return disponibilidad;
}
public void setDisponibilidad(Boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
}


}
