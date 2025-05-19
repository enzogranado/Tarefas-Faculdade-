import javax.swing.JOptionPane;
public class saudades{
    public static void main(String[]args){
       int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Qual país você apoia na segunda guerra?<br> (1) Alemanha/Japão/Italia <br> (2) EUA/França/Reino Unido<br> (3) Brasil "));
        switch (escolha) {
            case  1:
                JOptionPane.showMessageDialog(null, "Você é goat");
                break;
            case 2: 
                JOptionPane.showMessageDialog(null,"KKKKKKKKKKKKKKKKKK, viado");
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Boa Brasileiro");
                int alistamento = Integer.parseInt(JOptionPane.showInputDialog(null,"Certo, quantos anos vc tem"));
                if (alistamento>=18){
                    JOptionPane.showMessageDialog(null, "Aliste-se soldado.\n Ou ficar a pátria livre ou morrer pelo brasil!!");}
                else{
                    JOptionPane.showMessageDialog(null, "Nossos soldados cuidarão de você civil!!");
                }
                break;
            default:
            JOptionPane.showMessageDialog(null, "Escolha uma opçao válida!");
        }
    }
}
