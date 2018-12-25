package com.servicontadores.softwaretekweb.model;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class DocumentoDetalle extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Audited
    private int sucursalId;

    @NotNull
    @Audited
    private int cdcId;

    @NotNull
    @Audited
    private int bodegaId;

    @NotNull
    @OneToOne
    private DocumentoCodigo documentoCodigo;

    @NotNull
    @Audited
    private int nitId;

    @NotNull
    @Audited
    private int nit2Id;

    @OneToOne
    private CuentaPUC cuentaPUCDebito;

    @OneToOne
    private CuentaPUC cuentaPUCCredito;

    @NotNull
    @Audited
    private double vrBruto = 0;

    @NotNull
    @Audited
    private double pDescuento = 0;

    @NotNull
    @Audited
    private double pImpuesto1 = 0;

    @NotNull
    @Audited
    private double pImpuesto2 = 0;

    @NotNull
    @Audited
    private double pImpuesto3 = 0;

    @NotNull
    @Audited
    private double pImpuesto4 = 0;

    @NotNull
    @Audited
    private double pImpuesto5 = 0;

    @NotNull
    @Audited
    private double pRetencion1 = 0;

    @NotNull
    @Audited
    private double pRetencion2 = 0;

    @NotNull
    @Audited
    private double pRetencion3 = 0;

    @NotNull
    @Audited
    private double pRetencion4 = 0;

    @NotNull
    @Audited
    private double pRetencion5 = 0;

}
