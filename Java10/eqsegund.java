import java.util.Scanner; 
public interface eqsegund {
    public static void main(String[]args){
//  vamos tentar fazer um programa que calculará uma eq do segund grau. 
    System.out.println("O programa calculará um equação do segubdo grau");
    System.out.println("Digite o 'a' da equação");
        Scanner teclado = new Scanner(System.in);
    double a = teclado.nextFloat(); 
    System.out.println("Digite o 'b' da equação ");    
    double b = teclado.nextFloat(); 
    System.out.println("Digite o 'c' da equação");
    double c = teclado.nextFloat(); 
    double r1 = ((-1 * b) + Math.sqrt(Math.pow(b,2) -1 * (4 * a *c))) / 2 * a; 
    double r2 = ((-1 * b) - Math.sqrt(Math.pow(b,2) -1 * (4 * a * c))) / 2 * a; 
    System.out.println("As raízes da equação são " + r1 + " e " + r2 );
        teclado.close();   
        
        /* o erro no programa é: Foi esquecido de multiplicar as raízes por -1.
         * a ação é necessaria pois a forma (x - 7) (x - 8)--> sugere que as raizes são 7 e 8 
         */
    }
}
