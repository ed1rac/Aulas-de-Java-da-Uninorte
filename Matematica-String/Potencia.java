/*	Programa: Potencia
    Função: Aplicativo que mostra o uso do método pow
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: ED - 69 - com alteraçõµes             
*/
import javax.swing.JOptionPane;
public class Potencia {
    public static void main(String args[]) {
        float base = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça a base"));
        float expoente = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o expoente"));
        JOptionPane.showMessageDialog(null, "Potência com  pow" +
                "\nBase = " + base + 
                "\nExpoente = " + expoente +
                "\nResultado = " + Math.pow(base,expoente));
        System.exit(0);
    }
}

