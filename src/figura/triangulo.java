package figura;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class triangulo extends JComponent {
        static String mensaje="";
        static double[] x = new double[3];
        static double[] z = new double[3];
        static double x1;
        static double y1;  
        
        @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int t=(int)(300/z[2]);
        int mid=0;
        Color colorgris= new Color(192,192,192);
        Color colorpurple= new Color(153,51,255);
        
        for(int i=0;i<600;i=i+t){
            g.setColor(colorgris);
            g.drawLine(i,0,i,600);
            g.drawLine(0, i, 600, i);
            mid++;
        }
        mid=mid/2;
        double refx=t*mid/2;
        double refy=t*z[2]+t;
        g.setColor(colorpurple);
        g.drawLine((int)(refx), (int)(refy), (int)(refx+t*z[0]), (int)(refy));
        g.drawLine((int)(refx), (int)(refy), (int)((refx)+(t*x1)), (int)((refy)-(t*y1)));
        g.drawLine((int)((refx)+(t*x1)), (int)((refy)-(t*y1)),(int)(refx+t*z[0]),(int)(refy));
        
        }
        public void trianguloProceso(){
                
        for(int i=0;i<3;i++){
    
            x[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida en forma numérica del lado "+(i+1)));
            
        }
        
        if(x[0]+x[1]>x[2] && x[1]+x[2]>x[0] && x[0]+x[2]>x[1]){
        
            if(x[0]==x[1] && x[1]==x[2]){
               mensaje="Triángulo equilátero";
            }
            else if(x[0]==x[1] || x[1]==x[2] || x[0]==x[2]){
               mensaje="Triángulo isóceles";    
            }    
               else {
               mensaje="Triángulo escaleno";
        }
      } else{
            JOptionPane.showMessageDialog(null,"El triángulo no es formable");
            System.exit(0);
            
            }
       }
        
        
        
        public void procesoCompleto(){
              trianguloProceso();
              magic();
              JFrame jFrame = new JFrame(mensaje);
              jFrame.add(new triangulo());
              jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              jFrame.pack();
              jFrame.setVisible(true);
    }
        public Dimension getPreferredSize() {
        return new Dimension(600, 600);
   }
        public void magic(){
            for(int a=0;a<3;a++){
                z[a]=x[a];
            }
            Arrays.sort(z);
            
            x1=coordenadax(); y1=coordenaday();
            
        }
        private double coordenadax(){
            
            Arrays.sort(x);
            double a;
            double pendiente = ((x[2]*x[2])-(x[1]*x[1])-(x[0]*x[0]))/(-2*x[1]*x[0]);
            double angulo = (180*Math.acos(pendiente))/Math.PI;
            
            if (angulo!=90 || angulo!=180 || angulo!=270 || angulo!=360){
                  a=x[1]*Math.cos(Math.PI*angulo/180);             
            }
            else{
                a=0;
            }
            return a;
        }
        private double coordenaday(){
            
            Arrays.sort(x);
            double a;
            double pendiente = ((x[2]*x[2])-(x[1]*x[1])-(x[0]*x[0]))/(-2*x[1]*x[0]);
            double angulo = (180*Math.acos(pendiente))/Math.PI;
            
            if(angulo!=90 || angulo!=180 || angulo!=270 || angulo!=360){
                  a=x[1]*Math.sin(Math.PI*angulo/180);
            } else{
                a=x[1];
            }
            return a;
        }
}

