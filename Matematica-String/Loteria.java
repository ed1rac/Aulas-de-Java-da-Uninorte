/*	Programa: Loteria
    Fun��o: Aplicativo que mostra o uso do m�todo random
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 69 - com altera���es             
*/
import javax.swing.JOptionPane;
public class Loteria {
    public static void main(String args[]) {
    	for(int cartao = 1;cartao <=5; cartao++){
    		String numerosCartao = "";
    		for(int numCartao=1; numCartao<= 6; numCartao++){
    			int num = (int) (Math.random() * 60) + 1;
    			numerosCartao+= num + "  ";
    		}    		
        JOptionPane.showMessageDialog(null, "N�meros do Cart�o: " +
                cartao + "\n" + numerosCartao);
       }
       System.exit(0);
	}
}
