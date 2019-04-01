package com.servicontadores.softwaretekweb.controllers;

import com.google.gson.Gson;
import com.servicontadores.softwaretekweb.helpers.FE.DTOs.*;
import javassist.expr.Cast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.ParseException;
import javax.persistence.Convert;
import javax.persistence.EntityManager;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import java.util.Date;

@Controller
public class FECtrl {

    @Autowired
    EntityManager entityManager;

    @GetMapping("/json")
    @ResponseBody
    public String getJson() {

        Integer numFactura=21;

        List<Object[]> results = entityManager.createNativeQuery("SELECT facturarmovimientodiario.Sys_CreationDate AS Fecha,conceptosproductos.Prefijo AS Serie,facturarmovimientodiario.NoDocumento AS Folio,'COP' AS Moneda,facturarmovimientodiario.NoFacturaDevolucion AS Referencia,facturarmovimientodiario.Detal AS Observaciones,facturarmovimientodiario.Plazo AS FechaVencimiento,sucursales.NombreSucursal AS SucursalFactura,vendedor.Codigo AS DocumentoVendedor,facturarmovimientodiario.CodigoFormaPago,formaspago.FormaPago,sucursales.NombreSucursal,'' AS TipoJson,'' AS Sistema,sucursales.Direccion AS DireccionSucursal,'COP' AS PaisSucursal,'' AS EmailSucursal,'' AS DepartmentSuc,'' AS CitySubdivisionNameSuc,'' AS CityNameSuc,sucursales.NIT AS IdentificacionEmisor,vistanit.tipodocumento AS TipoIdentificacionEmisor,vistanit.NombreCompleto AS RazonSocialEmisor,vistanit.NombreCompleto AS NombreComercialEmisor,sucursales.Direccion AS DireccionEmisor,'CO' AS PaisEmisor,vistanit.CorreoEMail AS EmailEmisor,'' AS DepartmentEmisor,'' AS CitySubdivisionNameEmisor,'' AS CityNameEmisor,sucursales.Telefono AS TelefonoEmisor,facturarmovimientodiario.NIT AS Identificacion,nit.tipodocumento AS TipoIdentificacion,nit.NombreCompleto AS RazonSocial,nit.NombreCompleto AS NombreComercial,nit.Direccion AS DireccionReceptor,pais.CodigoDIAN AS Pais,nit.CorreoEMail AS Email,departamento.NombreDepartamento AS Department,municipio.NombreMunicipio AS CitySubdivisionName,municipio.NombreMunicipio AS CityName,'' AS SectorEmpresarial,nit.Telefono AS Telefono,facturarmovimientodiario.Total,conceptosproductos.TipoMovimiento,conceptosproductos.esSubconcepto,conceptosproductos.Grupo,conceptosproductos.AnularFactura FROM facturarmovimientodiario INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto INNER JOIN sucursales ON facturarmovimientodiario.CodigoSucursal = sucursales.Codigo INNER JOIN formaspago ON facturarmovimientodiario.CodigoFormaPago = formaspago.Codigo INNER JOIN nit ON facturarmovimientodiario.NIT = nit.Codigo INNER JOIN vendedor ON facturarmovimientodiario.CodigoVendedor = vendedor.CodigoVendedor INNER JOIN municipio ON nit.codigomunicipio = municipio.CodigoMunicipio INNER JOIN pais ON nit.codigopais = pais.CodigoPais INNER JOIN departamento ON nit.codigodepartamento = departamento.CodigoDepartamento AND departamento.CodigoDepartamento = municipio.CodigoDepartamento INNER JOIN vistanit ON sucursales.NIT = vistanit.Codigo WHERE facturarmovimientodiario.NoDocumento=" +numFactura+" AND conceptosproductos.FacturacionElectronica = -1 AND facturarmovimientodiario.Estado <> 'ELIMINADO'").getResultList();
        List<Object[]> results2 = entityManager.createNativeQuery("SELECT productos.Descripcion AS Producto,inventariodiario.Cantidad2 AS Cantidad,Round(inventariodiario.PVrBruto2) AS ValorUnitario,Round(inventariodiario.Pbase * inventariodiario.Cantidad2) AS SubTotal,Round(inventariodiario.PVrTotalGen) AS Total,inventariodiario.CodigoProducto AS Codigo,inventariodiario.PIVA,Round(inventariodiario.PVrIVA * inventariodiario.Cantidad2) AS valorIva,Round(inventariodiario.PVrDescuento * inventariodiario.Cantidad2) AS valorDescuento,inventariodiario.PRetefuente AS PorcentajeRTE,round((inventariodiario.pretefuente/100)*(inventariodiario.pbase * inventariodiario.Cantidad2)) AS ReteFuente,inventariodiario.PReteIVA AS PorcentajeReteIva,round((preteiva/100)*(((inventariodiario.piva/100)*(inventariodiario.pbase*inventariodiario.cantidad2))*inventariodiario.Cantidad2)) AS valorReteIva,round((inventariodiario.preteIca/100)*(inventariodiario.pbase * inventariodiario.Cantidad2)) AS valorReteICA,inventariodiario.PReteICA AS PorcentajeReteICA,inventariodiario.PImpoConsumo,round((inventariodiario.pImpoconsumo/100)*(inventariodiario.pbase * inventariodiario.Cantidad2)) AS VrPImpoConsumo,inventariodiario.Detalle,facturarmovimientodiario.Total AS granTotal,Round(facturarmovimientodiario.Base) AS GranSubTotal,Round(facturarmovimientodiario.IVA) AS ivaTotal,inventariodiario.PReteCREE,round((inventariodiario.preteCREE/100)*(inventariodiario.pbase * inventariodiario.Cantidad2)) AS ValorReteCREE,conceptosproductos.TipoMovimiento FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit = inventariodiario.ImpP INNER JOIN productos ON inventariodiario.CodigoProducto = productos.CODIGO INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 AND facturarmovimientodiario.Estado <> 'ELIMINADO'").getResultList();
        List<Object[]> impuestosIVA = entityManager.createNativeQuery("SELECT facturarmovimientodiario.NoDocumento,Sum(ROUND(inventariodiario.PIVA/100*(inventariodiario.pbase*inventariodiario.Cantidad2))) AS valorIva,inventariodiario.PIVA AS porcentajeIva FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit = inventariodiario.ImpP INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND facturarmovimientodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 GROUP BY facturarmovimientodiario.NoDocumento,inventariodiario.PIVA").getResultList();
        List<Object[]> impuestosImpC = entityManager.createNativeQuery("SELECT inventariodiario.PImpoConsumo,Sum(round((inventariodiario.pImpoconsumo/100)*(inventariodiario.pbase * inventariodiario.Cantidad2))) AS valorImpoConsumo FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit = inventariodiario.ImpP INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND facturarmovimientodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 GROUP BY inventariodiario.PImpoConsumo").getResultList();
        List<Object[]>impuestosRTE=entityManager.createNativeQuery("SELECT inventariodiario.PRetefuente,Sum(round((inventariodiario.pretefuente/100)*(inventariodiario.pbase * inventariodiario.Cantidad2))) AS valorRetefuente FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit =inventariodiario.ImpP INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND facturarmovimientodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 GROUP BY inventariodiario.PRetefuente").getResultList();
        List<Object[]>impuestosRteIVA=entityManager.createNativeQuery("SELECT inventariodiario.PReteIVA,Sum(round((preteiva/100)*(((inventariodiario.piva/100)*(inventariodiario.pbase*inventariodiario.cantidad2))*inventariodiario.Cantidad2))) AS valorReteIVA FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit =inventariodiario.ImpP INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND facturarmovimientodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 GROUP BY inventariodiario.PReteIVA").getResultList();
        List<Object[]>impuestosRteICA=entityManager.createNativeQuery("SELECT inventariodiario.PReteICA,Sum(round((inventariodiario.preteIca/100)*(inventariodiario.pbase * inventariodiario.Cantidad2))) AS valorReteica FROM facturarmovimientodiario INNER JOIN inventariodiario ON facturarmovimientodiario.Regedit =inventariodiario.ImpP INNER JOIN conceptosproductos ON conceptosproductos.Codigo = facturarmovimientodiario.CodigoConcepto WHERE facturarmovimientodiario.NoDocumento ="+numFactura+" AND inventariodiario.Estado <> 'ELIMINADO' AND facturarmovimientodiario.Estado <> 'ELIMINADO' AND conceptosproductos.FacturacionElectronica = -1 GROUP BY inventariodiario.PReteICA").getResultList();

        //Variables de Encabezado
        Date FechaVenc = new Date();
        String Fecha="";
        String Serie = "";
        Integer Folio = 0;
        String Moneda = "COP";
        Integer Referencia=0;
        String Observaciones = "";
        Integer plazo = 0;
        String SucursalFactura = "";
        Integer CodigoFormaPago = 0;
        String codigoFormaPagoDian = "";
        String FormaPago = "";
        String nombreSucursal = "";
        String DirSucursal = "";
        String paisSucursal = "";
        String emailSucursal = "";
        String DtoSucursal = "";
        String citySubSucursal = "";
        String citySucursal = "";
        String identificacionEmisor = "";
        String tipoIdEmisor = "";
        String razonSocialEmisor = "";
        String nombreComercialEmisor = "";
        String direccionEmisor = "";
        String paisEmisor = "";
        String departamentoEmisor = "";
        String emailEmisor = "";
        String citySubEmisor = "";
        String cityEmisor = "";
        String telEmisor = "";
        String identificacionReceptor = "";
        String tipoIdReceptor = "";
        String razonSocialReceptor = "";
        String nombreComercialReceptor = "";
        String direccionReceptor = "";
        String paisReceptor = "";
        String departamentoReceptor = "";
        String emailReceptor = "";
        String citySubReceptor = "";
        String cityReceptor = "";
        String telReceptor = "";
        double totalFactura=0;
        String tipoMovimiento="";
        Boolean esSubconcepto=false;
        int grupoConcepto=0;
        boolean anularFactura=false;



        //Variables de subDetalles
        String producto = "";
        double Cantidad = 0;
        double valorUnitario = 0;
        double subTotal = 0;
        Number total = 0;
        String Codigo = "";
        double pIva = 0;
        Number valorIVA = 0;
        double valorDescuento = 0;
        double porcentajeRTE = 0;
        double valorRTE = 0;
        double porcentajeRTIVA = 0;
        double valorRTIVA = 0;
        double porcentajeRTICA = 0;
        double valorRTICA = 0;
        double porcentajeImpC = 0;
        double valorImpC = 0;
        String detalleProducto = "";
        double granTotal = 0;
        double granSubTotal = 0;
        double ivaTotal = 0;
        double porcentajeRteCREE = 0;
        double valorRteCREE = 0;

        Number totalImp01 = 0;

        for (Object[] record : results) {
            FechaVenc = (Date) record[0];
            Fecha = (String) record[0].toString();
            Serie = (String) record[1];
            Folio = (Integer) record[2];
            Moneda = (String) record[3];
            Referencia = (Integer) record[4];
            Observaciones = (String) record[5];
            plazo = (Integer) record[6];
            SucursalFactura = (String) record[7];
            CodigoFormaPago = (Integer) record[9];
            FormaPago = (String) record[10];
            nombreSucursal = (String) record[11];
            DirSucursal = (String) record[14];
            paisSucursal = (String) record[15];
            emailSucursal = (String) record[16];
            DtoSucursal = (String) record[17];
            citySubSucursal = (String) record[18];
            citySucursal = (String) record[19];
            identificacionEmisor = (String) record[20];
            tipoIdEmisor = (String) record[21];
            razonSocialEmisor = (String) record[22];
            nombreComercialEmisor = (String) record[23];
            direccionEmisor = (String) record[24];
            paisEmisor = (String) record[25];
            emailEmisor = (String) record[26];
            departamentoEmisor = (String) record[27];
            citySubEmisor = (String) record[28];
            cityEmisor = (String) record[29];
            telEmisor = (String) record[30];

            identificacionReceptor = (String) record[31];
            tipoIdReceptor = (String) record[32];
            razonSocialReceptor = (String) record[33];
            nombreComercialReceptor = (String) record[34];
            direccionReceptor = (String) record[35];
            paisReceptor = (String) record[36];
            emailReceptor = (String) record[37];
            departamentoReceptor = (String) record[38];
            citySubReceptor = (String) record[39];
            cityReceptor = (String) record[40];
            telReceptor = (String) record[41];
            totalFactura=(double) record[43];
            tipoMovimiento=(String) record[44];
            esSubconcepto=(Boolean) record[45];
            grupoConcepto=(int) record[46];
            anularFactura=(Boolean) record[47];

        }

        /* Encabezado subDetalles */
        List<ActivosDTO> listaActivos = new ArrayList<>();
        ActivosDTO Activos = new ActivosDTO();

        TotalesDTO Totales = new TotalesDTO();


        for (Object[] record : results2) {
            producto = (String) record[0];
            Cantidad = (double) record[1];
            valorUnitario = (double) record[2];
            subTotal = (double) record[3];
            total = (Number) record[4];
            Codigo = (String) record[5];
            pIva = (Double) record[6];
            valorIVA = (Number) record[7];
            valorDescuento = (double) record[8];
            porcentajeRTE = (double) record[9];
            valorRTE = (double) record[10];
            porcentajeRTIVA = (double) record[11];
            valorRTIVA = (double) record[12];
            valorRTICA = (double) record[13];
            porcentajeRTICA = (double) record[14];
            porcentajeImpC = (double) record[15];
            valorImpC = (double) record[16];
            detalleProducto = (String) record[17];
            granTotal = (double) record[18];
            granSubTotal = (double) record[19];
            ivaTotal = (double) record[20];
            porcentajeRteCREE = (double) record[21];
            valorRteCREE = (double) record[22];


            Activos.setNombre(producto);
            Activos.setCantidad(Cantidad);
            Activos.setValorUnitario(valorUnitario);
            Activos.setSubTotal(subTotal);
            Activos.setTotal(total);
            Activos.setCodigo(Codigo);

            List<ImpuestosDTO> listaImpuestos = new ArrayList<>();
            ImpuestosDTO Impuestos = new ImpuestosDTO();

            List<NombreValorDTO> listaDescripcion = new ArrayList<>();
            NombreValorDTO Descripcion = new NombreValorDTO();

            if (pIva != 0) {


                if (pIva == 19) {
                    Impuestos.setImpuesto("01");
                } else if (pIva == 5) {
                    Impuestos.setImpuesto("0A");
                }

                Impuestos.setNombre("VALOR TOTAL DE IVA AL " + pIva + "%");
                Impuestos.setPorcentaje(pIva);
                Impuestos.setTotalImp(valorIVA);
                listaImpuestos.add(Impuestos);
                Activos.setImpuestos(listaImpuestos);
                Impuestos = new ImpuestosDTO();

            }

            if (porcentajeImpC != 0) {

                Impuestos.setImpuesto("03");
                Impuestos.setNombre("VALOR TOTAL DE IMPUESTO AL CONSUMO ");
                Impuestos.setPorcentaje(porcentajeImpC);
                Impuestos.setTotalImp(valorImpC);
                listaImpuestos.add(Impuestos);
                Activos.setImpuestos(listaImpuestos);
                Impuestos = new ImpuestosDTO();
            }

                if(porcentajeRTE !=0) {

                    if(porcentajeRTE ==3.5){
                        Impuestos.setImpuesto("0B");
                    }else if(porcentajeRTE ==1.5){
                        Impuestos.setImpuesto("0C");
                    }else {Impuestos.setImpuesto("05");}

                    Impuestos.setNombre("RETENCION EN LA FUENTE POR RENTA ");
                    Impuestos.setPorcentaje(porcentajeRTE);
                    Impuestos.setTotalImp(valorRTE);
                    listaImpuestos.add(Impuestos);
                    Activos.setImpuestos(listaImpuestos);
                    Impuestos=new ImpuestosDTO();
                }

                if(porcentajeRTIVA !=0){
                    Impuestos.setImpuesto("06");
                    Impuestos.setNombre("RETENCION EN LA FUENTE POR IVA ");
                    Impuestos.setPorcentaje(porcentajeRTIVA);
                    Impuestos.setTotalImp(valorRTIVA);
                    listaImpuestos.add(Impuestos);
                    Activos.setImpuestos(listaImpuestos);
                    Impuestos=new ImpuestosDTO();
                }

                if(porcentajeRTICA !=0){
                    Impuestos.setImpuesto("07");
                    Impuestos.setNombre("RETENCION EN LA FUENTE POR ICA ");
                    Impuestos.setPorcentaje(porcentajeRTICA);
                    Impuestos.setTotalImp(valorRTICA);
                    listaImpuestos.add(Impuestos);
                    Activos.setImpuestos(listaImpuestos);
                    Impuestos=new ImpuestosDTO();
                }

            /*if(porcentajeRteCREE !=0){
                Impuestos.setImpuesto("xx");
                Impuestos.setNombre("CREE ");
                Impuestos.setPorcentaje(porcentajeRteCREE);
                Impuestos.setTotalImp(valorRteCREE);
                listaImpuestos.add(Impuestos);
                Activos.setImpuestos(listaImpuestos);
                Impuestos=new ImpuestosDTO();
            }*/


            Descripcion.setNombre("Descuento");
            Descripcion.setValor((String.valueOf(valorDescuento)));
            listaDescripcion.add(Descripcion);
            Descripcion = new NombreValorDTO();

            Descripcion.setNombre("Observaciones");

            if (detalleProducto == null) {
                Descripcion.setValor(".");
            } else {
                Descripcion.setValor(detalleProducto);
            }


            listaDescripcion.add(Descripcion);
            Activos.setDescripcion(listaDescripcion);

            listaActivos.add(Activos);
            Activos = new ActivosDTO();


        }

        /*** Extraer la fecha de vencimiento ***/
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(FechaVenc);
        Integer time = Calendar.DAY_OF_MONTH;
        Integer temp = calendario.get(time);
        calendario.set(time, temp + plazo);
        Date fechaVen = calendario.getTime();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String fechaVencimiento = form.format(fechaVen);


        // SE CREA OBJETO DTO Y SE ESTABLECEN SUS VALORES.

        /* Encabezado Comprobante */

        ComprobanteDTO comprobante = new ComprobanteDTO();
        comprobante.setFecha(Fecha.toString());
        comprobante.setSerie(Serie);
        comprobante.setFolio(Folio.toString());
        comprobante.setMoneda(Moneda);

        if(tipoMovimiento.equals("DEVOLUCION") && grupoConcepto==20){

            comprobante.setTipoComprobante("04");
            comprobante.setReferencia(Referencia.toString());
            comprobante.setConceptoRef("1");
        }
            else if(tipoMovimiento.equals("VENTA") && grupoConcepto==20 && anularFactura==true)
                    {comprobante.setTipoComprobante("04");
                     comprobante.setReferencia(Referencia.toString());
                     comprobante.setConceptoRef("2");
                    }
                        else if(tipoMovimiento.equals("NOTA CONTABLE CLIENTE")&& grupoConcepto==20)
                                {comprobante.setTipoComprobante("04");
                                 comprobante.setReferencia(Referencia.toString());
                                 comprobante.setConceptoRef("6");}

                                else if(tipoMovimiento.equals("NOTA CONTABLE CLIENTE")&& grupoConcepto==21){
                                        comprobante.setTipoComprobante("05");
                                        comprobante.setReferencia(Referencia.toString());
                                        comprobante.setConceptoRef("3");}

                                        else if(esSubconcepto==false && tipoMovimiento.equals("VENTA"))
                                                {comprobante.setTipoComprobante("01");
                                                comprobante.setReferencia("");
                                                comprobante.setConceptoRef(""); }



        comprobante.setObservaciones("");

        List<NombreValorDTO> listaDescripcionCte = new ArrayList<>();
        NombreValorDTO descripcion = new NombreValorDTO();

        descripcion.setNombre("Fecha Vencimiento");
        descripcion.setValor(fechaVencimiento);
        listaDescripcionCte.add(descripcion);

        descripcion = new NombreValorDTO();
        descripcion.setNombre("Orden Compra Cliente");
        descripcion.setValor("");
        listaDescripcionCte.add(descripcion);

        descripcion = new NombreValorDTO();
        descripcion.setNombre("Sucursal Factura");
        descripcion.setValor(SucursalFactura);
        listaDescripcionCte.add(descripcion);

        descripcion = new NombreValorDTO();
        descripcion.setNombre("Sucursal Cliente");
        descripcion.setValor("");
        listaDescripcionCte.add(descripcion);

        comprobante.setDescripcion(listaDescripcionCte);


        List<CodigoValorDTO> listaMetodoPago = new ArrayList<>();
        CodigoValorDTO metodoPago = new CodigoValorDTO();

        if (CodigoFormaPago == 1) {
            codigoFormaPagoDian = "10";
        }


        metodoPago.setCodigo(codigoFormaPagoDian);
        metodoPago.setValor(FormaPago);

        listaMetodoPago.add(metodoPago);

        comprobante.setMetodoPago(listaMetodoPago);


        /* Encabezado de Sucursal */

        SucursalDTO Sucursal = new SucursalDTO();
        Sucursal.setGuid("");
        Sucursal.setNombre(nombreSucursal);
        Sucursal.setTipoJson("");
        Sucursal.setSistema("");
        Sucursal.setDireccion(DirSucursal);
        Sucursal.setPais(paisSucursal);
        Sucursal.setEmail(emailSucursal);
        Sucursal.setDepartment(DtoSucursal);
        Sucursal.setCityName(citySucursal);
        Sucursal.setCitySubdivisionName(citySubSucursal);



        /* Encabezado del Emisor */

        EmisorDTO emisor = new EmisorDTO();
        emisor.setIdentificacion(identificacionEmisor);
        emisor.setTipoIdentificacion(tipoIdEmisor);
        emisor.setRazonSocial(razonSocialEmisor);
        emisor.setNombreComercial(nombreComercialEmisor);
        emisor.setDireccion(direccionEmisor);
        emisor.setPais(paisEmisor);
        emisor.setEmail(emailEmisor);
        emisor.setDepartment(departamentoEmisor);
        emisor.setCitySubdivisionName(citySubEmisor);
        emisor.setCityName(cityEmisor);

        List<NombreValorDTO> listaDescripcionEmisor = new ArrayList<>();
        NombreValorDTO descripcionEmisor = new NombreValorDTO();
        descripcionEmisor.setNombre("Telefono");
        descripcionEmisor.setValor(telEmisor);
        listaDescripcionEmisor.add(descripcionEmisor);
        emisor.setDescripcion(listaDescripcionEmisor);


        /* Encabezado del Receptor */

        ReceptorDTO receptor = new ReceptorDTO();
        receptor.setIdentificacion(identificacionReceptor);
        receptor.setTipoIdentificacion(tipoIdReceptor);
        receptor.setRazonSocial(razonSocialReceptor);
        receptor.setNombreComercial(nombreComercialReceptor);
        receptor.setDireccion(direccionReceptor);
        receptor.setPais(paisReceptor);
        receptor.setEmail(emailReceptor);
        receptor.setDepartment(departamentoReceptor);
        receptor.setCitySubdivisionName(citySubReceptor);
        receptor.setCityName(cityReceptor);

        List<NombreValorDTO> listaDescripcionReceptor = new ArrayList<>();
        NombreValorDTO descripcionReceptor = new NombreValorDTO();
        descripcionReceptor.setNombre("Sector Empresarial");
        descripcionReceptor.setValor("");
        listaDescripcionReceptor.add(descripcionReceptor);

        descripcionReceptor = new NombreValorDTO();
        descripcionReceptor.setNombre("Telefono");
        descripcionReceptor.setValor(telReceptor);
        listaDescripcionReceptor.add(descripcionReceptor);
        receptor.setDescripcion(listaDescripcionReceptor);


        /** Sección de impuestos Totalizados **/
        Totales.setTotal(granTotal);
        Totales.setSubTotal(granSubTotal);
        Totales.setIVA(ivaTotal);

        List<ImpuestosDTO> impuestos = new ArrayList<>();
        ImpuestosDTO imp = new ImpuestosDTO();

        for (Object[] impIVA : impuestosIVA) {
            valorIVA = (Number) impIVA[1];
            pIva = (Double) impIVA[2];


            if (pIva != 0) {
                if (pIva == 19) {
                    imp.setImpuesto("01");
                } else if (pIva == 5) {
                    imp.setImpuesto("0A");
                }

                imp.setNombre("VALOR TOTAL DE IVA AL " + pIva + "%");
                imp.setPorcentaje(pIva);
                imp.setTotalImp(valorIVA);
                impuestos.add(imp);
                Totales.setImpuestos(impuestos);
                imp = new ImpuestosDTO();
            }
        }


        for (Object[] impImpoConsumo : impuestosImpC) {

            porcentajeImpC = (double) impImpoConsumo[0];
            valorImpC = (double) impImpoConsumo[1];

            if (porcentajeImpC != 0) {

                imp.setImpuesto("03");
                imp.setNombre("VALOR TOTAL DE IMPUESTO AL CONSUMO ");
                imp.setPorcentaje(porcentajeImpC);
                imp.setTotalImp(valorImpC);
                impuestos.add(imp);
                imp = new ImpuestosDTO();
            }
        }

        for (Object[] impRTE : impuestosRTE) {

            porcentajeRTE = (double) impRTE[0];
            valorRTE = (double) impRTE[1];

            if (porcentajeRTE != 0) {

                imp.setImpuesto("05");
                imp.setNombre("RETENCIÓN EN LA FUENTE POR RENTA");
                imp.setPorcentaje(porcentajeRTE);
                imp.setTotalImp(valorRTE);
                impuestos.add(imp);
                imp = new ImpuestosDTO();
            }
        }


        for (Object[] impRteIVA : impuestosRteIVA) {

            porcentajeRTIVA = (double) impRteIVA[0];
            valorRTIVA = (double) impRteIVA[1];

            if (porcentajeRTIVA != 0) {

                imp.setImpuesto("06");
                imp.setNombre("RETENCIÓN EN LA FUENTE POR IVA");
                imp.setPorcentaje(porcentajeRTIVA);
                imp.setTotalImp(valorRTIVA);
                impuestos.add(imp);
                imp = new ImpuestosDTO();
            }
        }

        for (Object[] impRteICA : impuestosRteICA) {

            porcentajeRTICA = (double) impRteICA[0];
            valorRTICA = (double) impRteICA[1];

            if (porcentajeRTICA != 0) {

                imp.setImpuesto("07");
                imp.setNombre("RETENCIÓN EN LA FUENTE POR ICA");
                imp.setPorcentaje(porcentajeRTICA);
                imp.setTotalImp(valorRTICA);
                impuestos.add(imp);
                imp = new ImpuestosDTO();
            }
        }





        /* Detalles del comprobante Final */

        List<NombreValorDTO>detalCtE=new ArrayList<>();
        NombreValorDTO Dto=new NombreValorDTO() ;

        Dto.setNombre("FVencimiento");
        Dto.setValor(fechaVencimiento);
        detalCtE.add(Dto);

        Dto=new NombreValorDTO();
        Dto.setNombre("FFactura");
        Dto.setValor(Fecha.toString());
        detalCtE.add(Dto);

        Dto=new NombreValorDTO();
        Dto.setNombre("Total_I");
        Dto.setValor(String.valueOf(totalFactura));
        detalCtE.add(Dto);



            /* Encebezado del Objeto DTO Global */

            MovimientosDTO movimientos = new MovimientosDTO();
            movimientos.setComprobante(comprobante);
            movimientos.setSucursal(Sucursal);
            movimientos.setEmisor(emisor);
            movimientos.setReceptor(receptor);
            movimientos.setDetalles(listaActivos);
            movimientos.setTotales(Totales);
            movimientos.setDetallesComprobante(detalCtE);

            Gson gson = new Gson();
            String jsonStr = gson.toJson(movimientos);
            return jsonStr;

        }


    }

