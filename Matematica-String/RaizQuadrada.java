/*	Programa: RaizQuadrada
    Fun��o: Aplicativo que mostra o uso do m�todo sqrt
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 68 - com altera���es             
*/
import javax.swing.JOptionPane;
public class RaizQuadrada {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forne�a o n�mero"));
        		JOptionPane.showMessageDialog(null, "Raiz quadrada de: " +
                "\n" + num1 + " = " + Math.sqrt(num1));
        System.exit(0);
    }
}

