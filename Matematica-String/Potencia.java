/*	Programa: Potencia
    Fun��o: Aplicativo que mostra o uso do m�todo pow
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 69 - com altera���es             
*/
import javax.swing.JOptionPane;
public class Potencia {
    public static void main(String args[]) {
        float base = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a a base"));
        float expoente = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o expoente"));
        JOptionPane.showMessageDialog(null, "Pot�ncia com  pow" +
                "\nBase = " + base + 
                "\nExpoente = " + expoente +
                "\nResultado = " + Math.pow(base,expoente));
        System.exit(0);
    }
}

