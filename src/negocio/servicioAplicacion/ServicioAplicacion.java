package negocio.servicioAplicacion;

import contexto.Contexto;
import contexto.Evento;
import negocio.ficha.vampiro.Vampiro;
import utils.Pair;

public class ServicioAplicacion
{
    /**
     *
     * @param cronica: el nombre de la crónica
     * @param puntosGratuitos: el número de puntos gratuitos que tendrá el vampiro
     * @return contexto que indica que se ha generado un vampiro y contiene el vampiro creado
     */
    public Contexto generaVampiroAleatorio(String cronica, int puntosGratuitos)
    {
        Vampiro vampiro = new Vampiro();
        vampiro.aleatorizar(cronica, puntosGratuitos);

        return new Contexto(Evento.VampiroGenerado, vampiro);
    }
}
