package com.vazquez.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vazquez.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long>{

}
