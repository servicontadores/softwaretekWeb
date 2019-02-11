package com.servicontadores.softwaretekweb.helpers.FE.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class MovimientosDTO {
    private ComprobanteDTO comprobante;
    private SucursalDTO sucursal;
    private EmisorDTO emisor;
    private ReceptorDTO receptor;
    private List<ActivosDTO>detalles;
    private TotalesDTO Totales;

}
