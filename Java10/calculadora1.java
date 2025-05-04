
import java.util.Scanner;
public class calculadora1{
public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número inteiro ");
    int valor1 = teclado.nextInt();
    System.out.println("Digite outro número inteiro  ");
    int valor2 = teclado.nextInt();
    int soma = valor1 + valor2; 
    System.out.println("A soma dos 2 numéros é: " + soma );
        teclado.close();       
}
}