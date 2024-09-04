package com.vazquez.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vazquez.rutas.models.Ruta;

public interface IRutasDao extends JpaRepository<Ruta, Long>{

}
