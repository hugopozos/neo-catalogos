package com.neofactura.catalogos.application.controller;

import com.neofactura.catalogos.persistence.entity.Cfdi40ClavesUnidades;
import com.neofactura.catalogos.service.Cfdi40ClavesUnidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/claves-unidades")
@RequiredArgsConstructor
public class Cfdi40ClavesUnidadesController {

    private final Cfdi40ClavesUnidadesService clavesUnidadesService;

    @GetMapping("/{id}")
    public Cfdi40ClavesUnidades findById(@PathVariable String id) {
        return clavesUnidadesService.findById(id);
    }

    @GetMapping("/all")
    public List<Cfdi40ClavesUnidades> findAll() {
        return clavesUnidadesService.findAll();
    }

}
