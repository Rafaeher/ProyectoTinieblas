package main;

import contexto.Contexto;
import contexto.Evento;
import presentacion.despachadorVista.DespachadorVista;
import presentacion.vista.Vista;
import presentacion.vista.VistaFicha;

public class MainTest
{
    public static void main(String args[])
    {
        //Vista vista = new VistaFicha();
        DespachadorVista.getInstancia().despachar(new Contexto(Evento.Empezar, ""));
    }
}
