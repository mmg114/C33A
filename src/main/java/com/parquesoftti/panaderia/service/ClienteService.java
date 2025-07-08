package com.parquesoftti.panaderia.service;

import com.parquesoftti.panaderia.model.Cliente;
import com.parquesoftti.panaderia.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@AllArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    //buscar todos los Clientes
    @Transactional(readOnly = true)
    public List<Cliente> getAllClients(){
        return clienteRepository.findAll();
    }

    public Cliente getClientByName(String name) {
        return clienteRepository.findByNombre(name);
    }

    //Buscar por nombre de cliente



    //Crear un cliente

    //Actualizacion de cliente

    //Borre un cliente

}
