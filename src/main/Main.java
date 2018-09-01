package main;

import contexto.Contexto;
import contexto.Evento;
import presentacion.despachadorVista.DespachadorVista;

public class Main
{

    public static void main(String[] args)
    {
        DespachadorVista despachadorVista = DespachadorVista.getInstancia();
        despachadorVista.despachar(new Contexto(Evento.Empezar, null));
    }
}
