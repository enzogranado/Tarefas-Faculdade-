import javax.swing.JOptionPane; 
public class Ex13Guanabara {
    public static void main(String[] args) {
        /* o programa a seguir irá conter um valor inicial e um valor final. Mediante a isso 
        o programa deverá fazer a contagem até o valor final respeitando uma instrução, seja ela 
        somar de 1 em 1; 2 em 2 ou whatever. 
         */
       int n = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite um valor inicial"))); 
       int f = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite o valor final"))); 
       int p = Integer.parseInt((JOptionPane.showInputDialog(null, "<html> Digite um valor passo <br> o sistema chegará até o valor final somando de <br> x em x a condição imposta"))); 
       int s = n;  
       String resp = JOptionPane.showInputDialog(null, "<html>O numero inicial é menor que o final?<br>(s ou n)");
        if (resp.equals("s")){
            for (int i = s; i<=f; i+=p){  // aparentemente não posso so fazer int = s        
       System.out.println(i);  // o código antigamente estava f>=i, estava errado pq o laço contunua ate o i ser maior ou igual o f 
       }
    }
       if (resp.equals("n")){
            for (int i = s; i>=f; i-=p){
                System.out.println(i);
            }        
            }       
    }
    }


