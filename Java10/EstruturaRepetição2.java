import java.util.Scanner;
public class EstruturaRepetição2 {
    public static void main(String[] args) {
        /*  int cc = 0;
         do{
            System.out.println("Cambalhota " + cc );
         cc+=1;}
        while(cc<5);*/
        Scanner teclado = new Scanner(System.in);
       
         
        int r = 0; 
        String resp; 
        do { System.out.println("Digite um número");
        int n = teclado.nextInt();
        r+=n; // r = r + n --> r = 0, ent o r vira n 
        System.out.println("Quer continuar? (sim ou não) ");
        resp = teclado.next(); }
        while (resp.equals("s")); 
        System.out.println("A soma é " + r );
        teclado.close(); 
        }
    }

