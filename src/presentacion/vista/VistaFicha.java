package presentacion.vista;

import contexto.Contexto;
import contexto.Evento;
import negocio.ficha.vampiro.Vampiro;
import presentacion.controlador.Controlador;

import javax.swing.*;
import java.awt.*;

/**
 * La vista de una ficha de personaje.
 */
public class VistaFicha extends JFrame implements Vista
{

    private JTextArea areaTexto;
    private JScrollPane scrollPaneTexto;
    private JButton botonAleatorio;
    private JPanel panelPrincipal;

    /**
     * Constructora por defecto.
     */
    public VistaFicha()
    {
        inicializarVista();
    }

    /**
     * Inicializa la configuración y componentes de la vista.
     */
    private void inicializarVista()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        panelPrincipal = new JPanel(new BorderLayout(0, 0));

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha de Personaje");
        setIconImage(toolkit.getImage("icono_ankh.png"));

        centrarVista(toolkit);

        add(panelPrincipal, BorderLayout.CENTER);
        colocarAreaTexto();
        colocarBotonAleatorio(toolkit);

        panelPrincipal.updateUI();
    }

    /**
     * Añade el JTextArea con la configuración inicial.
     */
    private void colocarAreaTexto()
    {
        areaTexto = new JTextArea();
        //panelPrincipal.add(areaTexto, BorderLayout.CENTER);
        areaTexto.setEditable(true);
        areaTexto.setBackground(new Color(43, 43, 43));
        areaTexto.setText("-Pulsar el d10 para crear una ficha aleatoria de Vampiro-");
        areaTexto.setForeground(new Color(180, 180, 180));
        areaTexto.setFont(new Font("High Tower Text", Font.PLAIN, 22));

        scrollPaneTexto = new JScrollPane(areaTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                          JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panelPrincipal.add(scrollPaneTexto, BorderLayout.CENTER);
    }

    /**
     * Añade el botón que crea un personaje aleatorizar
     */
    private void colocarBotonAleatorio(Toolkit toolkit)
    {
        Image imagenD10Escalada = toolkit.getImage("d10.png");
        ImageIcon iconoD10 = new ImageIcon(imagenD10Escalada);
        botonAleatorio = new JButton(iconoD10);
        botonAleatorio.setName("Personaje aleatorizar");
        botonAleatorio.addActionListener(actionEvent ->
                                       {
                                           botonAleatorio.setEnabled(false);

                                           Contexto contexto = new Contexto(Evento.GenerarVampiroAleatorio, null);
                                           Controlador controlador = Controlador.getInstancia();
                                           try
                                           {
                                               controlador.accion(contexto);
                                           }
                                           finally
                                           {
                                               botonAleatorio.setEnabled(true);
                                           }
                                       });
        panelPrincipal.add(botonAleatorio, BorderLayout.SOUTH);
    }

    /**
     * Centra la vista
     *
     * @param toolkit: la toolkit creada para el frame
     */
    private void centrarVista(Toolkit toolkit)
    {
        Dimension dimensionPantalla = toolkit.getScreenSize();
        int anchoPantalla = dimensionPantalla.width;
        int altoPantalla = dimensionPantalla.height;
        int anchoVista = anchoPantalla * 3 / 4;
        int altoVista = altoPantalla * 3 / 4;

        setSize(anchoVista, altoVista);
        setLocation((anchoPantalla - anchoVista) / 2, (altoPantalla - altoVista) / 2);

    }

    @Override
    public void actualizar(Contexto contexto)
    {
        switch (contexto.getEvento())
        {
            case VampiroGenerado: areaTexto.setText(((Vampiro) contexto.getInfo()).toString()); break;
            default: break;
        }
    }
}
