
package figura;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Figura extends GUI {

    public static void main(String[] args) {
        
        GUI interfaz = new GUI();
        
        // Se le agrega un diseño al JOptionPane
        UIManager.put("OptionPane.background", new Color(0, 0, 0));
        UIManager.put("Panel.background", new Color(0, 0, 0));
        UIManager.put("OptionPane.messageForeground", new Color(245, 245, 245));
        UIManager.put("Button.background", new Color(6, 3, 126));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("TextField.background", new Color(207, 216, 220));

        /* Se establece una conexión con el metodo Grafica el cual contiene
         * todo el funcionamiento del programa
         */
        
        try {
           interfaz.GUI();
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Cumple con las indicaciones por favor.", "Error",
                     JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/tec.png"));
        }
        
    }
    
}
