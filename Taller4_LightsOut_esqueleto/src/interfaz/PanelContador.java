package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Tablero;

public class PanelContador extends JPanel{
	private VentanaLightsOut padre;
	
	public PanelContador(VentanaLightsOut padre){
		setLayout(new GridLayout());
		setBackground(Color.GRAY);
		JLabel jugadas = new JLabel("Jugadas: ");
		add(jugadas);
		JLabel numjugadas = new JLabel(Integer.toString(Tablero.darJugadas()));
		add(numjugadas);
		JLabel jugador = new JLabel("Jugador: ");
		add(jugador);
		JTextField nombrejugador = new JTextField();
		add(nombrejugador);
		
	}

}
