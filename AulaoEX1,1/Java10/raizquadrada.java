    import java.util.Scanner;
public class raizquadrada {
    public static void main(String[] args) {      
     // O respectivo programa calculará a raiz quadrada de um número 
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextFloat();
    
       double resultado = (double) Math.sqrt(n1);    // pq precisou colocar o (float)? 
       teclado.close();
       System.out.println("A raiz quadrada do número digitado é " + resultado );
    }
}
