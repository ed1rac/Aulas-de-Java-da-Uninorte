/*  Programa: MaxMin
    Fun��o: Aplicativo que mostra o uso dos m�todos max e min
    Data: 23/05/2014 -  Autor: Edkallenn
    Observações: ED - 68 - com alterações             
*/
import javax.swing.JOptionPane;
public class MaxMin {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�aa o 1� n�mero"));
        float num2 = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o 2� n�mero"));
        JOptionPane.showMessageDialog(null, "N�meros fornecidos: " + num1 + " , " + num2 +
                "\nO maior � " + Math.max(num1, num2) +
                "\nO menor � " + Math.min(num1, num2));
        System.exit(0);
    }
}



