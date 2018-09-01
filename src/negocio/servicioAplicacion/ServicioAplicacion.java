package negocio.servicioAplicacion;

import contexto.Contexto;
import contexto.Evento;
import negocio.ficha.vampiro.Vampiro;
import utils.Pair;

public class ServicioAplicacion
{
    public Contexto generaVampiroAleatorio(Pair<String, Integer> par)
    {
        Vampiro vampiro = new Vampiro();
        vampiro.aleatorizar(par.first, par.second);

        return new Contexto(Evento.VampiroGenerado, vampiro);
    }
}
