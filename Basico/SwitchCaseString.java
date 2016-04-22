/*	Programa: SwitchCaseString.java - pasta b�sico
	Fun��o: Mostra o uso da estrutura switch...case com strings
	Data: 23/06/2014
	Autor: Edkallenn
	Observa��es: Java 7 - ED - p. 53 com altera��es do professor
                 - lembrar se sempre abrir na codifica��o Windows 1252
*/
import javax.swing.*;
public class SwitchCaseString {
    public static void main(String args[]) {
        String so = JOptionPane.showInputDialog("Digite o nome de seu sistema operacional:");
        if (so != null) {
            try {                
                switch (so) {
                    case "Windows": case "windows":{
                        JOptionPane.showMessageDialog(null, "O SO Windows foi criado por Bill Gates");
                        break;
                    }
                    case "Linux": case "linux": {
                        JOptionPane.showMessageDialog(null, "O SO linux foi criado por Linus Torvalds");
                        break;
                    }                    
                    default:{ JOptionPane.showMessageDialog(null, "Sistema Operacional desconhcecido");                    
                        break;
                    }
                }                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Esse Erro � muito doido:\n"
                        + erro.toString());
            }
        }
        System.exit(0);
    }
}