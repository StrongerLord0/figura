package figura;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.UIManager;

public class GUI extends JFrame implements ActionListener {

    // Se declaran los atributos del JFrame
    JButton btnCirculo, btnCuadrado, btnTriangulo, btnSalir;
    JLabel jProyecto, jlImagen3, jFondo3, jlImagen4;
    JMenuBar menubar;
    JMenu menu1, menu2;
    JMenuItem jmi1, jmi2;

    // Se declaran los objetos donde estan las clase
    triangulo trn = new triangulo();
    
    public GUI() {
        setLayout(null);
        setTitle("Figurative");
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
        
        jProyecto = new JLabel("Programacion Orientada a Objetos | Avance 1");
        jProyecto.setBounds(110, 235, 250, 60);
        jProyecto.setFont(new Font("Andale Mono", 3, 9));
        jProyecto.setForeground(new Color(255, 255, 255));
        add(jProyecto);

        ImageIcon icrc = new ImageIcon("src/images/btncirculo.png");
        btnCirculo = new JButton(icrc);
        btnCirculo.setBounds(25, 115, 370, 30);
        btnCirculo.setBackground(new Color(0, 0, 0));
        add(btnCirculo);
        btnCirculo.addActionListener(this);
        btnCirculo.setBorder(null);

        ImageIcon icdr = new ImageIcon("src/images/cuadrilatero.png");
        btnCuadrado = new JButton(icdr);
        btnCuadrado.setBounds(25, 145, 370, 30);
        btnCuadrado.setBackground(new Color(0, 0, 0));
        add(btnCuadrado);
        btnCuadrado.addActionListener(this);
        btnCuadrado.setBorder(null);

        ImageIcon itri = new ImageIcon("src/images/btntriangulo.png");
        btnTriangulo = new JButton(itri);
        btnTriangulo.setBounds(25, 180, 370, 30);
        btnTriangulo.setBackground(new Color(0, 0, 0));
        add(btnTriangulo);
        btnTriangulo.addActionListener(this);
        btnTriangulo.setBorder(null);
        
        ImageIcon isalir = new ImageIcon("src/images/btnsalir.png");
        btnSalir = new JButton(isalir);
        btnSalir.setBounds(25, 215, 370, 30);
        btnSalir.setBackground(new Color(0, 0, 0));
        add(btnSalir);
        btnSalir.addActionListener(this);
        btnSalir.setBorder(null);
    
        ImageIcon imagen = new ImageIcon("src/images/figurative2.png");
        jlImagen3 = new JLabel(imagen);
        jlImagen3.setBounds(170, 10, 80, 80);
        add(jlImagen3);

    }

    // Se crea la interfaz donde todos los elementos se plasmaran
    public void GUI() {
        GUI gui = new GUI();
        gui.setBounds(0, 0, 435, 350);
        gui.setResizable(false);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent k) {
        UIManager.put("OptionPane.background", new Color(0, 0, 0));
        UIManager.put("Panel.background", new Color(0, 0, 0));
        UIManager.put("OptionPane.messageForeground", new Color(245, 245, 245));
        UIManager.put("Button.background", new Color(113, 0, 178));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("TextField.background", new Color(113, 0, 178));
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
                circulo cr = new circulo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figurative.png"));
            }
        }

        if (k.getSource() == btnCuadrado) {
            try {
                this.setVisible(false);
                cuadrado cd = new cuadrado();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figurative.png"));
            }
        }

        if (k.getSource() == btnTriangulo) {
            try {
                this.setVisible(false);
                trn.procesoCompleto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor"
                        + " que sea valido y logico, o cumple la indicación dada.",
                        "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figurative.png"));
            }
        }

        if (k.getSource() == btnSalir) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos.", "Finalizado",
                    JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figurative.png"));
            System.exit(0);
        }

        if (k.getSource() == jmi1) {
            getContentPane().setBackground(new Color(245, 245, 245));
            jProyecto.setForeground(new Color(0, 0, 0));
            btnCirculo.setBackground(new Color(255, 255, 255));
            btnCuadrado.setBackground(new Color(255, 255, 255));
            btnTriangulo.setBackground(new Color(255, 255, 255));
            btnSalir.setBackground(new Color(255, 255, 255));
        }

        if (k.getSource() == jmi2) {
            getContentPane().setBackground(new Color(0, 0, 0));
            jProyecto.setForeground(new Color(255, 255, 255));
            btnCirculo.setBackground(new Color(0, 0, 0));
            btnCuadrado.setBackground(new Color(0, 0, 0));
            btnTriangulo.setBackground(new Color(0, 0, 0));
            btnSalir.setBackground(new Color(0, 0, 0));
        }
    }

}
