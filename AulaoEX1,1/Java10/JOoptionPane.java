import javax.swing.JOptionPane; 
public class JOoptionPane {
    public static void main(String[]args){
        // REQUESITOS: total de valores; qnt de pares; qntd de impares; média; valores acima de 100 
        int n;
        int s = 0;
        int pares = 0;
        int impares = 0;
        int nnumeros = 0; 
        int va = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número (valor 0 interrompe)"));    
            if(n!=0){
                nnumeros++;
            }      
            if (n % 2 == 0){
                pares+=1; 
            } else{
                impares++;
            }
            if (n>100){
                va++;
            }
            s+=n; 
        }  while (n!=0);
        double media = s/nnumeros;  
        JOptionPane.showMessageDialog(null, "<html> De acordo com os números digitados <br> A quantidade de valores digitados é: " + nnumeros +  "<br> A média é: " + media + " <br>A quantidade de números impares é: " + impares +
                "<br> A quantidade de pares é: " + pares + "<br> e a soma é: " + s +"<br> A quantidade de valores menores que 100 é: " + va);         
            }
}
