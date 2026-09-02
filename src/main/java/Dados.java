import javax.swing.JOptionPane;
public class Dados {
    public static void main(String [] args){
        String nome = JOptionPane.showInputDialog("Seu Nome ");
        String cidade = JOptionPane.showInputDialog("Sua cidade ");

        System.out.println("Oi " + nome +"! " + "Que legal que você é de " + cidade);
    }
}
