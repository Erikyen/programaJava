
package listaexer2;

import java.util.Scanner;


public class Conversaominutos {

 
    public static void main(String[] args) {
       
       //variaveis4
       
    double hora, min, temp;
    
    //entrada
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite as horas: ");
    hora= entrada.nextDouble();
    
    System.out.println("Digite os minutos: ");
    min= entrada.nextDouble();
    
    //processamento
    temp = (min/60)+hora;
    
    //Saida
    System.out.println("As horas sao: "+temp);
    }
    
}
