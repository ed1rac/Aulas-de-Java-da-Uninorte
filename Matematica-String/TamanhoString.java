/*	Programa: TamanhoString
        Fun��o: Aplicativo que mostra o uso do m�todo length
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 73 - com altera���es             
*/
import javax.swing.JOptionPane;
public class TamanhoString {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forne�a um texto: ");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Texto: " + frase + "\n" + 
                "quantidade de caracteres: " + tamanho);
        System.exit(0);
    }
}

