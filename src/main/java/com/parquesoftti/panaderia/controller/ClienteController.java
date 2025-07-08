package com.parquesoftti.panaderia.controller;

import com.parquesoftti.panaderia.model.Cliente;
import com.parquesoftti.panaderia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api/client")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping()
    public List<Cliente> getAllClients(){
        return clienteService.getAllClients();
    }
}
