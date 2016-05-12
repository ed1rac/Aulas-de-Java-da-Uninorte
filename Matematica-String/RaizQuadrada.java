/*	Programa: RaizQuadrada
    Função: Aplicativo que mostra o uso do método sqrt
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: ED - 68 - com alteraçõµes             
*/
import javax.swing.JOptionPane;
public class RaizQuadrada {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o número"));
        		JOptionPane.showMessageDialog(null, "Raiz quadrada de: " +
                "\n" + num1 + " = " + Math.sqrt(num1));
        System.exit(0);
    }
}

