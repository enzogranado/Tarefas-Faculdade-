
import java.util.Scanner;
public class restoequociente {
    public static  void main(String[]args){
        Scanner teclado = new Scanner(System.in);
System.out.println("O programa a seguir calculará o quociente e o resto entre 2 números e, se possível, a raiz quadrada do primeiro.");
System.out.println("Digite o primeiro numero");
        int n1 = teclado.nextInt();
System.out.println("Digite o denominador");      
        int n2 = teclado.nextInt();
        int q = n1/n2;
        int r = n1 % n2; 
        double raiz = Math.sqrt(n1);
System.out.println("O quoeficiente é " + q + " , o resto é " + r + " e a raiz quadrada do primeiro número é " + raiz);
        
teclado.close();

    }
}
