
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class IMC {


    public static void main(String[] args) {
              
                 double peso, alt, IMC;
                 
             peso= Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
             alt= Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
             
             IMC =peso / (alt*alt);
             
             if (IMC <= 18.5)  {
              JOptionPane.showMessageDialog(null,"Abaixo do peso, com IMC de: "+IMC);
             } 
             if ((IMC>18.5) && (IMC<=24.9)) {
              JOptionPane.showMessageDialog(null,"Peso ideal, com IMC de: "+IMC);
              }
             if ((IMC>24.9) && (IMC<=29.9)) {
              JOptionPane.showMessageDialog(null,"Voce esta com sobrepeso, com IMC de: "+IMC);
              }
              if ((IMC>29.9) && (IMC<=34.9)) {
              JOptionPane.showMessageDialog(null,"Obesidade de Grau 1, com IMC de: "+IMC);
              }
              if ((IMC>34.9) && (IMC<=39.9)) {
              JOptionPane.showMessageDialog(null,"Obesidade de Grau 2 com IMC de: "+IMC);
              }
              if (IMC>39.9) {
              JOptionPane.showMessageDialog(null,"Obesidade de Grau 3, com IMC de: "+IMC);
              }
    }
    
}
