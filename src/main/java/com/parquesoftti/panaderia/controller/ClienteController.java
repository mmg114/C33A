package com.parquesoftti.panaderia.controller;

import com.parquesoftti.panaderia.model.Cliente;
import com.parquesoftti.panaderia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api/client")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> getAllClients(){
        return ResponseEntity.ok(clienteService.getAllClients());
    }

    @GetMapping("/name")
    public Cliente getClientByName(@RequestParam String name){
        return clienteService.getClientByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        clienteService.deleteById(id);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.update(id,cliente);
    }


}
