/*	Programa: CaracteresDaString
    Fun��o: Aplicativo que mostra o uso do m�todo charAt
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 74 - com altera���es             
*/
import javax.swing.JOptionPane;
public class CaracteresDaString {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forne�a um texto: ");
        String trecho = "\n", trecho2 = "";
        for(int i=0;i<frase.length();i++){
            trecho = trecho + ("frase[" + i + "]=" + frase.charAt(i) + "\n");

        }
        JOptionPane.showMessageDialog(null, trecho);

        for(int i= 11;i<=14; i++){
            trecho2+=frase.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Frase: " + frase + 
            "\nCaractere 2: " + frase.charAt(1) + 
            "\nTrecho2: " + trecho2);

        System.exit(0);
    }
}

