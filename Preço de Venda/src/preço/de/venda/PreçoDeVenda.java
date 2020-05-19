
package preço.de.venda;

import java.util.Scanner;


public class PreçoDeVenda {

    
    public static void main(String[] args) {
       double preco, result;
       String nome;
       
       //entrada
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Digite o nome do seu produto: ");
       nome =entrada.next();
       
       System.out.println("Digite o preço do seu produto: ");
       preco =entrada.nextDouble();
       
       //processamento
       result = (preco*1.65);
       
       //Saida
        System.out.println("Voçe vai vender o produto: "+nome+"por:R$"+result);
       
       
       
       
       
       
    }
    
}
