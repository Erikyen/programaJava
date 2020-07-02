
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class Requisitos {


    public static void main(String[] args) {
           double alt, idade;
           
        
        alt= Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
        idade=  Double.parseDouble(JOptionPane.showInputDialog("Qual a sua idade?"));
        
        
        if ((alt>=1.75) && (idade>=18)) {
        JOptionPane.showMessageDialog(null,"Voçê pode competir");  
        } 
        else {
        JOptionPane.showMessageDialog(null,"Voçê não pode competir");
        }
    }
    
}
