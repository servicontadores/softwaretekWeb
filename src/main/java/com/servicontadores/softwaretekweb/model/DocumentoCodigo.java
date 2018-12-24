package com.servicontadores.softwaretekweb.model;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class DocumentoCodigo extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Audited
    private String codigo;

    @NotNull
    @Audited
    private String nombreMovimiento;

    @OneToOne
    private CuentaPUC cuentaPUC;

    @Audited
    private boolean habilitado;

}
