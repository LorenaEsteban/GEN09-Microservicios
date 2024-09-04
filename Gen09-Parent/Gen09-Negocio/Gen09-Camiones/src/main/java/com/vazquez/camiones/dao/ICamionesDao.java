package com.vazquez.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vazquez.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long>{

}
