import java.util.Scanner;
public class cases {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("quantas pernas vc tem? ");
        int nperna = teclado.nextInt(); 
        String tipo; 
        switch (nperna){
            case 1:
                tipo = "saci";
            break;
            case 2:
                tipo = "bipede";
            break;
            case  3: 
                tipo = "Tripê";
            break;
            case 4:
                tipo = "Quadrupede";
            break;
            case 5,6:
                tipo = "Aranha";   
            break;
            default: // esse malandro significa que tudo diferente vai ser "ET"
                tipo = "ET";
        }
        System.out.println("Você é um(a) " + tipo);
        teclado.close();         
    }
}