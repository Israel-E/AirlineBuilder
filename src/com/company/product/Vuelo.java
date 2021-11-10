package com.company.product;

import com.company.parts.CodigoVuelo;
import com.company.parts.Hora;
import com.company.parts.HoraEstLlegada;
import com.company.parts.PuertaCinta;
import com.company.parts.aereolinea.Aereolinea;
import com.company.parts.ciudad.Ciudad;
import com.company.parts.observacion.Observacion;

public class Vuelo {
    private Hora hora;
    private Aereolinea aereolinea;
    private CodigoVuelo codigoVuelo;
    private Ciudad ciudad;
    private HoraEstLlegada horaEstLlegada;
    private PuertaCinta puertaCinta;
    private Observacion observacion;

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public CodigoVuelo getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(CodigoVuelo codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Aereolinea getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(Aereolinea aereolinea) {
        this.aereolinea = aereolinea;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public HoraEstLlegada getHoraEstLlegada() {
        return horaEstLlegada;
    }

    public void setHoraEstLlegada(HoraEstLlegada horaEstLlegada) {
        this.horaEstLlegada = horaEstLlegada;
    }

    public PuertaCinta getPuertaCinta() {
        return puertaCinta;
    }

    public void setPuertaCinta(PuertaCinta puertaCinta) {
        this.puertaCinta = puertaCinta;
    }

    public Observacion getObservacion() {
        return observacion;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }
}
