package presentacion.comando;

import contexto.Contexto;
import contexto.Evento;
import negocio.servicioAplicacion.ServicioAplicacion;
import negocio.servicioAplicacion.factoria.FactoriaSA;
import utils.Pair;

/**
 * Comando para solicitar a negocio que genere un vampiro aleatorizar.
 */
public class ComandoVampiroAleatorio implements Comando
{

    @Override
    public Contexto ejecutar(Object info)
    {
        FactoriaSA factoriaSA = FactoriaSA.getInstancia();
        ServicioAplicacion sa = factoriaSA.getSA();
        Contexto contexto = sa.generaVampiroAleatorio(new Pair<>("Crónica", 15));
        Contexto contextoRetorno;

        switch(contexto.getEvento())
        {
            default: contextoRetorno = contexto;
        }

        return contextoRetorno;
    }
}
