package com.servicontadores.softwaretekweb.helpers.FE.DTOs;

import lombok.Data;

@Data
public class MovimientosDTO {
    private ComprobanteDTO comprobante;
    private SucursalDTO sucursal;
    private EmisorDTO emisor;
    private ReceptorDTO receptor;
}
