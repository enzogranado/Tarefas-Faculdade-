import java.util.Scanner;
public class parouimpar {
    public static void main(String[]args){
        System.out.println("O respectivo programa calculará se o número é par ou impar:");

    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro ou decimal (caso seja decimal, ele será arredondado aritmeticamente)");
    float numero = teclado.nextFloat();

    //Math.round(numero) = (int) numero2; assim n pode
    int numeroarredondado = (int) Math.round(numero);

    if (numeroarredondado % 2 == 0){ 
        System.out.println("O numero é par");
    }
    else{
        System.out.println("O numero é impar");
    }
teclado.close();
    
    }
}
