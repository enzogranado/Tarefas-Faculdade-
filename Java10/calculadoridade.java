    import java.util.Scanner;
public class calculadoridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite seu ano de nascimento");
        int ano = teclado.nextInt();
        int idade = (2025 - ano);
        System.out.println("Sua idade em 2025 é: " + idade );

    if (idade >= 18){
        System.out.println("Parabéns, você ja pode ser preso. Se ainda não se alistou esta em divida com seu pais");
    }        
    else{
        System.out.println("Ainda é um bebê, rlxx ");
    }

teclado.close(); 

    }

}
