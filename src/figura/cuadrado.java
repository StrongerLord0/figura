
package figura;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class cuadrado extends JFrame {
    private int l,a;
    private double area, perimetro;
    
    public cuadrado(){
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el lado del cuadrilatero"));
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ancho del cuadrilatero"));
        
        setTitle("Dibujando cuadrado con lados de: "+a+" * "+l);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    @Override
    public void paint(Graphics g){
        int z=0;
        int mid=0;
        Color colorrojo= new Color(204,0,0);
        Color colorgris= new Color(192,192,192);
        Color colorpurple= new Color(153,51,255);
        if(l>a){ 
        z=(int)500/l;
        } else {
            z=(int)500/a;
        } 
          g.setColor(colorgris);
          for(int c=0;c<600;c=c+z){
              g.drawLine(c, 0, c, 600);
              g.drawLine(0, c, 600, c);
              mid++;
          } 
              g.setColor(colorrojo);
              mid=z*mid/2;
              g.drawLine(mid,0,mid,600);
              g.drawLine(0,mid,600,mid);
              g.setColor(colorpurple);
              g.drawRect(mid-(z*a/2), mid-(z*l/2), a*z, l*z);
              g.fillRect(mid-(z*a/2), mid-(z*l/2), a*z, l*z);
    }
    public String procesoCompleto(){
        area=l*a;
        perimetro=(2*a)+(2*l);
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nLargo: "+l+"\nAncho: "+a+"\nDiagonal: "+Math.sqrt(l*l+a*a);
    }
        
}
    
