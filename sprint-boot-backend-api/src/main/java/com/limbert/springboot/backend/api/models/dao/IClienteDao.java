package com.limbert.springboot.backend.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.limbert.springboot.backend.api.models.entity.Cliente;



public interface IClienteDao extends CrudRepository<Cliente, Long>{

}

