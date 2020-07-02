
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class ParImpar {

   
    public static void main(String[] args) {
                 
                    double a ;
                 
          a= Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
          
          if ((a % 2)==0)  {
              JOptionPane.showMessageDialog(null,"É par");
          } else {
              JOptionPane.showMessageDialog(null,"É ímpar");
          }
    }
    
}
