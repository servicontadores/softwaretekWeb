package com.servicontadores.softwaretekweb.helpers.FE.DTOs;
import lombok.Data;

import java.math.BigDecimal;

import java.text.DecimalFormat;
import java.util.List;
@Data
public class ActivosDTO {
    private String Nombre="";
    private double Cantidad;
    private double valorUnitario;
    private double subTotal;
    private Number total;
    private String Codigo="";
}
