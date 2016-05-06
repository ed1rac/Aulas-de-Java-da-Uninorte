/*	Programa: TryCatch  -	Fun��o: Aplicativo que mostra exemplos o try-catch
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: Java 7 - ED - p. 33                */
//import javax.swing.*;
import javax.swing.JOptionPane;
public class TryCatch {
    public static void main(String args[]) {
        String aux1 = JOptionPane.showInputDialog("Forne�a o valor do 1� n�mero:");
        if (aux1 == null) {
            System.exit(0);}
        String aux2 = JOptionPane.showInputDialog("Forne�a o valor do 2� n�mero:");
        if (aux2 == null) {
            System.exit(0);
        }
        try {
            int num1 = Integer.parseInt(aux1);
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtra��o = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplica��o = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divis�o = " + (num1 / num2));
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Erro de divisao por zero!\n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas n�meros inteiros!\n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}