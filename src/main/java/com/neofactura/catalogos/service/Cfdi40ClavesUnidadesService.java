package com.neofactura.catalogos.service;

import com.neofactura.catalogos.persistence.entity.Cfdi40ClavesUnidades;

import java.util.List;

public interface Cfdi40ClavesUnidadesService {
    Cfdi40ClavesUnidades findById(String id);
    List<Cfdi40ClavesUnidades> findAll();
}
