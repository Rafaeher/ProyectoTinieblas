package presentacion.controlador;

import contexto.Contexto;

/**
 * El controlador de aplicación del programa.
 */
public abstract class Controlador
{
    private static Controlador instancia; // La instancia del singleton

    /**
     * Crea una instancia del controlador de ser necesario y la devuelve.
     *
     * @return la instancia del singleton.
     */
    public static Controlador getInstancia()
    {
        if(instancia == null)
            instancia = new ControladorImp();

        return instancia;
    }

    /**
     * Realiza una acción dependiendo del contexto.
     *
     * @param contexto: el contexto para llevar a cabo la acción.
     */
    public abstract void accion(Contexto contexto);
}
