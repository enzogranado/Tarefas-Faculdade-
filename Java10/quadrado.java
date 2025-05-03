import java.util.Scanner;
public class quadrado {
    public static void main(String[]args){
System.out.println("O respectivo programa calculará o quadrado de um numero");
        Scanner teclado = new Scanner(System.in);
System.out.println("Digite um numero inteiro");
        double numero = teclado.nextInt();
        double resultado = Math.pow (numero,2);
System.out.println("O quadrado de " + numero + " é " + resultado );
teclado.close();
    }
}
