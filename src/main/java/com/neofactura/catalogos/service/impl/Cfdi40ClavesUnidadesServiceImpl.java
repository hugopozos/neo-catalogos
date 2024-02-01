package com.neofactura.catalogos.service.impl;

import com.neofactura.catalogos.persistence.entity.Cfdi40ClavesUnidades;
import com.neofactura.catalogos.persistence.repository.Cfdi40ClavesUnidadesRepository;
import com.neofactura.catalogos.service.Cfdi40ClavesUnidadesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Cfdi40ClavesUnidadesServiceImpl implements Cfdi40ClavesUnidadesService {

    private final Cfdi40ClavesUnidadesRepository repository;

    public Cfdi40ClavesUnidades findById(String id) {
        Optional<Cfdi40ClavesUnidades> optional = repository.findById(id);
        return optional.orElse(null);
    }

    public List<Cfdi40ClavesUnidades> findAll() {
        return repository.findAll();
    }

}
