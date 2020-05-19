
package gastogasolina;

import java.util.Scanner;


public class Gastogasolina {

   
    public static void main(String[] args) {
       //variaveis
        double kilom,gasto,preco,media, total;
        
        //entrada
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("DIgite quantos kilometros vai percorrer: ");
         kilom = entrada.nextDouble();
         System.out.println("DIgite quanto seu carro consome de gasolina(Km/L): ");
         gasto = entrada.nextDouble();
        
         //processamento
         preco= 4.5;
         media = (kilom/gasto)*preco;
         total = media*2;
         //Saida
         System.out.println("Voce gastara em media:R$"+media+" para ida e R$"+total+" para ida e volta");
         
         
                
         
         
       
    }
    
}
