package com.parquesoftti.panaderia.repository;

import com.parquesoftti.panaderia.model.Cliente;
import com.parquesoftti.panaderia.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto, Long> {
}
