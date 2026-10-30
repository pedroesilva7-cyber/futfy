package com.seduc2.futebol.controller;

import com.seduc2.futebol.entity.jogador;
import com.seduc2.futebol.service.jogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
@CrossOrigin(origins = "*")
public class jogadorController {

    @Autowired
    private jogadorService service;

    @GetMapping
    public List<jogador> listar() {
        return service.listar();
    }

    @PostMapping
    public jogador salvar(@RequestBody jogador j) {
        return service.salvar(j);
    }



}