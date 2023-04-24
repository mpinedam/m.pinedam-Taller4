package interfaz;

import modelo.Tablero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {
    private static final int TAMAÑOTILE = 50;
    private static final int BORDE = 5;
    private Tablero tablero;
    private int tamano;
    private VentanaLightsOut padre;

    public PanelTablero(int tamano, VentanaLightsOut padre) {
        this.tamano = tamano;
        this.tablero = new Tablero(tamano);

        
        addMouseListener(new MouseAdapter() {
            @SuppressWarnings("static-access")
			public void mousePressed(MouseEvent e) {
                int fila = e.getY() / (TAMAÑOTILE + BORDE);
                int columna = e.getX() / (TAMAÑOTILE + BORDE);
                if (fila < tamano && columna < tamano) {
                    tablero.jugar(fila, columna);
                    repaint();
                    if (tablero.tableroIluminado()) {
                    	JOptionPane.showMessageDialog(padre, ("Se resolvio el juego en: " + tablero.darJugadas() + " jugadas."), "FIN JUEGO",1);
                    	new PanelTablero(5, padre);
                    }
                }
            }
        });
    }

    public void paintComponent(Graphics tab) {
        super.paintComponent(tab);
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                int x = columna * (TAMAÑOTILE + BORDE);
                int y = fila * (TAMAÑOTILE + BORDE);
                if (tablero.darTablero()[fila][columna]) {
                    tab.setColor(Color.YELLOW);
                } else {
                    tab.setColor(Color.BLACK);
                }
                tab.fillRect(x, y, TAMAÑOTILE, TAMAÑOTILE);
            }
        }
    }
}


    