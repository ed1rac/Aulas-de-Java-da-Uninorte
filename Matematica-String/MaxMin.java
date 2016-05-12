/*  Programa: MaxMin
    Função: Aplicativo que mostra o uso dos métodos max e min
    Data: 23/05/2014 -  Autor: Edkallenn
    ObservaÃ§Ãµes: ED - 68 - com alteraÃ§Ãµes             
*/
import javax.swing.JOptionPane;
public class MaxMin {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneçaa o 1º número"));
        float num2 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o 2º número"));
        JOptionPane.showMessageDialog(null, "Números fornecidos: " + num1 + " , " + num2 +
                "\nO maior é " + Math.max(num1, num2) +
                "\nO menor é " + Math.min(num1, num2));
        System.exit(0);
    }
}



