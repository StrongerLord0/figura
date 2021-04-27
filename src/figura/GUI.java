package figura;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.UIManager;

public class GUI extends JFrame implements ActionListener {

    // Se declaran los atributos del JFrame
    JButton btnCirculo, btnCuadrado, btnTriangulo, btnSalir;
    JLabel jlMensaje3, jlMensaje4, jlNombre3, jlImagen3, jFondo3, jlImagen4;
    JMenuBar menubar;
    JMenu menu1, menu2;
    JMenuItem jmi1, jmi2;

    // Se declaran los objetos donde estan las clases
    //circulo crc = new circulo(5);
    //cuadrado cdr = new cuadrado(5, 20);
    triangulo trn = new triangulo();
    
    public GUI() {
        setLayout(null);
        setTitle("Practica Final");
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        getContentPane().setBackground(new Color(0, 0, 0));

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);
        menu2 = new JMenu("Tema");
        menu1.add(menu2);
        jmi1 = new JMenuItem("Claro");
        menu2.add(jmi1);
        jmi1.addActionListener(this);
        jmi2 = new JMenuItem("Oscuro");
        menu2.add(jmi2);
        jmi2.addActionListener(this);

        ImageIcon icrc = new ImageIcon("src/images/btncirculo.png");
        btnCirculo = new JButton(icrc);
        btnCirculo.setBounds(35, 100, 370, 30);
        //btnCirculo.setBackground(new Color(6, 3, 126));
        //btnCirculo.setForeground(new Color(255, 255, 255));
        add(btnCirculo);
        btnCirculo.addActionListener(this);

        btnCuadrado = new JButton("Cuadrado");
        btnCuadrado.setBounds(35, 150, 370, 30);
        btnCuadrado.setBackground(new Color(6, 3, 126));
        btnCuadrado.setForeground(new Color(255, 255, 255));
        btnCuadrado.setEnabled(true);
        add(btnCuadrado);
        btnCuadrado.addActionListener(this);

        btnTriangulo = new JButton("Triangulo");
        btnTriangulo.setBounds(35, 200, 370, 30);
        btnTriangulo.setBackground(new Color(6, 3, 126));
        btnTriangulo.setForeground(new Color(255, 255, 255));
        btnTriangulo.setEnabled(true);
        add(btnTriangulo);
        btnTriangulo.addActionListener(this);
        
        btnSalir = new JButton("Salir del Sistema");
        btnSalir.setBounds(35, 250, 370, 30);
        btnSalir.setBackground(new Color(6, 3, 126));
        btnSalir.setForeground(new Color(255, 255, 255));
        add(btnSalir);
        btnSalir.addActionListener(this);

        jlMensaje3 = new JLabel("- Fundamentos de Programación -");
        jlMensaje3.setBounds(100, 3, 300, 60);
        jlMensaje3.setFont(new Font("Andale Mono", 3, 18));
        jlMensaje3.setForeground(new Color(62, 93, 182));
        add(jlMensaje3);

        jlMensaje4 = new JLabel("Menu Principal");
        jlMensaje4.setBounds(190, 33, 300, 60);
        jlMensaje4.setFont(new Font("Andale Mono", 1, 14));
        jlMensaje4.setForeground(new Color(255, 255, 255));
        add(jlMensaje4);

        jlNombre3 = new JLabel("Arturo Misael Alvarez Gutierrez | 20550369");
        jlNombre3.setBounds(110, 250, 250, 30);
        jlNombre3.setFont(new Font("Andale Mono", 3, 10));
        jlNombre3.setForeground(new Color(245, 245, 245));
        add(jlNombre3);

        ImageIcon imagen = new ImageIcon("src/images/figurative.png");
        jlImagen3 = new JLabel(imagen);
        jlImagen3.setBounds(15, 10, 65, 71);
        add(jlImagen3);

        ImageIcon imagen2 = new ImageIcon("src/images/tec2.png");
        jlImagen4 = new JLabel(imagen2);
        add(jlImagen4);
    }

    // Se crea la interfaz donde todos los elementos se plasmaran
    public void GUI() {
        GUI gui = new GUI();
        gui.setBounds(0, 0, 450, 400);
        gui.setResizable(false);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent k) {
        UIManager.put("OptionPane.background", new Color(0, 0, 0));
        UIManager.put("Panel.background", new Color(0, 0, 0));
        UIManager.put("OptionPane.messageForeground", new Color(245, 245, 245));
        UIManager.put("Button.background", new Color(6, 3, 126));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("TextField.background", new Color(207, 216, 220));

        /*
         * A traves de estas instrucciones se verifica que
         * los botones han sido presionados y por medio de un objeto
         * se hace la llamada al metodo que tiene el funcionamiento de cada
         * problema.
         *
         */
        if (k.getSource() == btnCirculo) {
            try {
                this.setVisible(false);
                //crc.Interfaz();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/tec.png"));
            }
        }

        if (k.getSource() == btnCuadrado) {
            try {
                this.setVisible(false);
                //cdr.Grafica();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/tec.png"));
            }
        }

        if (k.getSource() == btnTriangulo) {
            try {
                this.setVisible(false);
                trn.procesoCompleto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/tec.png"));
            }
        }

        if (k.getSource() == btnSalir) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos.", "Finalizado",
                    JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/tec.png"));
            System.exit(0);
        }

        if (k.getSource() == jmi1) {
            getContentPane().setBackground(new Color(245, 245, 245));
            jlMensaje3.setForeground(new Color(6, 3, 126));
            jlMensaje4.setForeground(new Color(0, 0, 0));
            jlNombre3.setForeground(new Color(0, 0, 0));
            jlNombre3.setFont(new Font("Andale Mono", 1, 10));
            jlImagen3.setVisible(false);
            jlImagen4.setBounds(15, 10, 65, 71);
            jlImagen4.setVisible(true);
        }

        if (k.getSource() == jmi2) {
            getContentPane().setBackground(new Color(0, 0, 0));
            jlMensaje3.setForeground(new Color(62, 93, 182));
            jlMensaje4.setForeground(new Color(255, 255, 255));
            jlNombre3.setForeground(new Color(255, 255, 255));
            jlImagen3.setVisible(true);
            jlImagen4.setVisible(false);
        }
    }

}
