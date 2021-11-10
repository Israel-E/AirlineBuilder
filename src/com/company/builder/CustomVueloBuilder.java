package com.company.builder;

import com.company.parts.CodigoVuelo;
import com.company.parts.Hora;
import com.company.parts.HoraEstLlegada;
import com.company.parts.PuertaCinta;
import com.company.parts.aereolinea.Aereolinea;
import com.company.parts.ciudad.Ciudad;
import com.company.parts.observacion.Observacion;
import com.company.product.Vuelo;

public class CustomVueloBuilder {
    private Vuelo vuelo;

    public CustomVueloBuilder() {
        this.vuelo = new Vuelo();
    }

    public Vuelo getResult() {
        return this.vuelo;
    }

    public CustomVueloBuilder append(Hora hora) {
        this.vuelo.setHora(hora);
        return this;
    }

    public CustomVueloBuilder append(Aereolinea aereolinea) {
        this.vuelo.setAereolinea(aereolinea);
        return this;
    }

    public CustomVueloBuilder append(CodigoVuelo codigoVuelo) {
        this.vuelo.setCodigoVuelo(codigoVuelo);
        return this;
    }

    public CustomVueloBuilder append(Ciudad ciudad) {
        this.vuelo.setCiudad(ciudad);
        return this;
    }

    public CustomVueloBuilder append(HoraEstLlegada horaEstLlegada) {
        this.vuelo.setHoraEstLlegada(horaEstLlegada);
        return this;
    }

    public CustomVueloBuilder append(PuertaCinta puertaCinta) {
        this.vuelo.setPuertaCinta(puertaCinta);
        return this;
    }

    public CustomVueloBuilder append(Observacion observacion) {
        this.vuelo.setObservacion(observacion);
        return this;
    }
}
