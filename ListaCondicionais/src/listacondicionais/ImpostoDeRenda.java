
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class ImpostoDeRenda {

  
    public static void main(String[] args) {
        double salario, resp;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
        
        if (salario<=1903.98) { 
         resp =0;
        }
        if ((salario>1903.98) && (salario<=2829.65)) {
        resp=(salario*0.075);
        }
        if ((salario>2829.65) && (salario<=3751.05)) {
        resp=(salario*0.15);
        }
        if ((salario>3751.05) && (salario<=4664.68)) {
        resp=(salario*0.225);
        }
         if (salario>4664.68) { 
         resp =(salario*0.275);
         }
         
         JOptionPane.showMessageDialog(null,"O desconto na sua folha de pagamento sera de : R$"+resp);
    }
    
}
