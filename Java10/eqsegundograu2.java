import java.util.Scanner;
public class eqsegundograu2 {
    // esse programa tentara calcular um eq de segundo grau de ouyra forma 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("O sistema a seguir calculara uma eq do segundo grau ");
        System.out.println("Digite o 'a' da equação ");
        double a = teclado.nextDouble();
        System.out.println("Digite o 'b' da equação");
        double b = teclado.nextDouble();
        System.out.println("Digite o 'c' da equação");
        double c = teclado.nextDouble(); 
        double bascara = Math.pow(b,2) -1 * (4 * a * c);
        if(bascara<0){
            System.out.println("A equação não tem raiz");
        }
        double raiz1 = (((-1 * b) + Math.sqrt(bascara)) / 2 * a) * -1;
        double raiz2 = (((-1 * b) - Math.sqrt(bascara)) / 2 * a) * -1; 
        System.out.println("as raízes da equação são " + raiz1 + " e " + raiz2 );
        teclado.close();        
    }
}
