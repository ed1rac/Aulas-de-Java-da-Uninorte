/*	Programa: if-else.java - pasta b�sico
	Fun��o: Mostra o uso do if com o else
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: Java 7 - ED - p. 50 com altera��es do professor
*/
import javax.swing.*;
public class IfElse {
    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog("Forne�a um valor num�rico entre 0 e 10");
        if (aux != null) {                          //caso o usu�rio n�o clicar em cancelar ou digitar strings
            try {                                   //tratamento de exce��o com a cl�usula try
                float x = Float.parseFloat(aux);
                if (x >= 0 && x <= 10) {
                    JOptionPane.showMessageDialog(null, "Nota = " + x + ", valor v�lido!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Nota = " + x + ", valor inv�lido!");
                }
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores num�ricos - \n"
                        + erro.toString());
            }
        }
        System.exit(0);
    }
}
