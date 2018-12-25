package com.servicontadores.softwaretekweb.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class FormaPago extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String codigoFormaPago;

    @NotNull
    private String nombreFormaPago;

    @NotNull
    @OneToOne
    private CuentaPUC cuentaPUC;

}
