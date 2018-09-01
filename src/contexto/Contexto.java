package contexto;

/**
 * Contexto a usar por el controlador.
 */
public class Contexto
{
    private Evento evento; // El evento
    private Object info; // La información correspondiente a la evento

    /**
     * Constructor por evento e información.
     *
     * @param _evento: evento de entrada.
     * @param _info: información de entrada.
     */
    public Contexto(Evento _evento, Object _info)
    {
        evento = _evento;
        info = _info;
    }

    /**
     * Obtiene el evento.
     *
     * @return evento.
     */
    public Evento getEvento()
    {
        return evento;
    }

    /**
     * Obtiene la información.
     *
     * @return info.
     */
    public Object getInfo()
    {
        return info;
    }
}
