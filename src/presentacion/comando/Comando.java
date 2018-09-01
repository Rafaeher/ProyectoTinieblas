package presentacion.comando;

import contexto.Contexto;

/**
 * Una interfaz para ejecutar órdenes.
 */
public interface Comando
{
    /**
     * Ejecuta una orden dada cierta información.
     *
     * @param info: algún tipo de información.
     * @return el contexto respectivo, una vez que la información ha sido tratada.
     */
    Contexto ejecutar(Object info);
}
