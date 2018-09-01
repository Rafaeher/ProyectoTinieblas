package negocio.servicioAplicacion.factoria;

import negocio.servicioAplicacion.ServicioAplicacion;

/**
 * Implementación por defecto de la FactoriaSA
 */
public class FactoriaSAImp extends FactoriaSA
{
    @Override
    public ServicioAplicacion getSA()
    {
        return new ServicioAplicacion();
    }
}
