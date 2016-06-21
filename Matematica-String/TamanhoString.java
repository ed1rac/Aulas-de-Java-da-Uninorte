/*	Programa: TamanhoString
        Função: Aplicativo que mostra o uso do método length
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: ED - 73 - com alteraçõµes             
*/
import javax.swing.JOptionPane;
public class TamanhoString {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forneça um texto: ");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Texto: " + frase + "\n" + 
                "quantidade de caracteres: " + tamanho);
        System.exit(0);
    }
}

