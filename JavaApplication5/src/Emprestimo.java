
import java.util.Scanner;


public class Emprestimo {
    
    double preco,result;
    String nome;
    
    //entrada
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o nome do produto: ");
    nome =entrada.next();
    
     System.out.println("Digite o preço do produto: ");
    preco =entrada.nextDouble();
    
    //processamento
    result= (preco*1.65);
    
    //Saida
    System.out.println("Voçê vai vender o produto: "+nome+"por R$"+result);
    
    
    
    
}
