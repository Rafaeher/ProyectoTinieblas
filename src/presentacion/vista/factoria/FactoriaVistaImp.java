package presentacion.vista.factoria;

import contexto.Evento;
import presentacion.vista.Vista;
import presentacion.vista.VistaFicha;

/**
 * Implementación por defecto de FactoriaVista
 */
public class FactoriaVistaImp extends FactoriaVista
{
    @Override
    public Vista crearVista(Evento evento)
    {

        switch(evento)
        {
            default: return new VistaFicha();
        }
    }
}
