
package quadrado;

import java.util.Scanner;


public class Quadrado {

    
    public static void main(String[] args) {
        //variaveis
        double larg, area;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Digite a largura do quadrado: ");
        larg = entrada.nextDouble();
        
        //processamento
        area = (larg*2);
        
        //saida
         System.out.println("A area do quadrado é:  " +area);
       
        
        
    }
    
}
