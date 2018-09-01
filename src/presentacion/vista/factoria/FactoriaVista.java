package presentacion.vista.factoria;

import contexto.Evento;
import presentacion.vista.Vista;

/**
 * Factoría abstracta de vistas.
 */
public abstract class FactoriaVista
{
    private static FactoriaVista instancia; // La instancia del singleton

    /**
     * Crea la instancia del singleton de ser necesario y la devuelve.
     *
     * @return la instancia del singleton.
     */
    public synchronized static FactoriaVista getInstancia()
    {
        if (instancia == null)
            instancia = new FactoriaVistaImp();

        return instancia;
    }

    /**
     * Crea la Vista dependiendo de la evento.
     *
     * @return Vista correspondiente a la evento.
     */
    public abstract Vista crearVista(Evento evento);
}
