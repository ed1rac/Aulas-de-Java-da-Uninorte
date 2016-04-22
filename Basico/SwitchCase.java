/*	Programa: SwitchCase.java - pasta b�sico
	Fun��o: Mostra o uso da estrutura switch...case
	Data: 23/06/2014
	Autor: Edkallenn
	Observa��es: Java 7 - ED - p. 53 com altera��es do professor
                 - lembrar se sempre abrir na codifica��o Windows 1252
*/
import javax.swing.*;
public class SwitchCase {
    public static void main(String args[]) {
        String diaDaSemana = JOptionPane.showInputDialog("Forne�a um n�mero inteiro entre 1 e 7:");
        if (diaDaSemana != null) {
            try {
                int dia = Integer.parseInt(diaDaSemana);
                String extenso = "";
                switch (dia) {
                    case 1:  extenso = "Domingo";  break;
                    case 2:  extenso = "Segunda";  break;
                    case 3:  extenso = "Ter�a";    break;
                    case 4:  extenso = "Quarta";   break;
                    case 5:  extenso = "Quinta";   break;
                    case 6:  extenso = "Sexta";    break;
                    case 7:  extenso = "S�bado";   break;
                    default: extenso = "Dia da Semana Desconhecido!";
                }
                JOptionPane.showMessageDialog(null, "N�mero fornecido: " + extenso);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores num�ricos inteiros!\n"
                        + erro.toString());
            }
        }
        System.exit(0);
    }
}