package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modelo.Tablero;

@SuppressWarnings("serial")
public class VentanaLightsOut extends JFrame implements ActionListener{
	
	private PanelConfiguración pConfi;
	private PanelJugada pJugada;
	private PanelTablero pTablero;
	private PanelContador pContador;
	private static int tamano;
	
	public VentanaLightsOut(int tamaño) {
		
		JOptionPane.showMessageDialog(this, ("1. Para visualizar el tablero es necesario primero escoger el tamaño que se requiere.\n2. Se debe elegir la opción de cambiar jugador para ingresar el primer jugador \n 3. Para completar el juego es necesario volver todas las fichas de color negro y luego regresarlas a color amarillo\n 4. Es necesario agarandar la ventana para visualizar el juego"), "INSTRUCCIONES",1);
		setTitle("Lights Out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
		pConfi = new PanelConfiguración(this);
		add(pConfi, BorderLayout.NORTH);
		
		pJugada = new PanelJugada(this);
		add(pJugada, BorderLayout.EAST);
		
		pContador = new PanelContador(this);
		add(pContador, BorderLayout.SOUTH);
		
		
		pTablero = new PanelTablero(tamaño, this);
		add(pTablero, BorderLayout.CENTER);
	
		
		
		
	}
	
	public static void main(String[] args) {
		new VentanaLightsOut(tamano);
	}
	
	public void nuevoJuego() {
		new VentanaLightsOut(tamano);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
