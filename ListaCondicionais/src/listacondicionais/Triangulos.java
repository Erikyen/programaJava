
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class Triangulos {


    public static void main(String[] args) {
        
                      double  a, b, c;
                           
        a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triangulo: "));

        b=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triangulo: "));

        c=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triangulo: "));
        
         if (((a<(b+c)) && (a>(Math.abs(b-c)))) && ((b<(a+c)) && (b>(Math.abs(a-c))))  && ((c<(b+a))  && (c>(Math.abs(b-a))))) {
               
                 if ((a==b) && (b==c)) {
                 JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
                
         }
                 
                 if  ((a!=b) && (b!=c) && (a!=c)) {
                JOptionPane.showMessageDialog(null, "Triângulo Escaleno"); 
         }
             
                 if (((a==b) && (b!=c)) || ((b==c) && (c!=a)) || ((a==c) && (c!=b)))  {
                 JOptionPane.showMessageDialog(null, "Triângulo Isóceles"); 
         }
  
                   } else {
    JOptionPane.showMessageDialog(null,"Valores nao formam um triangulo ");
      }

    }
    
}
