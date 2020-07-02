
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class Habilitação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double idade;
        char resp;
        
        idade=  Double.parseDouble(JOptionPane.showInputDialog("Qual a sua idade?"));
        resp = JOptionPane.showInputDialog("Possui habilitação?");
        
        if { ((idade>=18) && (resp="sim")) 
        JOptionPane.showMessageDialog("Pode passar");
         }else {
        JOptionPane.showMessageDialog("Não pode passar");
        }
        
        
    }
    
}
