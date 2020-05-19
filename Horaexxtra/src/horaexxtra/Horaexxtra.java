
package horaexxtra;



import java.util.Scanner;

class Horaexxtra {

    
    public static void main(String[] args) {
        //variaveis
        double hora, min,temp,salario,extra;
        
        //entrada
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Por quantas horas voce trabalhou a mais: ");
        hora = entrada.nextDouble();   
        System.out.println("Por quantos minutos voce trabalhou a mais: ");
        min = entrada.nextDouble();       
        System.out.println("Quanto voce ganha por hora: ");
        salario = entrada.nextDouble();
        
        //processamento
        temp = (min/60)+hora;
        extra = (salario*1.7)*temp;
        
        //Saida
        System.out.println("Voce recebera:R$"+extra+" como hora extra.");
        
       
    }
    
}
