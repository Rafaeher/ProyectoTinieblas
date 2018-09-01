package presentacion.despachadorVista;

import contexto.Contexto;
import presentacion.vista.Vista;
import presentacion.vista.factoria.FactoriaVista;

/**
 * Implementación por defecto de DespachadorVista.
 */
public class DespachadorVistaImp extends DespachadorVista
{
    private static Vista vista; // La vista mostrada actualemnte

    @Override
    public void despachar(Contexto contexto)
    {
        switch(contexto.getEvento())
        {
            case Empezar:
                vista = FactoriaVista.getInstancia().crearVista(contexto.getEvento());
                break;
            default:
                vista.actualizar(contexto);
                break;
        }
    }
}
