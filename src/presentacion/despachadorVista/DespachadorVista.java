package presentacion.despachadorVista;

import contexto.Contexto;

/**
 * Mapeador contexto - vista
 */
public abstract class DespachadorVista
{
    private static DespachadorVista instancia; // La instancia del singleton

    /**
     * Crea una nueva instancia del singleton de ser necesario y la devuelve.
     *
     * @return la instancia del singleton.
     */
    public static DespachadorVista getInstancia()
    {
        if (instancia == null)
           instancia = new DespachadorVistaImp();

        return instancia;
    }

    /**
     * Despacha entre vistas.
     *
     * @param contexto: el contexto para actualizar las vistas.
     */
    public abstract void despachar(Contexto contexto);
}
