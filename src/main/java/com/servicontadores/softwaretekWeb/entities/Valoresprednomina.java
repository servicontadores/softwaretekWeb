/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicontadores.softwaretekWeb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author yesidherrera
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Valoresprednomina.findAll", query = "SELECT v FROM Valoresprednomina v")})
public class Valoresprednomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cody;
    private Integer salMin;
    private Integer auxTransp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 15, scale = 5)
    private Double porcParaFisSENA;
    @Column(precision = 15, scale = 5)
    private Double porcParaFisICBF;
    @Column(precision = 15, scale = 5)
    private Double porcParaFisCCF;
    @Column(precision = 15, scale = 5)
    private Double porcSSSaludEmpleado;
    @Column(precision = 15, scale = 5)
    private Double porcSSSaludEmpresa;
    @Column(precision = 15, scale = 5)
    private Double porcPensionEmpleado;
    @Column(precision = 15, scale = 5)
    private Double porcPensionEmpresa;
    @Column(precision = 15, scale = 5)
    private Double porcCesantia;
    @Column(precision = 15, scale = 5)
    private Double porcPrimaServ;
    @Column(precision = 15, scale = 5)
    private Double porcVacacion;
    @Column(precision = 15, scale = 5)
    private Double porcIntSobCesant;
    @Column(precision = 15, scale = 5)
    private Double porcOtrosESAP;
    @Column(precision = 15, scale = 5)
    private Double porcOtrosEscInd;
    @Column(precision = 15, scale = 5)
    private Double porcFSPM416;
    private Integer sm4;
    private Integer sm16;
    @Column(precision = 15, scale = 5)
    private Double porcFSP1617;
    private Integer sm161;
    private Integer sm17;
    @Column(precision = 15, scale = 5)
    private Double porcFSP1718;
    private Integer sm171;
    private Integer sm18;
    @Column(precision = 15, scale = 5)
    private Double porcFSP1819;
    private Integer sm181;
    private Integer sm19;
    @Column(precision = 15, scale = 5)
    private Double porcFSP1920;
    private Integer sm191;
    private Integer sm20;
    @Column(precision = 15, scale = 5)
    private Double porcFSPM20;
    private Integer sm201;
    @Column(precision = 15, scale = 5)
    private Double porcRecargoNocturno;
    @Column(precision = 15, scale = 5)
    private Double porcHorExtraDiurna;
    @Column(precision = 15, scale = 5)
    private Double porcHorExtraNocturna;
    @Column(precision = 15, scale = 5)
    private Double porcHoraOrdDominical;
    @Column(precision = 15, scale = 5)
    private Double porcExtraDiurnaDom;
    @Column(precision = 15, scale = 5)
    private Double porcExtraNocturnoDom;
    private Integer valUVT;
    private Integer rangoUVTd1;
    private Integer rangoUVTh1;
    private Integer rangoUVTd2;
    private Integer rangoUVTh2;
    private Integer rangoUVTd3;
    private Integer rangoUVTh3;
    private Integer rangoUVTd4;
    @Column(precision = 15, scale = 5)
    private Double tarMarg1;
    @Column(precision = 15, scale = 5)
    private Double tarMarg2;
    @Column(precision = 15, scale = 5)
    private Double tarMarg3;
    @Column(precision = 15, scale = 5)
    private Double tarMarg4;
    private Integer punAdic1;
    private Integer punAdic2;
    private Integer punAdic3;
    private Integer punAdic4;
    @Column(precision = 15, scale = 5)
    private Double porcHoraExtra;
    @Basic(optional = false)
    @Column(nullable = false)
    private int iBCSalud;
    @Basic(optional = false)
    @Column(nullable = false)
    private int iBCPension;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcarp;
    @Basic(optional = false)
    @Column(nullable = false)
    private int iBCCesantias;
    @Basic(optional = false)
    @Column(nullable = false)
    private int iBCIntCesantias;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcpfccf;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcpficbf;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcpfsena;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcprimas;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ibcrtft;
    @Basic(optional = false)
    @Column(nullable = false)
    private int iBCVacaciones;
    @Basic(optional = false)
    @Column(name = "ODBCFIX_FLDAUTO", nullable = false)
    private int odbcfixFldauto;

    public Valoresprednomina() {
    }

    public Valoresprednomina(Integer cody) {
        this.cody = cody;
    }

    public Valoresprednomina(Integer cody, int iBCSalud, int iBCPension, int ibcarp, int iBCCesantias, int iBCIntCesantias, int ibcpfccf, int ibcpficbf, int ibcpfsena, int ibcprimas, int ibcrtft, int iBCVacaciones, int odbcfixFldauto) {
        this.cody = cody;
        this.iBCSalud = iBCSalud;
        this.iBCPension = iBCPension;
        this.ibcarp = ibcarp;
        this.iBCCesantias = iBCCesantias;
        this.iBCIntCesantias = iBCIntCesantias;
        this.ibcpfccf = ibcpfccf;
        this.ibcpficbf = ibcpficbf;
        this.ibcpfsena = ibcpfsena;
        this.ibcprimas = ibcprimas;
        this.ibcrtft = ibcrtft;
        this.iBCVacaciones = iBCVacaciones;
        this.odbcfixFldauto = odbcfixFldauto;
    }

    public Integer getCody() {
        return cody;
    }

    public void setCody(Integer cody) {
        this.cody = cody;
    }

    public Integer getSalMin() {
        return salMin;
    }

    public void setSalMin(Integer salMin) {
        this.salMin = salMin;
    }

    public Integer getAuxTransp() {
        return auxTransp;
    }

    public void setAuxTransp(Integer auxTransp) {
        this.auxTransp = auxTransp;
    }

    public Double getPorcParaFisSENA() {
        return porcParaFisSENA;
    }

    public void setPorcParaFisSENA(Double porcParaFisSENA) {
        this.porcParaFisSENA = porcParaFisSENA;
    }

    public Double getPorcParaFisICBF() {
        return porcParaFisICBF;
    }

    public void setPorcParaFisICBF(Double porcParaFisICBF) {
        this.porcParaFisICBF = porcParaFisICBF;
    }

    public Double getPorcParaFisCCF() {
        return porcParaFisCCF;
    }

    public void setPorcParaFisCCF(Double porcParaFisCCF) {
        this.porcParaFisCCF = porcParaFisCCF;
    }

    public Double getPorcSSSaludEmpleado() {
        return porcSSSaludEmpleado;
    }

    public void setPorcSSSaludEmpleado(Double porcSSSaludEmpleado) {
        this.porcSSSaludEmpleado = porcSSSaludEmpleado;
    }

    public Double getPorcSSSaludEmpresa() {
        return porcSSSaludEmpresa;
    }

    public void setPorcSSSaludEmpresa(Double porcSSSaludEmpresa) {
        this.porcSSSaludEmpresa = porcSSSaludEmpresa;
    }

    public Double getPorcPensionEmpleado() {
        return porcPensionEmpleado;
    }

    public void setPorcPensionEmpleado(Double porcPensionEmpleado) {
        this.porcPensionEmpleado = porcPensionEmpleado;
    }

    public Double getPorcPensionEmpresa() {
        return porcPensionEmpresa;
    }

    public void setPorcPensionEmpresa(Double porcPensionEmpresa) {
        this.porcPensionEmpresa = porcPensionEmpresa;
    }

    public Double getPorcCesantia() {
        return porcCesantia;
    }

    public void setPorcCesantia(Double porcCesantia) {
        this.porcCesantia = porcCesantia;
    }

    public Double getPorcPrimaServ() {
        return porcPrimaServ;
    }

    public void setPorcPrimaServ(Double porcPrimaServ) {
        this.porcPrimaServ = porcPrimaServ;
    }

    public Double getPorcVacacion() {
        return porcVacacion;
    }

    public void setPorcVacacion(Double porcVacacion) {
        this.porcVacacion = porcVacacion;
    }

    public Double getPorcIntSobCesant() {
        return porcIntSobCesant;
    }

    public void setPorcIntSobCesant(Double porcIntSobCesant) {
        this.porcIntSobCesant = porcIntSobCesant;
    }

    public Double getPorcOtrosESAP() {
        return porcOtrosESAP;
    }

    public void setPorcOtrosESAP(Double porcOtrosESAP) {
        this.porcOtrosESAP = porcOtrosESAP;
    }

    public Double getPorcOtrosEscInd() {
        return porcOtrosEscInd;
    }

    public void setPorcOtrosEscInd(Double porcOtrosEscInd) {
        this.porcOtrosEscInd = porcOtrosEscInd;
    }

    public Double getPorcFSPM416() {
        return porcFSPM416;
    }

    public void setPorcFSPM416(Double porcFSPM416) {
        this.porcFSPM416 = porcFSPM416;
    }

    public Integer getSm4() {
        return sm4;
    }

    public void setSm4(Integer sm4) {
        this.sm4 = sm4;
    }

    public Integer getSm16() {
        return sm16;
    }

    public void setSm16(Integer sm16) {
        this.sm16 = sm16;
    }

    public Double getPorcFSP1617() {
        return porcFSP1617;
    }

    public void setPorcFSP1617(Double porcFSP1617) {
        this.porcFSP1617 = porcFSP1617;
    }

    public Integer getSm161() {
        return sm161;
    }

    public void setSm161(Integer sm161) {
        this.sm161 = sm161;
    }

    public Integer getSm17() {
        return sm17;
    }

    public void setSm17(Integer sm17) {
        this.sm17 = sm17;
    }

    public Double getPorcFSP1718() {
        return porcFSP1718;
    }

    public void setPorcFSP1718(Double porcFSP1718) {
        this.porcFSP1718 = porcFSP1718;
    }

    public Integer getSm171() {
        return sm171;
    }

    public void setSm171(Integer sm171) {
        this.sm171 = sm171;
    }

    public Integer getSm18() {
        return sm18;
    }

    public void setSm18(Integer sm18) {
        this.sm18 = sm18;
    }

    public Double getPorcFSP1819() {
        return porcFSP1819;
    }

    public void setPorcFSP1819(Double porcFSP1819) {
        this.porcFSP1819 = porcFSP1819;
    }

    public Integer getSm181() {
        return sm181;
    }

    public void setSm181(Integer sm181) {
        this.sm181 = sm181;
    }

    public Integer getSm19() {
        return sm19;
    }

    public void setSm19(Integer sm19) {
        this.sm19 = sm19;
    }

    public Double getPorcFSP1920() {
        return porcFSP1920;
    }

    public void setPorcFSP1920(Double porcFSP1920) {
        this.porcFSP1920 = porcFSP1920;
    }

    public Integer getSm191() {
        return sm191;
    }

    public void setSm191(Integer sm191) {
        this.sm191 = sm191;
    }

    public Integer getSm20() {
        return sm20;
    }

    public void setSm20(Integer sm20) {
        this.sm20 = sm20;
    }

    public Double getPorcFSPM20() {
        return porcFSPM20;
    }

    public void setPorcFSPM20(Double porcFSPM20) {
        this.porcFSPM20 = porcFSPM20;
    }

    public Integer getSm201() {
        return sm201;
    }

    public void setSm201(Integer sm201) {
        this.sm201 = sm201;
    }

    public Double getPorcRecargoNocturno() {
        return porcRecargoNocturno;
    }

    public void setPorcRecargoNocturno(Double porcRecargoNocturno) {
        this.porcRecargoNocturno = porcRecargoNocturno;
    }

    public Double getPorcHorExtraDiurna() {
        return porcHorExtraDiurna;
    }

    public void setPorcHorExtraDiurna(Double porcHorExtraDiurna) {
        this.porcHorExtraDiurna = porcHorExtraDiurna;
    }

    public Double getPorcHorExtraNocturna() {
        return porcHorExtraNocturna;
    }

    public void setPorcHorExtraNocturna(Double porcHorExtraNocturna) {
        this.porcHorExtraNocturna = porcHorExtraNocturna;
    }

    public Double getPorcHoraOrdDominical() {
        return porcHoraOrdDominical;
    }

    public void setPorcHoraOrdDominical(Double porcHoraOrdDominical) {
        this.porcHoraOrdDominical = porcHoraOrdDominical;
    }

    public Double getPorcExtraDiurnaDom() {
        return porcExtraDiurnaDom;
    }

    public void setPorcExtraDiurnaDom(Double porcExtraDiurnaDom) {
        this.porcExtraDiurnaDom = porcExtraDiurnaDom;
    }

    public Double getPorcExtraNocturnoDom() {
        return porcExtraNocturnoDom;
    }

    public void setPorcExtraNocturnoDom(Double porcExtraNocturnoDom) {
        this.porcExtraNocturnoDom = porcExtraNocturnoDom;
    }

    public Integer getValUVT() {
        return valUVT;
    }

    public void setValUVT(Integer valUVT) {
        this.valUVT = valUVT;
    }

    public Integer getRangoUVTd1() {
        return rangoUVTd1;
    }

    public void setRangoUVTd1(Integer rangoUVTd1) {
        this.rangoUVTd1 = rangoUVTd1;
    }

    public Integer getRangoUVTh1() {
        return rangoUVTh1;
    }

    public void setRangoUVTh1(Integer rangoUVTh1) {
        this.rangoUVTh1 = rangoUVTh1;
    }

    public Integer getRangoUVTd2() {
        return rangoUVTd2;
    }

    public void setRangoUVTd2(Integer rangoUVTd2) {
        this.rangoUVTd2 = rangoUVTd2;
    }

    public Integer getRangoUVTh2() {
        return rangoUVTh2;
    }

    public void setRangoUVTh2(Integer rangoUVTh2) {
        this.rangoUVTh2 = rangoUVTh2;
    }

    public Integer getRangoUVTd3() {
        return rangoUVTd3;
    }

    public void setRangoUVTd3(Integer rangoUVTd3) {
        this.rangoUVTd3 = rangoUVTd3;
    }

    public Integer getRangoUVTh3() {
        return rangoUVTh3;
    }

    public void setRangoUVTh3(Integer rangoUVTh3) {
        this.rangoUVTh3 = rangoUVTh3;
    }

    public Integer getRangoUVTd4() {
        return rangoUVTd4;
    }

    public void setRangoUVTd4(Integer rangoUVTd4) {
        this.rangoUVTd4 = rangoUVTd4;
    }

    public Double getTarMarg1() {
        return tarMarg1;
    }

    public void setTarMarg1(Double tarMarg1) {
        this.tarMarg1 = tarMarg1;
    }

    public Double getTarMarg2() {
        return tarMarg2;
    }

    public void setTarMarg2(Double tarMarg2) {
        this.tarMarg2 = tarMarg2;
    }

    public Double getTarMarg3() {
        return tarMarg3;
    }

    public void setTarMarg3(Double tarMarg3) {
        this.tarMarg3 = tarMarg3;
    }

    public Double getTarMarg4() {
        return tarMarg4;
    }

    public void setTarMarg4(Double tarMarg4) {
        this.tarMarg4 = tarMarg4;
    }

    public Integer getPunAdic1() {
        return punAdic1;
    }

    public void setPunAdic1(Integer punAdic1) {
        this.punAdic1 = punAdic1;
    }

    public Integer getPunAdic2() {
        return punAdic2;
    }

    public void setPunAdic2(Integer punAdic2) {
        this.punAdic2 = punAdic2;
    }

    public Integer getPunAdic3() {
        return punAdic3;
    }

    public void setPunAdic3(Integer punAdic3) {
        this.punAdic3 = punAdic3;
    }

    public Integer getPunAdic4() {
        return punAdic4;
    }

    public void setPunAdic4(Integer punAdic4) {
        this.punAdic4 = punAdic4;
    }

    public Double getPorcHoraExtra() {
        return porcHoraExtra;
    }

    public void setPorcHoraExtra(Double porcHoraExtra) {
        this.porcHoraExtra = porcHoraExtra;
    }

    public int getIBCSalud() {
        return iBCSalud;
    }

    public void setIBCSalud(int iBCSalud) {
        this.iBCSalud = iBCSalud;
    }

    public int getIBCPension() {
        return iBCPension;
    }

    public void setIBCPension(int iBCPension) {
        this.iBCPension = iBCPension;
    }

    public int getIbcarp() {
        return ibcarp;
    }

    public void setIbcarp(int ibcarp) {
        this.ibcarp = ibcarp;
    }

    public int getIBCCesantias() {
        return iBCCesantias;
    }

    public void setIBCCesantias(int iBCCesantias) {
        this.iBCCesantias = iBCCesantias;
    }

    public int getIBCIntCesantias() {
        return iBCIntCesantias;
    }

    public void setIBCIntCesantias(int iBCIntCesantias) {
        this.iBCIntCesantias = iBCIntCesantias;
    }

    public int getIbcpfccf() {
        return ibcpfccf;
    }

    public void setIbcpfccf(int ibcpfccf) {
        this.ibcpfccf = ibcpfccf;
    }

    public int getIbcpficbf() {
        return ibcpficbf;
    }

    public void setIbcpficbf(int ibcpficbf) {
        this.ibcpficbf = ibcpficbf;
    }

    public int getIbcpfsena() {
        return ibcpfsena;
    }

    public void setIbcpfsena(int ibcpfsena) {
        this.ibcpfsena = ibcpfsena;
    }

    public int getIbcprimas() {
        return ibcprimas;
    }

    public void setIbcprimas(int ibcprimas) {
        this.ibcprimas = ibcprimas;
    }

    public int getIbcrtft() {
        return ibcrtft;
    }

    public void setIbcrtft(int ibcrtft) {
        this.ibcrtft = ibcrtft;
    }

    public int getIBCVacaciones() {
        return iBCVacaciones;
    }

    public void setIBCVacaciones(int iBCVacaciones) {
        this.iBCVacaciones = iBCVacaciones;
    }

    public int getOdbcfixFldauto() {
        return odbcfixFldauto;
    }

    public void setOdbcfixFldauto(int odbcfixFldauto) {
        this.odbcfixFldauto = odbcfixFldauto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cody != null ? cody.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoresprednomina)) {
            return false;
        }
        Valoresprednomina other = (Valoresprednomina) object;
        if ((this.cody == null && other.cody != null) || (this.cody != null && !this.cody.equals(other.cody))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Valoresprednomina[ cody=" + cody + " ]";
    }
    
}
