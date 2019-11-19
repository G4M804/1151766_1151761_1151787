package modeloVO;

import java.util.*;

public class AsignacionVO {
    private int codigoAsig;
    private int codigoClas;
    private int codigoCli;
    private Date fechaIn;
    private Date fechaFin;

    public AsignacionVO() {
    }

    public AsignacionVO(int codigoAsig, int codigoClas, int codigoCli, Date fechaIn, Date fechaFin) {
        this.codigoAsig = codigoAsig;
        this.codigoClas = codigoClas;
        this.codigoCli = codigoCli;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
    }

    public int getCodigoAsig() {
        return codigoAsig;
    }

    public void setCodigoAsig(int codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public int getCodigoClas() {
        return codigoClas;
    }

    public void setCodigoClas(int codigoClas) {
        this.codigoClas = codigoClas;
    }

    public int getCodigoCli() {
        return codigoCli;
    }

    public void setCodigoCli(int codigoCli) {
        this.codigoCli = codigoCli;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
