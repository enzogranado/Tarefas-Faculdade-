import java.util.Scanner;
public class duplocondicional {
   public static void main(String[] args) {
    System.out.println("O respectivo programa calculará se você deve votar ou não com base em seu ano de nasmento");
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite seu ano de nasmento");
    int birth = teclado.nextInt();
    System.out.println("Digite o ano em que você esta");
    int ano = teclado.nextInt(); 
    int idade = ano - birth; 
    if (idade<=16){
        System.out.println("Você não precisa votar");
    }
    else {
        if(idade>= 16 && idade<18 || idade>70){ // se idade maior ou igual a 16 e menor que 18, ou, idade maior que 70
            System.out.println("O voto é opcional");
        }
        else{
            System.out.println("O voto é obrigatório");
        }
    }
    teclado.close();
   } 
}
