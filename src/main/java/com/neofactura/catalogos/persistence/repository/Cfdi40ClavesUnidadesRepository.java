package com.neofactura.catalogos.persistence.repository;

import com.neofactura.catalogos.persistence.entity.Cfdi40ClavesUnidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cfdi40ClavesUnidadesRepository extends JpaRepository<Cfdi40ClavesUnidades, String> {
}
