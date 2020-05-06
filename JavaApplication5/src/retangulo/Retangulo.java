
package retangulo;

import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) { 
        double area,perimetro,base,altura;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a Base: ");
        base =entrada.nextDouble();
        
        System.out.println("Digite a Altura: ");
        altura =entrada.nextDouble();
        
        //processamento
        
        area= base*altura;
        perimetro = (base+altura)*2;
                
        //saida
        System.out.println("A area do reatangulo é: "+altura);
        System.out.println("O perimetro do reatangulo é: "+perimetro);
                
        
        
        

        
    }
    
}
