package presentacion.controlador;

import contexto.Contexto;
import presentacion.comando.Comando;
import presentacion.comando.factoria.FactoriaComando;
import presentacion.despachadorVista.DespachadorVista;


/**
 * La implementación por defecto del controlador.
 */
public class ControladorImp extends Controlador
{
    @Override
    public void accion(Contexto contexto)
    {
        FactoriaComando factoriaComando = FactoriaComando.getInstancia();
        Comando comando = factoriaComando.getComando(contexto.getEvento());
        Contexto contextoResultado = comando.ejecutar(contexto.getInfo());
        DespachadorVista.getInstancia().despachar(contextoResultado);
    }
}
