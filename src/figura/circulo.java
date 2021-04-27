package figura;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class circulo extends JFrame {
    
    static private int r;
    private double area, perimetro;
    public circulo(){
        UIManager.put("OptionPane.background", new Color(0, 0, 0));
        UIManager.put("Panel.background", new Color(0, 0, 0));
        UIManager.put("OptionPane.messageForeground", new Color(245, 245, 245));
        UIManager.put("Button.background", new Color(113, 0, 178));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("TextField.background", new Color(255, 255, 255));
        r=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor del radio","circulo",JOptionPane.INFORMATION_MESSAGE));
        setTitle("Dibujando círculo con un radio de: "+r);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.r=r;
    }
    @Override
    public void paint(Graphics g){
    
        super.paintComponents(g);
        int z=(int)(300/(2*r));  
        int mid=0;
        Color colorrojo= new Color(204,0,0);
        Color colorgris= new Color(192,192,192);
        Color colorpurple= new Color(153,51,255);
        
        g.setColor(colorgris);
        for(int c=0;c<600;c=c+z){
              g.drawLine(c,0,c,600);
              g.drawLine(0, c, 600, c);
              mid++;
    }   
        mid=z*(mid/2);
        g.setColor(colorrojo);
        g.drawLine(mid,0,mid,600);
        g.drawLine(0,mid,600,mid);
        
        g.setColor(colorpurple);
        g.drawOval(mid-(z*r), mid-(z*r), 2*r*z, 2*r*z); 
        g.fillOval(mid-(z*r), mid-(z*r), 2*r*z, 2*r*z);
    } 
//Dibuja un circulo
    public String procesoCompleto(){
        area=r*r*Math.PI;
        perimetro=2*r*Math.PI;
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nRadio: "+r+"\nDiametro: "+2*r;
    }
}
    