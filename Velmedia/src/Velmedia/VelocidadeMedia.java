
package Velmedia;

import java.util.Scanner;


public class VelocidadeMedia {

  
    public static void main(String[] args) {
        double per,hora,min,tempo,velmedia;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o percurso: ");
        per = entrada.nextDouble();   
        System.out.println("Digite a hora: ");
        hora = entrada.nextDouble();
        System.out.println("Digite os minutos: ");
        min = entrada.nextDouble();
        
        //processamento
        tempo = (min/60)+hora;
        velmedia= per/tempo;
        
        //Saida
        System.out.println("A velocidade desse veículo era de "+velmedia+"km/h");
        
                
        
        
    }
    
}
