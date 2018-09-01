package negocio.servicioAplicacion.factoria;

import negocio.servicioAplicacion.ServicioAplicacion;

/**
 * Factoría abstracta para crear servicios de aplicación.
 */
public abstract class FactoriaSA
{
    private static FactoriaSA instancia; // La instancia del singleton

    /**
     * Crea una nueva instancia del singleton si es necesario y la devuelve.
     *
     * @returns la instancia del singleton
     */
    public static FactoriaSA getInstancia()
    {
        if(instancia == null)
            instancia = new FactoriaSAImp();

        return instancia;
    }

    /**
     * Obtiene el servicio de aplicación
     *
     * @return el servicio de aplicación.
     */
    public abstract ServicioAplicacion getSA();
}
