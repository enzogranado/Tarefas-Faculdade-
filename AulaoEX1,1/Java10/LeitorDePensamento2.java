import javax.swing.JOptionPane;
public class LeitorDePensamento2 {
    public static void main(String[] args) {
        int n =Integer.parseInt (JOptionPane.showInputDialog(null, ("<html> Digite um numero e veremos se o computador pensou nele <br> (Gênio so pensa de 0 a 5)")));
       // r = random 
       double r = Math.random(); 
       int rc = (int) (0 + r * (5-0)); 
       if (n ==  rc){
        JOptionPane.showMessageDialog(null,"Parabéns, você acertou. ");
       }
       if (n>5){
        JOptionPane.showMessageDialog(null,"<html>Animal, digite um numero de 0 a 5 <br> Até um Neandertal é mais inteligente pequepe.");
       }
       else{
        JOptionPane.showMessageDialog(null, "<html>Você errou, o gênio pensou em: <br>" + rc ); 
       }
    }
    
    }
    
