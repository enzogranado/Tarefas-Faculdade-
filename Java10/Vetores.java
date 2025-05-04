import java.util.Scanner; 
public class Vetores {
    public static void main(String[] args) {
        // declarando variaveis 
        //int n[] = {0,3,4,7}; 
        /*for (int c = 0; c<=3; c++){
            System.out.println("na posição " + c + " temos o valor " + n[c] + " no lugar" );
        } */
       /*for (int c = 0; c<=n.length; c++){ // na teoria vai de 0,1,2,3
       
        System.out.println("! " + n.length);
       }*/ 
        System.out.println("O ano em que você esta é bissesto? (s ou n)");
        Scanner teclado = new Scanner(System.in); 
        String resp = teclado.nextLine(); 
            if (resp.equals("n")){
                String mes [] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "aug", "set", "out", "nov", "dez"};
        int dia [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        for (int i = 0; i<mes.length; i++){
            System.out.println("o mês " + mes[i] + " tem " + dia[i] + " dias");  // o "i" é o contador, ou seja temos que trocar o cotador por qualquer valor que queremos usar.
            }
        }
            else{
                String mes2 [] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "aug", "set", "out", "nov", "dez"};
        int dia2 [] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        for (int i = 0; i<mes2.length; i++){
            System.out.println("o mês " + mes2[i] + " tem " + dia2[i] + " dias");  // o "i" é o contador, ou seja temos que trocar o cotador por qualquer valor que queremos usar.
            }       
        }
        teclado.close(); 
    }
}
