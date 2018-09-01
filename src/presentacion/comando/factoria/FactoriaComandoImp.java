package presentacion.comando.factoria;

import contexto.Evento;
import presentacion.comando.Comando;
import presentacion.comando.ComandoVampiroAleatorio;

/**
 * The implementation of the abstract factoria of commands using dynamic load.
 */
public class FactoriaComandoImp extends FactoriaComando
{

    @Override
    public Comando getComando(Evento evento)
    {
        switch(evento)
        {
            case GenerarVampiroAleatorio:
                return new ComandoVampiroAleatorio();

                default:
                    return null;
        }
    }
}
