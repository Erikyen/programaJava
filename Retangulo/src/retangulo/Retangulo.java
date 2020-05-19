
package retangulo;

import java.util.Scanner;


public class Retangulo {


    public static void main(String[] args) {
       //variaveis
       double base, alt, peri, area;
       
       //entrada
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Digite a base do retangulo: ");
       base = entrada.nextDouble();
       
        System.out.println("Digite a alturae do retangulo: ");
        alt = entrada.nextDouble();
        
        //processamento
        peri= (alt+base)*2;
        area= (alt*base);
        
        //saida
        
        System.out.println("Digite o perimetro do retangulo é: "+peri+"e a area é: "+area);
                
        
               
       
       
    }
    
}
