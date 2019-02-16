package com.servicontadores.softwaretekweb.helpers.FE.DTOs;
import lombok.Data;

import java.util.List;

@Data
public class TotalesDTO {
    private double Total;
    private double subTotal;
    private double IVA;
    private List<ImpuestosDTO> impuestos;
}
