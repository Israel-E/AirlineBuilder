package com.company;

import com.company.builder.CustomVueloBuilder;
import com.company.monitor.Monitor;
import com.company.parts.CodigoVuelo;
import com.company.parts.Hora;
import com.company.parts.HoraEstLlegada;
import com.company.parts.PuertaCinta;
import com.company.parts.aereolinea.Aereosur;
import com.company.parts.aereolinea.Boa;
import com.company.parts.aereolinea.Tam;
import com.company.parts.ciudad.Miami;
import com.company.parts.ciudad.PuntaCana;
import com.company.parts.observacion.*;

public class Client {
    public static void test() {
        Monitor monitor = new Monitor();

        CustomVueloBuilder chbSalida1 = new CustomVueloBuilder();
        chbSalida1.append(new Hora("07:15"));
        chbSalida1.append(new Boa());
        chbSalida1.append(new CodigoVuelo("P9 8009"));
        chbSalida1.append(new PuntaCana());
        chbSalida1.append(new HoraEstLlegada());
        chbSalida1.append(new PuertaCinta("29"));
        chbSalida1.append(new Demorado());

        CustomVueloBuilder chbSalida2 = new CustomVueloBuilder();
        chbSalida2.append(new Hora("07:45"));
        chbSalida2.append(new Aereosur());
        chbSalida2.append(new CodigoVuelo("AA 1558"));
        chbSalida2.append(new Miami());
        chbSalida2.append(new HoraEstLlegada("08:51"));
        chbSalida2.append(new PuertaCinta());
        chbSalida2.append(new Cerrado());

        CustomVueloBuilder chbSalida3 = new CustomVueloBuilder();
        chbSalida3.append(new Hora("09:10"));
        chbSalida3.append(new Tam());
        chbSalida3.append(new CodigoVuelo("LA 2377"));
        chbSalida3.append(new Miami());
        chbSalida3.append(new HoraEstLlegada("09:10"));
        chbSalida3.append(new PuertaCinta("32"));
        chbSalida3.append(new Embarque());

        CustomVueloBuilder chbSalida4 = new CustomVueloBuilder();
        chbSalida4.append(new Hora("09:25"));
        chbSalida4.append(new Aereosur());
        chbSalida4.append(new CodigoVuelo("P9 2418"));
        chbSalida4.append(new PuntaCana());
        chbSalida4.append(new HoraEstLlegada("09:15"));
        chbSalida4.append(new PuertaCinta("28"));
        chbSalida4.append(new UltimaLlamada());

        CustomVueloBuilder chbSalida5 = new CustomVueloBuilder();
        chbSalida5.append(new Hora("09:30"));
        chbSalida5.append(new Aereosur());
        chbSalida5.append(new CodigoVuelo("P9 609"));
        chbSalida5.append(new Miami());
        chbSalida5.append(new HoraEstLlegada("11:00"));
        chbSalida5.append(new PuertaCinta("26"));
        chbSalida5.append(new Llamada());

        monitor.addSalida(chbSalida1.getResult());
        monitor.addSalida(chbSalida2.getResult());
        monitor.addSalida(chbSalida3.getResult());
        monitor.addSalida(chbSalida4.getResult());
        monitor.addSalida(chbSalida5.getResult());

        System.out.println(monitor.getSalidas());

        CustomVueloBuilder chbLlegada1 = new CustomVueloBuilder();
        chbLlegada1.append(new Hora("09:25"));
        chbLlegada1.append(new Aereosur());
        chbLlegada1.append(new CodigoVuelo("VV 751"));
        chbLlegada1.append(new Miami());
        chbLlegada1.append(new HoraEstLlegada("09:29"));
        chbLlegada1.append(new PuertaCinta());
        chbLlegada1.append(new Confirmado());

        CustomVueloBuilder chbLlegada2 = new CustomVueloBuilder();
        chbLlegada2.append(new Hora("09:25"));
        chbLlegada2.append(new Tam());
        chbLlegada2.append(new CodigoVuelo("LA 2273"));
        chbLlegada2.append(new PuntaCana());
        chbLlegada2.append(new HoraEstLlegada("09:32"));
        chbLlegada2.append(new PuertaCinta());
        chbLlegada2.append(new Confirmado());

        CustomVueloBuilder chbLlegada3 = new CustomVueloBuilder();
        chbLlegada3.append(new Hora("09:30"));
        chbLlegada3.append(new Boa());
        chbLlegada3.append(new CodigoVuelo("LA 2191"));
        chbLlegada3.append(new Miami());
        chbLlegada3.append(new HoraEstLlegada("09:11"));
        chbLlegada3.append(new PuertaCinta("2"));
        chbLlegada3.append(new Confirmado());

        CustomVueloBuilder chbLlegada4 = new CustomVueloBuilder();
        chbLlegada4.append(new Hora("09:30"));
        chbLlegada4.append(new Aereosur());
        chbLlegada4.append(new CodigoVuelo("P9 231"));
        chbLlegada4.append(new Miami());
        chbLlegada4.append(new HoraEstLlegada("09:31"));
        chbLlegada4.append(new PuertaCinta());
        chbLlegada4.append(new Confirmado());

        CustomVueloBuilder chbLlegada5 = new CustomVueloBuilder();
        chbLlegada5.append(new Hora("10:10"));
        chbLlegada5.append(new Aereosur());
        chbLlegada5.append(new CodigoVuelo("P9 8131"));
        chbLlegada5.append(new Miami());
        chbLlegada5.append(new HoraEstLlegada());
        chbLlegada5.append(new PuertaCinta());
        chbLlegada5.append(new SinObservacion());

        monitor.addLlegada(chbLlegada1.getResult());
        monitor.addLlegada(chbLlegada2.getResult());
        monitor.addLlegada(chbLlegada3.getResult());
        monitor.addLlegada(chbLlegada4.getResult());
        monitor.addLlegada(chbLlegada5.getResult());

        System.out.println(monitor.getLLegadas());

        System.out.println();
        System.out.println();
        System.out.println("**********************Salidas y Llegas***********************");
        System.out.println(monitor.getSalidasLLegadas());
    }
}
