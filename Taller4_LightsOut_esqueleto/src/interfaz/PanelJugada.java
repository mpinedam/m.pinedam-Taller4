package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modelo.Tablero;

public class PanelJugada extends JPanel implements ActionListener{
	
	private static final String BOTONNUEVO = "BOTONNUEVO";
	private static final String BOTONREINICIAR = "BOTONREINICIAR";
	private static final String BOTONCAMBIAR = "BOTONCAMBIAR";
	private static final String BOTONTOP10 = "BOTONTOP10";
	private VentanaLightsOut padre;
	private String nombre;
	String[] items = {"AAA ---- 23", "ABC ---- 23", "S ---- 23", " ---- 23", "XYZ ---- 23", "MSP ---- 21", "ABC ---- 21", "GGG ---- 21", "BBB ---- 21", "ABC ---- 19"};
    JList<String> listaJugadores = new JList<>(items);	
	
	public PanelJugada(VentanaLightsOut padre) {
		this.padre = padre;
	
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton nuevo = new JButton("NUEVO");
		nuevo.addActionListener(this);
		nuevo.setActionCommand(BOTONNUEVO);
		add(nuevo);
		
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.addActionListener(this);
		reiniciar.setActionCommand(BOTONREINICIAR);
		add(reiniciar);
		
		
		JButton top10 = new JButton("TOP 10");
		top10.addActionListener(this);
		top10.setActionCommand(BOTONTOP10);
		add(top10);
		
		
		JButton cambiar = new JButton("CAMBIAR JUGADOR");
		cambiar.addActionListener(this);
		cambiar.setActionCommand(BOTONCAMBIAR);
		add(cambiar);
		
		JLabel intrucciones = new JLabel("INSTRUCCIONES");
		add(intrucciones);
		JLabel intrucciones1 = new JLabel("Volver casillas de un solo color");
		add(intrucciones1);
	}

public void actionPerformed(ActionEvent e) {
	
	String comando = e.getActionCommand();
	if (comando.equals(BOTONNUEVO))
		padre.nuevoJuego();
	if(comando.equals(BOTONREINICIAR))
		padre.nuevoJuego();
	if(comando.equals(BOTONCAMBIAR))
		nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del jugador", "Nombre Jugador",
				JOptionPane.QUESTION_MESSAGE);
	if(comando.equals(BOTONTOP10))
	JOptionPane.showMessageDialog(this, listaJugadores , "TOP10", 1);
	
     
		
	
		
		
}

	
}
