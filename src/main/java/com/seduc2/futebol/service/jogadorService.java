package com.seduc2.futebol.service;

import com.seduc2.futebol.entity.jogador;
import com.seduc2.futebol.repository.jogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jogadorService {

    @Autowired
    private jogadorRepository repo;

    public List<jogador> listar() {
        return repo.findAll();
    }

    public jogador salvar(jogador j) {
        return repo.save(j);
    }

}