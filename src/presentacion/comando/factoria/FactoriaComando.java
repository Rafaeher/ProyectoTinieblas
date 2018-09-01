package presentacion.comando.factoria;

import contexto.Evento;
import presentacion.comando.Comando;

/**
 * Factoría abstracta para obtener los comandos.
 */
public abstract class FactoriaComando
{
    private static FactoriaComando instancia; // La instancia del singleton

    /**
     * Crea la instancia del singleton de ser necesario y la devuelve.
     *
     * @return la instancia del singleton.
     */
    public static FactoriaComando getInstancia()
    {
        if (instancia == null)
            instancia = new FactoriaComandoImp();

        return instancia;
    }

    /**
     * Devuelve un comando dependiendo de la petición.
     *
     * @param evento: el tipo de evento.
     * @return el comando respectivo a la petición.
     */
    public abstract Comando getComando(Evento evento);
}
