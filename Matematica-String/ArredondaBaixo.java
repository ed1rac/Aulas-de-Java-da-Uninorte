/*	Programa: ArredondaBaixo
    Fun��o: Aplicativo que mostra o uso do m�todo floor
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 66 - com altera��es             
*/
import javax.swing.JOptionPane;
public class ArredondaBaixo {
    public static void main(String args[]){
        double n1 = 5.2, n2 = 5.6, n3 = -5.8;
        JOptionPane.showMessageDialog(null, "Arredondando com floor: " + 
            "\n" + n1 + "=" + Math.floor(n1) +
            ",   " + n2 + "=" + Math.floor(n2) +
            ",   " + n3 + "=" + Math.floor(n3));
        System.exit(0);        
    }
}