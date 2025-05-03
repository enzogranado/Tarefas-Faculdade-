import java.util.Scanner;
public class triangulos {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        // O programa vai tentar ver se o triangulo existe e, caso exista, indicará seu tipo. 
        System.out.println("O respectivo programa calculará o tipo do triângulo e se ele é possível");
        System.out.println("Primeiramente, digite a medida de um lado do triangulo ");
        int a = teclado.nextInt();
        System.out.println("Digite a medida do outro lado ");
        int b = teclado.nextInt(); 
        System.out.println("Digite a medida do ultimo lado");
        int c = teclado.nextInt(); 
        int prova1 = a + b;
        int prova2 = a + c;
        int prova3 = b + c; 
        if (c<prova1 || b<prova2 || a<prova3 ){
            System.out.println("Legal, o triângulo existe!!");
        }    
        else{
            System.exit(0);
        }
        System.out.println("Agora vamos determinar o tipo do seu triângulo. ");
        if ((a == b && a != c) || (b == c && b != a)){
            System.out.println("O triângulo é isosceles ");
        }
        if ( a == b && a == c && b == c){
                System.out.println("O triangulo é equilatero "); 
            }
        if (a != b && b != c && c != a ){
            System.out.println("O triangulo é escaleno ");
        }
        /*System.out.println("Por fim, há um ângulo de 90 graus entre um dos lados do triângulo? (sim ou não)");
        String resp = teclado.nextLine().trim();  
        if (resp.equalsIgnoreCase("sim")){
            System.out.println("O triângulo é retângulo.");}
        else if (resp.equalsIgnoreCase("não")) {
            System.out.println("O triângulo não é retângulo");
        }*/
            teclado.close();
        }
     }            
        





 

