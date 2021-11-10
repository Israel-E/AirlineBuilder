package com.company.monitor;

import com.company.product.Vuelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Monitor {
    private List<Vuelo> salidas;
    private List<Vuelo> llegadas;
    private Date date;
    private String ENCABEZADO_SALIDAS = "\nHora\tAereolinea\tVuelo\tDestino\t\tH.Est.\tPuerta\tObservación";
    private String ENCABEZADO_LLEGADAS = "\nHora\tAereolinea\tVuelo\tProcedencia\tH.Lle.\tCinta\tObservación";

    public Monitor() {
        this.salidas = new ArrayList<>();
        this.llegadas = new ArrayList<>();
        this.date = new Date();
    }

    public void addSalida(Vuelo vuelo) {
        this.salidas.add(vuelo);
    }

    public void addLlegada(Vuelo vuelo) {
        this.llegadas.add(vuelo);
    }

    public String getSalidas() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n___________________________________________________________________________");
        sb.append("\nSalidas\tDate: " + this.date.toString());
        sb.append(ENCABEZADO_SALIDAS);
        sb.append(listarVuelos(this.salidas));

        return sb.toString();
    }

    public String getLLegadas() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n___________________________________________________________________________");
        sb.append("\nLlegadas\tDate: " + this.date.toString());
        sb.append(ENCABEZADO_LLEGADAS);
        sb.append(listarVuelos(this.llegadas));

        return sb.toString();
    }

    public String getSalidasLLegadas() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSalidas());
        sb.append(getLLegadas());

        return sb.toString();
    }

    public String listarVuelos(List<Vuelo> vuelos) {
        StringBuilder sb = new StringBuilder();
        for(Vuelo vuelo : vuelos) {
            sb.append("\n" + vuelo.getHora().getDescripcion() +
                    "\t" + vuelo.getAereolinea().getDescripcion() +
                    "\t" + vuelo.getCodigoVuelo().getDescripcion() +
                    "\t" + vuelo.getCiudad().getDescripcion() +
                    "\t" + vuelo.getHoraEstLlegada().getDescripcion() +
                    "\t" + vuelo.getPuertaCinta().getDescripcion() +
                    "\t\t" + vuelo.getObservacion().getDescripcion());
        }
        return sb.toString();
    }
}
