package com.servicontadores.softwaretekweb.helpers.FE.DTOs;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * DTO que representa el encabezado de comprobante.
 */
@Data
public class ComprobanteDTO {

    private String TipoComprobante;
    private String Fecha;
    private String Serie;
    private String Folio;
    private String Moneda;
    private String Referencia;
    private String ConceptoRef;
    private String Observaciones;
    private List<NombreValorDTO> Descripcion;
    private List<CodigoValorDTO> MetodoPago;

}
