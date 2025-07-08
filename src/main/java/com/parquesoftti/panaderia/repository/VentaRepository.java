package com.parquesoftti.panaderia.repository;

import com.parquesoftti.panaderia.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
 /*
    //select * from ventas where cantidad = :PCantidad
        Venta findBycantidad(Long cantidad);
        //ORM
      @Query("select max(v.id) from Venta v")
      Long findMaxId();
         //Nativa
   @Query(name = "select * from venta",nativeQuery = true)
         Venta findVenta();*/
}
