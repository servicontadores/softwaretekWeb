package com.servicontadores.softwaretekweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Empresa extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String codigoEmpresa;

    @NotNull
    private String nombreEmpresa;

    @NotNull
    private boolean habilitado;

}
