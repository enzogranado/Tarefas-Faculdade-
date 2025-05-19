

import java.util.Scanner;

public class Primitivo2{
    public static void main(String[]args){

    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno ");

        String nome = teclado.nextLine();

        System.out.print("Digite a nota do aluno ");

        int nota = teclado.nextInt(); 

        System.out.println("A nota de " + nome + " foi " + nota);  /*System.out.printf("A nota do %s foi %f " , nome , nota);
                                                                         se fosse float/* */
        if (nota >= 5){
          System.out.println("O aluno esta aprovado");  
        }
        else{
            System.out.println("O aluno esta reprovado");
        }
    teclado.close();
    }

    
    }

