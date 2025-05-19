import java.util.Scanner;
public class FatorialERepetição {
    public static void main(String[]args){
        /*int cc = 0;
        while (cc<10) {
            if (cc == 7 || cc == 8){ // quando usamos continue, o código para e volta para o while (por isso cancela o 7 )
                //continue; 
                break;
            }
           
            System.out.println("Cambalhota " + cc);
            cc++;
        }*/
        /*System.out.println("O programa realizará a contagem de uma quatidades de números ");
        int a = 1; 
        while (a<55){ 
            System.out.println(a);
                a += 4;/* 
        }*/
        System.out.println("O porgrama a seguir calculará o fatorial de alguns números ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que será fatorado : ");
        int n1 = teclado.nextInt();
        int f = 1;
        int c = n1;
        while (c>=1){
            f *= c; 
            c--; 
        }
        System.out.println("O fatorial de " + n1 + " é " + f );
        System.out.println(c);
        teclado.close();
    }
}
