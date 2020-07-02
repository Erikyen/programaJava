
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class Aumento {


    public static void main(String[] args) {
       double salario, resp;
       
       salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário"));
       
       if(salario<=1500){
       resp= (salario*1.20);
       }
       else  if (salario>1500 && salario<=3000)  {
       resp= (salario*1.15);
       } else {
        resp= (salario*1.10);
       }
       JOptionPane.showMessageDialog(null,"O seu sal4ario após o aumento será de R$"+resp);
    }
    
}
