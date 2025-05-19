import java.util.Scanner;
public class leitordepensamento{
    public static void main(String[]args){
        System.out.println("O respectivo programa simulará um jogo ");

        // como vou fazer isso? 
        Scanner teclado = new Scanner (System.in); 
        System.out.println("Digite o numero que o gênio esta pensando (Ele pensa de 0 a 5 somente )");
        int numero = teclado.nextInt();
       double ale = Math.random(); 
       int alec = (int) (0 + ale * (5 - 0)); // como faço a variavel ter somento uma casa decimal (ser int) 
       // solução--> especificar que o valor gerado será int com um typecast 
       if (numero == alec){
        System.out.println("Você acertou, parabéns ");
       }
       else{
        System.out.println("Errou, o genio pensou em " + alec );
       }
       teclado.close(); 
    }   
    }