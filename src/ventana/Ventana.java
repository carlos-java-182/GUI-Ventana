package ventana;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;

public class Ventana extends JFrame {

	public JPanel panel;

	public Ventana() {

		this.setSize(500, 500); // Establecemos el tamaño inicial
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cuando cerramos la ventana también terminamos el programa
		setTitle(" .: El Gran Gatsby :."); // Establecemos el título
		setLocationRelativeTo(null); // Establecemos ventana en el centro
		// setResizable(false); // Establecemos si la ventana puede cambiar de tamaño o
		// no
		setMinimumSize(new Dimension(200, 200)); // Establecemos un tamaño mínimo cuando hacemos grande o chica la
													// ventana
		this.getContentPane().setBackground(Color.cyan); // Establecemos el color de la ventana

		iniciarComponentes();
	}

	private void iniciarComponentes() {
		colocarPaneles();
		// colocarEtiquetas();
		// colocarBotones();
		// colocarRadioBotones();
		// colocarBotonesDeActivacion();
		// colocarCajasDeTexto();
		// colocarAreasDeTexto();
		// colocarCasillasDeVerificacion();
		// colocarListasDesplegables();
		// colocarCampoDeContraseña();
		// colocarTablas();
		colocarListas();
		

	}

	private void colocarPaneles() {

		panel = new JPanel();

		// panel.setBackground(Color.green); //Establecemos el color del panel

		panel.setLayout(null);// Desactivando el diseño que tiene por defecto

		this.getContentPane().add(panel); // Agregamos panel a la ventana
	}

	private void colocarEtiquetas() {

		// Etiqueta tipo texto

		JLabel etiqueta = new JLabel("Hola lola", SwingConstants.RIGHT); // Se crea una nueva etiqueta para escribir
																			// texto
		// etiqueta.setText("Hola"); //Se agrega texto a la etiqueta o directamente en
		// el argumento del objeto
		etiqueta.setBounds(10, 20, 100, 40); // Se establecen los pixeles de x, y, ancho - largo
		etiqueta.setForeground(Color.white);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.PINK);
		etiqueta.setFont(new Font("arial", Font.ITALIC, 20));
		panel.add(etiqueta);

		// Etiqueta tipo imagen

		JLabel etiqueta2 = new JLabel(new ImageIcon("che_onx_34.jpg"));
		etiqueta2.setBounds(50, 60, 500, 500);
		panel.add(etiqueta2);

		// Etiqueta 3

		ImageIcon mundial = new ImageIcon("Copa_del_mundo.png");
		JLabel etiqueta3 = new JLabel();
		etiqueta3.setBounds(600, 20, 300, 300);
		etiqueta3.setIcon(new ImageIcon(mundial.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		panel.add(etiqueta3);

	}

	private void colocarBotones() {

		// Boton 1 boton de texto
		JButton boton1 = new JButton();
		boton1.setText("Start");
		boton1.setBounds(100, 80, 75, 40);
		boton1.setEnabled(true); // Prende o apaga el boton, true para usarlo, false para desactivarlo
		boton1.setMnemonic('a'); // Le establecemos una ruta de acceso rápido que se accede así: "alt + letra o
									// el número que le pongas como argumento"
		boton1.setForeground(Color.blue);
		boton1.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(boton1);

		// Boton 2 boton de imágen

		JButton boton2 = new JButton();
		boton2.setBounds(100, 20, 75, 40);
		boton2.setBackground(Color.cyan);

		ImageIcon botonimg = new ImageIcon("boton.jpg");
		boton2.setIcon(new ImageIcon(
				botonimg.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(boton2);

		// Boton 3
		JButton boton3 = new JButton();
		boton3.setBounds(100, 130, 75, 40);
		boton3.setBorder(BorderFactory.createLineBorder(Color.green, 4));
		panel.add(boton3);

	}

	private void colocarRadioBotones() {

		JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
		radioBoton1.setBounds(100, 200, 200, 20);
		panel.add(radioBoton1);

		JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
		radioBoton2.setBounds(100, 230, 200, 20);
		panel.add(radioBoton2);

		JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
		radioBoton3.setBounds(100, 260, 200, 20);
		panel.add(radioBoton3);

		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(radioBoton1);
		grupoBotones.add(radioBoton2);
		grupoBotones.add(radioBoton3);

	}

	private void colocarBotonesDeActivacion() {

		JToggleButton botonActivacion1 = new JToggleButton("Opción 1", true);
		botonActivacion1.setBounds(50, 50, 100, 50);
		panel.add(botonActivacion1);

		JToggleButton botonActivacion2 = new JToggleButton("Opción 2", false);
		botonActivacion2.setBounds(50, 120, 100, 50);
		panel.add(botonActivacion2);

		JToggleButton botonActivacion3 = new JToggleButton("Opción 3", false);
		botonActivacion3.setBounds(50, 190, 100, 50);
		panel.add(botonActivacion3);

		ButtonGroup grupoDeBotonesActivados = new ButtonGroup();
		grupoDeBotonesActivados.add(botonActivacion1);
		grupoDeBotonesActivados.add(botonActivacion2);
		grupoDeBotonesActivados.add(botonActivacion3);

	}

	private void colocarCajasDeTexto() {

		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(50, 50, 200, 30);
		cajaTexto.setText("Nombre:");
		panel.add(cajaTexto);

	}

	private void colocarAreasDeTexto() {
		JTextArea areaTexto = new JTextArea();
		areaTexto.setBounds(50, 50, 300, 200); // Inicializas los limites del área
		areaTexto.setText("Escriba el texto aquí..."); // Escribes el texto
		areaTexto.append("\nMás texto"); // Agregas más texto
		areaTexto.setEditable(true); // True edita el texto, false no lo puedes editar

		System.out.println("El texto es:     \n" + areaTexto.getText());
		panel.add(areaTexto);

		// Barras de desplazamiento

		JScrollPane barrasDeDesplazamiento = new JScrollPane(areaTexto);
		barrasDeDesplazamiento.setBounds(50, 50, 300, 200);
		barrasDeDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		barrasDeDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel.add(barrasDeDesplazamiento);
	}

	private void colocarCasillasDeVerificacion() {

		JCheckBox casillaDeVerificacion1 = new JCheckBox("Leche");
		casillaDeVerificacion1.setBounds(50, 50, 200, 50);
		panel.add(casillaDeVerificacion1);

		JCheckBox casillaDeVerificacion2 = new JCheckBox("Galletas");
		casillaDeVerificacion2.setBounds(50, 100, 200, 50);
		panel.add(casillaDeVerificacion2);

		JCheckBox casillaDeVerificacion3 = new JCheckBox("Yogurt");
		casillaDeVerificacion3.setBounds(50, 150, 200, 50);
		panel.add(casillaDeVerificacion3);

		JCheckBox casillaDeVerificacion4 = new JCheckBox("Cereal");
		casillaDeVerificacion4.setBounds(50, 200, 200, 50);
		panel.add(casillaDeVerificacion4);
	}

	private void colocarListasDesplegables() {

		/*
		 * String [] paises = {"Perú", "Colombia", "Paraguay", "Ecuador"};
		 * 
		 * JComboBox listaDesplegable = new JComboBox(paises);
		 * listaDesplegable.setBounds(20, 50, 200, 20);
		 * listaDesplegable.addItem("Argentina"); //Añadir un objeto a la lista
		 * desplegable listaDesplegable.setSelectedItem("Paraguay"); //Sirve para que el
		 * se vea ese objeto antes de abrir la lista panel.add(listaDesplegable);
		 */

		Persona persona1 = new Persona("Alejandro Fernández", 20, "Mexicano");
		Persona persona2 = new Persona("Tania Bustamantes", 25, "Argentina");

		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		JComboBox listaDesplegable = new JComboBox(modelo);

		modelo.addElement(persona1);
		modelo.addElement(persona2);

		listaDesplegable.setBounds(50, 50, 300, 30);
		panel.add(listaDesplegable);
	}

	private void colocarCampoDeContraseña() {
		
		JPasswordField campoContraseña = new JPasswordField();
		campoContraseña.setBounds(20, 20, 150, 30);
		campoContraseña.setText("Acceso Directo a:");
		panel.add(campoContraseña);
		
		String contraseña = "";
		
		for(int i=0; i<campoContraseña.getPassword().length; i++) {
			contraseña+=campoContraseña.getPassword()[i];
		}
		
		System.out.println("Contraseña: \n"+contraseña);
	}

	private void colocarTablas() {
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Nacionalidad");
		
		String [] persona1 = {"Alejando", "21", "Mexicano"};
		String [] persona2 = {"Carlos", "28", "Mexicano"};
		String [] persona3 = {"Liliana", "31", "Mexicana"};
		
		
		modelo.addRow(persona1);
		modelo.addRow(persona2);
		modelo.addRow(persona3);
		
		
		JTable tabla = new JTable(modelo);
		tabla.setBounds(50, 50, 300, 400);
		
		
		panel.add(tabla);	
		
		JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(20, 20, 300, 200);
		panel.add(scroll);
	}
	
	private void colocarListas() {
		
		DefaultListModel modelo = new DefaultListModel();
		
		modelo.addElement(new Persona("Alejandro", 22, "Peruano"));
		modelo.addElement(new Persona("Manuel", 23, "Chileno"));
		modelo.addElement(new Persona("Ricardo", 24, "Mexicano"));
		modelo.addElement(new Persona("José", 25, "Americano"));
		
		JList lista = new JList(modelo);
		lista.setBounds(20, 20, 200, 300);
		
		panel.add(lista);
		
		JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(20, 20, 200, 300);
		panel.add(scroll);
	
	}

}
