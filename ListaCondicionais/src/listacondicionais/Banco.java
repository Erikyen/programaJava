
package listacondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author eriky
 */
public class Banco {

    
    public static void main(String[] args) {
       double saque, saldoatual,saldofinal,sobra,limite;
       saldoatual=1000;
       limite=2000;
       
       saque=  Double.parseDouble(JOptionPane.showInputDialog("Quanto voçê quer sacar"));
       
       saldofinal=  saldoatual - saque;
       
       if(saldofinal>= 0)   {
       JOptionPane.showMessageDialog(null,"Seu saldo é positico com R$"+saldofinal);
       }
       if((saldofinal<0) && (saldofinal >=(-limite)))  {
       JOptionPane.showMessageDialog(null,"Seu saldo é negativo com R$"+saldofinal);  
       } else { 
       JOptionPane.showMessageDialog(null,"Voce nao tem limite o suficiente, seu limite é de: R$"+limite);
       }
       
    }
    
}
