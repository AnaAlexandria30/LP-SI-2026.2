import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
      String pesoString = JOptionPane.showInputDialog("Seu peso");
      double peso = Double.parseDouble(pesoString);
      String alturaStr = JOptionPane.showInputDialog("Sua altura");
      double altura = Double.parseDouble(alturaStr);
      double imc = peso / (altura * altura);
      JOptionPane.showMessageDialog(null,"Seu IMC é de " + imc);
    }
}