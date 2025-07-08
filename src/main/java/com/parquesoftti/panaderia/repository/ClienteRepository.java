package com.parquesoftti.panaderia.repository;

import com.parquesoftti.panaderia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNombre(String name);
}
