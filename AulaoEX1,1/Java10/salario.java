import java.util.Scanner;
public class salario {

    public static void main(String[]args){

//          o respectivo programa calculara se você é liso ou não de acordo com o seu salário 
       Scanner teclado = new Scanner(System.in);

       System.out.println("Digite seu salário mensal");
       float salario = teclado.nextFloat(); 
       if (salario <= 7000.00){
        System.out.println("Pequepe; vc esta mto liso KKKKKKKKK ");
       }
       else{
        System.out.println("Parabéns, você não esta liso; boa irmão, só regresso tmj!! ");
       }
       teclado.close(); 
    }
}
