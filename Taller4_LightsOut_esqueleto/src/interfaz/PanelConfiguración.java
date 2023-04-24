package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import modelo.Tablero;

@SuppressWarnings("serial")
public class PanelConfiguración extends JPanel implements ActionListener{
	
	@SuppressWarnings("unused")
	private VentanaLightsOut padre;
	public static int tamañoUsar;
	private VentanaLightsOut tablero;
	private int tamano;
	
	
	@SuppressWarnings("unchecked")
	public PanelConfiguración(VentanaLightsOut padre) {
		this.padre = padre;
		
		setBackground(Color.BLUE);
		setOpaque(true);
		setLayout(new FlowLayout());
		setSize(800, 40);
		
		JLabel tamaño = new JLabel("Tamaño: ");
		add(tamaño);
		String[] tamaños = {"5x5", "6x6", "7x7", "8x8", "9x9","10x10"};
		JComboBox<String> selTam = new JComboBox<String>(tamaños);
		
		
		selTam.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            String newSize = (String)selTam.getSelectedItem();
	            String[] tamanos = newSize.split("x");
	            String tamFinal = tamanos[1];
	            tamano = Integer.parseInt(tamFinal);
	            tablero = new VentanaLightsOut(tamano);
	            repaint();
	        }
	    });

		add(selTam);
		JLabel dificultad = new JLabel("Dificultad: ");
		add(dificultad);

		JRadioButton facilButton = new JRadioButton("Fácil: ");
		JRadioButton medioButton = new JRadioButton("Medio: ");
		JRadioButton dificilButton = new JRadioButton("Dificíl: ");
		
		ButtonGroup botones = new ButtonGroup();
		botones.add(facilButton);
		botones.add(medioButton);
		botones.add(dificilButton);
		
		add(facilButton);
		add(medioButton);
		add(dificilButton);
		
		
	}
	
	private int darTamaño() {
		return tamano;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}




	
	

	
	
		
	

}
