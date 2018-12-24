package negocio.ficha.vampiro;

import negocio.ficha.Atributo;
import negocio.ficha.Ficha;
import negocio.ficha.Personalidad;
import utils.LectorEjemplos;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

/**
 * La clase para representar la ficha de un vampiro.
 */
public class Vampiro extends Ficha
{
    private TreeMap<Disciplina, Integer> disciplinas; // Las disciplinas del Vampiro (<nombre, puntuación>)

    private TreeMap<String, Integer> trasfondos; // Los trasfondos del Vampiro (<nombre, puntuación>)

    private Senda senda;
    private int puntuacionSenda;
    private int porte; // Puntuación del porte del Vampiro

    // VIRTUDES
    private int virtudSuperior; // Puntuación en conciencia / convicción del Vampiro
    private int virtudIntermedia; // Puntuación en autocontrol / instinto del Vampiro
    private int coraje; // Puntuación en coraje del Vampiro

    private int generacion; // La generación del Vampiro

    private Afiliacion afiliacion; // La afiliación (secta, clan u otro) del Vampiro

    private Clan clan; // El Clan al que pertenece el Vampiro

    private Vampiro sire; // El Sire del Vampiro

    protected String debilidad; // Debilidad / es del Vampiro

    protected Sangre sangre; // Reserva de Sangre del Vampiro

    protected ArrayList<String> meritos; // Los méritos del Vampiro TODO
    protected ArrayList<String> defectos; // Los defectos del Vampiro TODO



    public TreeMap<Disciplina, Integer> getDisciplinas()
    {
        return disciplinas;
    }

    public void setDisciplinas(TreeMap<Disciplina, Integer> disciplinas)
    {
        this.disciplinas = disciplinas;
    }

    public TreeMap<String, Integer> getTrasfondos()
    {
        return trasfondos;
    }

    public void setTrasfondos(TreeMap<String, Integer> trasfondos)
    {
        this.trasfondos = trasfondos;
    }

    public int getPuntuacionSenda()
    {
        return puntuacionSenda;
    }

    public void setPuntuacionSenda(int puntuacionSenda)
    {
        this.puntuacionSenda = puntuacionSenda;
    }

    public Senda getSenda()
    {
        return senda;
    }

    public  void setSenda(Senda senda)
    {
        this.senda = senda;
    }

    public int getPorte()
    {
        return porte;
    }

    public void setPorte(int porte)
    {
        this.porte = porte;
    }

    public int getVirtudSuperior()
    {
        return virtudSuperior;
    }

    public void setVirtudSuperior(int virtudSuperior)
    {
        this.virtudSuperior = virtudSuperior;
    }

    public int getVirtudIntermedia()
    {
        return virtudIntermedia;
    }

    public void setVirtudIntermedia(int virtudIntermedia)
    {
        this.virtudIntermedia = virtudIntermedia;
    }

    public int getCoraje()
    {
        return coraje;
    }

    public void setCoraje(int coraje)
    {
        this.coraje = coraje;
    }

    public int getGeneracion()
    {
        return generacion;
    }

    public void setGeneracion(int generacion)
    {
        this.generacion = generacion;
    }

    public Afiliacion getAfiliacion()
    {
        return afiliacion;
    }

    public void setAfiliacion(Afiliacion afiliacion)
    {
        this.afiliacion = afiliacion;
    }

    public Clan getClan()
    {
        return clan;
    }

    public void setClan(Clan clan)
    {
        this.clan = clan;
    }

    public Vampiro getSire()
    {
        return sire;
    }

    public void setSire(Vampiro sire)
    {
        this.sire = sire;
    }

    public String getDebilidad()
    {
        return debilidad;
    }

    public void setDebilidad(String debilidad)
    {
        this.debilidad = debilidad;
    }

    public Sangre getSangre()
    {
        return sangre;
    }

    public void setSangre(Sangre sangre)
    {
        this.sangre = sangre;
    }

    public ArrayList<String> getMeritos()
    {
        return meritos;
    }

    public void setMeritos(ArrayList<String> meritos)
    {
        this.meritos = meritos;
    }

    public ArrayList<String> getDefectos()
    {
        return defectos;
    }

    public void setDefectos(ArrayList<String> defectos)
    {
        this.defectos = defectos;
    }



    /**
     * Constructora por defecto
     */
    public Vampiro()
    {
        disciplinas = new TreeMap<>();
        trasfondos = new TreeMap<>();

        meritos = new ArrayList<>();
        defectos = new ArrayList<>();

        // Inicializar HashMaps de habilidades
        colocarTalentos();
        colocarTecnicas();
        colocarConocimientos();
    }

    /**
     * Coloca los conocimientos básicos del Vampiro en el HashMap.
     */
    private void colocarConocimientos()
    {
        conocimientos.put("Academicismo", 0);
        conocimientos.put("Ciencias", 0);
        conocimientos.put("Finanzas", 0);
        conocimientos.put("Informática", 0);
        conocimientos.put("Investigación", 0);
        conocimientos.put("Leyes", 0);
        conocimientos.put("Medicina", 0);
        conocimientos.put("Ocultismo", 0);
        conocimientos.put("Política", 0);
        conocimientos.put("Tecnología", 0);
    }

    /**
     * Coloca las técnicas básicas del Vampiro en el HashMap.
     */
    private void colocarTecnicas()
    {
        tecnicas.put("Armas de fuego", 0);
        tecnicas.put("Artesanía", 0);
        tecnicas.put("Conducir", 0);
        tecnicas.put("Etiqueta", 0);
        tecnicas.put("Interpretación", 0);
        tecnicas.put("Latrocinio", 0);
        tecnicas.put("Pelea con armas", 0);
        tecnicas.put("Sigilo", 0);
        tecnicas.put("Supervivencia", 0);
        tecnicas.put("Trato con animales", 0);
    }

    /**
     * Coloca los talentos básicos del Vampiro en el HashMap.
     */
    private void colocarTalentos()
    {
        talentos.put("Alerta", 0);
        talentos.put("Atletismo", 0);
        talentos.put("Callejeo", 0);
        talentos.put("Consciencia", 0);
        talentos.put("Empatía", 0);
        talentos.put("Expresión", 0);
        talentos.put("Intimidación", 0);
        talentos.put("Liderazgo", 0);
        talentos.put("Pelea", 0);
        talentos.put("Subterfugio", 0);
    }

    /**
     * Obtiene un vampiro generado aleatoriamente con los puntos gratuitos por defecto del manual.
     *
     * @param _cronica: el nombre de la Crónica
     */
    public void aleatorizar(String _cronica)
    {
        aleatorizar(_cronica, 15);
    }

    /**
     * Obtiene un vampiro generado aleatoriamente con los puntos gratuitos dados
     *
     * @param _cronica: el nombre de la Crónica
     * @param puntosGratuitos: los puntos gratuitos del personaje
     */
    public void aleatorizar(String _cronica, int puntosGratuitos)
    {
        Random random = new Random();

        // Es importantes mantener el orden de determinadas operaciones para garantizar la correcta creación aleatoria.
        elegirSexo(random);
        elegirNombre();
        jugador = "Master";
        cronica = _cronica;
        naturaleza = Personalidad.aleatoria();
        conducta = Personalidad.aleatoria();
        concepto = LectorEjemplos.getConceptos();
        elegirClan();
        elegirAfiliacion(random);
        distribuirCirculosAtributos(random);
        distribuirCirculosHabilidades(random);
        distribuirCirculosDisciplinas(random);
        distribuirCirculosTrasfondos(random);
        senda = Senda.HUMANIDAD;
        distribuirCirculosVirtudes(random);
        puntuacionSenda = virtudSuperior + virtudIntermedia;
        fuerzaVoluntad = coraje;
        distribuirPuntosGratuitos(puntosGratuitos, random);
        calcularGeneracion();
        sangre = new Sangre(generacion);

        crearSire(random);
    }

    /**
     * Distribuye los círculos iniciales entre las distintas disciplinas del Clan del Vampiro. Por tanto, es necesario
     * que tenga un Clan previamente asignado.
     *
     * @param random: el generador de números aleatorios
     */
    private void distribuirCirculosDisciplinas(Random random)
    {
        if (disciplinas.isEmpty())
        {
            disciplinas.put(clan.getDisciplina1(), 0);
            disciplinas.put(clan.getDisciplina2(), 0);
            disciplinas.put(clan.getDisciplina3(), 0);
        }

        distribuirCirculos(disciplinas, 3, 5, random);
    }

    /**
     * Calcula la generación a la que pertenece el Vampiro a partir de sus puntos en el trasfondo Generación. Es por
     * ello que este debe de haberse asignado previamente.
     */
    private void calcularGeneracion()
    {
        generacion = 13 - trasfondos.get("Generación");
    }


    /**
     * Distribuye los puntos gratuitos entre todos los rasgos.
     *
     * @param puntosGratuitos: los puntos gratuitos a repartir.
     * @param random: el generador de números aleatorios.
     */
    private void distribuirPuntosGratuitos(int puntosGratuitos, Random random)
    {
        while (puntosGratuitos > 0)
        {

            int rasgoSelecionado;

            switch(puntosGratuitos)
            {
                case 6:
                case 5:
                    rasgoSelecionado = random.nextInt(10); break;
                case 4:
                case 3:
                case 2:
                    rasgoSelecionado = random.nextInt(7); break;
                case 1:
                    rasgoSelecionado = random.nextInt(2); break;

                default:
                    rasgoSelecionado = random.nextInt(11); break;
            }

            switch (rasgoSelecionado)
            {
                case 0:
                    distribuirCirculos(trasfondos, 1, 5, random);
                    puntosGratuitos -= 1;
                    break;
                case 1:
                    fuerzaVoluntad += 1;
                    puntosGratuitos -= 1;
                    break;
                case 2:
                    puntuacionSenda += 1;
                    puntosGratuitos -= 2;
                    break;
                case 3:
                    distribuirCirculos(talentos, 1, 5, random);
                    puntosGratuitos -= 2;
                    break;
                case 4:
                    distribuirCirculos(tecnicas, 1, 5, random);
                    puntosGratuitos -= 2;
                    break;
                case 5:
                    distribuirCirculos(conocimientos, 1, 5, random);
                    puntosGratuitos -= 2;
                    break;
                case 6:
                    TreeMap<Virtud, Integer> virtudes = new TreeMap<>();

                    virtudes.put(senda.getVirtudSuperior(), virtudSuperior);
                    virtudes.put(senda.getVirtudIntermedia(), virtudIntermedia);
                    virtudes.put(Virtud.CORAJE, coraje);

                    distribuirCirculos(virtudes, 1, 5, random);

                    if (virtudes.get(Virtud.CORAJE) > coraje) // Si se ha incrementado el coraje
                    {
                        fuerzaVoluntad += 1;
                    }
                    else // Si no se ha incrementado el coraje
                    {
                        puntuacionSenda += 1;
                    }

                    virtudSuperior = virtudes.get(senda.getVirtudSuperior());
                    virtudIntermedia = virtudes.get(senda.getVirtudIntermedia());
                    coraje = virtudes.get(Virtud.CORAJE);

                    puntosGratuitos -= 2;
                    break;
                case 7:
                    distribuirCirculos(fisicos, 1, 5, random);
                    puntosGratuitos -= 5;
                    break;
                case 8:
                    distribuirCirculos(sociales, 1, 5, random);
                    puntosGratuitos -= 5;
                    break;
                case 9:
                    distribuirCirculos(mentales, 1, 5, random);
                    puntosGratuitos -= 5;
                    break;
                case 10:
                    distribuirCirculos(disciplinas, 1, 5, random);
                    puntosGratuitos -= 7;
                    break;
            }
        }
    }

    /**
     * Distribuye los círculos de inicio de las virtudes.
     *
     * @param random: el generador de números aleatorios.
     */
    private void distribuirCirculosVirtudes(Random random)
    {
        TreeMap<Virtud, Integer> virtudes = new TreeMap<>();
        int circulosVirtudSuperior = 1, circulosVirtudIntermedia = 1;

        if (senda.getVirtudSuperior() != Virtud.CONCIENCIA)
        {
            circulosVirtudSuperior = 0;
        }

        if (senda.getVirtudIntermedia() != Virtud.AUTOCONTROL)
        {
            circulosVirtudIntermedia = 0;
        }

        virtudes.put(senda.getVirtudSuperior(), circulosVirtudSuperior);
        virtudes.put(senda.getVirtudIntermedia(), circulosVirtudIntermedia);
        virtudes.put(Virtud.CORAJE, 1);

        distribuirCirculos(virtudes, 7, 5, random);

        virtudSuperior = virtudes.get(senda.getVirtudSuperior());
        virtudIntermedia = virtudes.get(senda.getVirtudIntermedia());
        coraje = virtudes.get(Virtud.CORAJE);
    }

    /**
     * Distribuye los círculos de inicio de trasfondos.
     *
     * @param random: el generador de números aleatorios
     */
    private void distribuirCirculosTrasfondos(Random random)
    {

        if (trasfondos.isEmpty())
        {
            if (clan != Clan.CAITIFF)
            {
                trasfondos.put("Estatus", 0);
            }

            if (afiliacion == Afiliacion.SABBAT)
            {
                trasfondos.put("Miembro de la Mano Negra", 0);
                trasfondos.put("Rituales", 0);
            }

            trasfondos.put("Aliados", 0);
            trasfondos.put("Contactos", 0);
            trasfondos.put("Criados", 0);
            trasfondos.put("Dominio", 0);
            trasfondos.put("Fama", 0);
            trasfondos.put("Generación", 0);
            trasfondos.put("Identidad Alternativa", 0);
            trasfondos.put("Influencia", 0);
            trasfondos.put("Mentor", 0);
            trasfondos.put("Rebaño", 0);
            trasfondos.put("Recursos", 0);
        }

        distribuirCirculos(trasfondos, 5, 5, random);
    }

    /**
     * Asigna la afiliación del Vampiro dependiendo de su Clan. Por tanto, debe tener Clan previamente asignado.
     * Emplea las afiliaciones por defecto del manual.
     *
     * @param random: el generador de números aleatorios.
     */
    private void elegirAfiliacion(Random random)
    {
        switch(clan)
        {
            case LASOMBRA:
            case TZIMISCE:
                afiliacion = Afiliacion.SABBAT; break;
            case RAVNOS:
                afiliacion = Afiliacion.CLAN_RAVNOS; break;
            case ASSAMITA:
                afiliacion = Afiliacion.CLAN_ASSAMITA; break;
            case SEGUIDORES_DE_SET:
                afiliacion = Afiliacion.CLAN_SETITA; break;
            case GIOVANNI:
                afiliacion = Afiliacion.CLAN_GIOVANNI; break;
            case CAITIFF:
                afiliacion = Afiliacion.NINGUNA; break;

                default:
                    afiliacion = Afiliacion.CAMARILLA; break;

        }
    }

    /**
     * Elige un Clan aleatorizar para el Vampiro.
     */
    private void elegirClan()
    {
        clan = Clan.aleatorio();
    }

    /**
     * Crea la información básica (sexo, nombre, generación y Clan) del Sire de un Vampiro.
     * Requiere que el Vampiro tenga asignada generación y Clan.
     *
     * @param random: el generador de números aleatorios.
     */
    private void crearSire(Random random)
    {
        Vampiro newSire = new Vampiro();

        newSire.elegirSexo(random);
        newSire.elegirNombre();
        newSire.generacion = generacion - 1;
        newSire.clan = clan;
        sire = newSire;
    }

    /**
     * Elige un nombre al azar para el Vampiro. Requiere que el Vampiro tenga sexo asignado.
     *
     */
    private void elegirNombre()
    {
        switch(sexo)
        {
            case HOMBRE: nombre = LectorEjemplos.getNombreMasculinoEsp(); break;
            case MUJER: nombre = LectorEjemplos.getNombreFemeninoEsp(); break;
        }
    }

    /**
     * Distribuye aleatoriamente los atributos según las normas de creación de un Vampiro. Es necesario que el Clan
     * haya sido elegido previamente para garantizar la distribución correcta.
     *
     * @param random: el generador de números aleatorios.
     */
    @Override
    protected void distribuirCirculosAtributos(Random random)
    {
        if (clan == Clan.NOSFERATU)
        {
            sociales.remove(Atributo.APARIENCIA);
        }

        super.distribuirCirculosAtributos(random);

        if (clan == Clan.NOSFERATU)
        {
            sociales.put(Atributo.APARIENCIA, 0);
        }
    }

    public String toString()
    {
        final String ls = System.getProperty("line.separator");
        StringBuilder strBuilder = new StringBuilder();

        strBuilder
                .append("Nombre: ").append(nombre).append(ls)
                .append("Sexo: ").append(sexo.toString().toLowerCase()).append(ls)
                .append("Jugador: ").append(jugador).append(ls)
                .append("Crónica: ").append(cronica).append(ls)
                .append("Naturaleza: ").append(naturaleza.toString().toLowerCase()).append(ls)
                .append("Conducta: ").append(conducta.toString().toLowerCase()).append(ls)
                .append("Concepto: ").append(concepto.toLowerCase()).append(ls)
                .append("Clan: ").append(clan.toString(), 0, 1)
                    .append(clan.toString().toLowerCase().substring(1)).append(ls)
                .append("Generación: ").append(generacion).append(ls)
                .append("Sire: ").append(sire.nombre).append(ls)
                .append(ls)
                .append(ls)
                .append("|||   ATRIBUTOS   |||").append(ls)
                .append(ls)
                .append(ls)
                .append("| FISICOS |").append(ls)
                .append(getlistaRasgos(fisicos))
                .append(ls)
                .append("| SOCIALES |").append(ls)
                .append(getlistaRasgos(sociales))
                .append(ls)
                .append("| MENTALES |").append(ls)
                .append(getlistaRasgos(mentales))
                .append(ls)
                .append(ls)
                .append("<<<   HABILIDADES   >>>").append(ls)
                .append(ls)
                .append(ls)
                .append("< TALENTOS >").append(ls)
                .append(getlistaRasgos(talentos))
                .append(ls)
                .append("< TÉCNICAS >").append(ls)
                .append(getlistaRasgos(tecnicas))
                .append(ls)
                .append("< CONOCIMIENTOS >").append(ls)
                .append(getlistaRasgos(conocimientos))
                .append(ls)
                .append(ls)
                .append(ls)
                .append(ls)
                .append(ls)
                .append("···   DISCIPLINAS   ···").append(ls)
                .append(getlistaRasgos(disciplinas))
                .append(ls)
                .append(ls)
                .append("· TRASFONDOS ·").append(ls)
                .append(getlistaRasgos(trasfondos))
                .append(ls)
                .append(ls)
                .append("· VIRTUDES ·").append(ls)
                .append(senda.getVirtudSuperior().toString(), 0, 1)
                    .append(senda.getVirtudSuperior().toString().toLowerCase().substring(1)).append(": ")
                    .append(getCirculos(virtudSuperior)).append(ls)
                .append(senda.getVirtudIntermedia().toString(), 0, 1)
                    .append(senda.getVirtudIntermedia().toString().toLowerCase().substring(1)).append(": ")
                    .append(getCirculos(virtudIntermedia)).append(ls)
                .append("Coraje: ").append(getCirculos(coraje)).append(ls)
                .append(ls)
                .append(ls)
                .append("· ").append(senda.getNombre().toUpperCase()).append(" ·").append(ls)
                .append(getCirculos(puntuacionSenda)).append(ls)
                .append("Porte (").append(senda.getPorte().toString(), 0, 1)
                    .append(senda.getPorte().toString().toLowerCase().substring(1)).append("): ").append(porte)
                    .append(ls)
                .append(ls)
                .append(ls)
                .append("· FUERZA DE VOLUNTAD ·").append(ls)
                .append(getCirculos(fuerzaVoluntad)).append(ls)
                .append(ls)
                .append(ls)
                .append("· DEBILIDAD ·").append(ls)
                .append(debilidad).append(ls);

        return strBuilder.toString();
    }
}
