package com.example.demo.controllers;


import com.example.demo.model.DatosConvenio;
import com.example.demo.repository.ConveniosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( path = "convenios")
public class ConveniosController {


    @Autowired
    private ConveniosRepository repo;

    @Autowired
    private Test test;


    @GetMapping
    public List<DatosConvenio> getConvenios(){
        return test.test();
    }


    @GetMapping(path = "/dos")
    public List<DatosConvenio> getConvenios3(){
        return repo.obt2();
    }


    @GetMapping(path = "/tres")
    public List<DatosConvenio> getConvenios2(){
        return repo.findAll();
    }

}
