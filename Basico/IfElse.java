/*	Programa: if-else.java - pasta básico
	Função: Mostra o uso do if com o else
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: Java 7 - ED - p. 50 com alterações do professor
*/
import javax.swing.*;
public class IfElse {
    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog("Forneça um valor numérico entre 0 e 10");
        if (aux != null) {                          //caso o usuário não clicar em cancelar ou digitar strings
            try {                                   //tratamento de exceção com a cláusula try
                float x = Float.parseFloat(aux);
                if (x >= 0 && x <= 10) {
                    JOptionPane.showMessageDialog(null, "Nota = " + x + ", valor válido!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Nota = " + x + ", valor inválido!");
                }
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos - \n"
                        + erro.toString());
            }
        }
        System.exit(0);
    }
}
