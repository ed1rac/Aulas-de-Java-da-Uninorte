/*	Programa: AdicaoModoGrafico.java
	Função: Aplicativo que mostra saida de dados em duas linhas
	Data: 23/05/2014
	Autor: Edkallenn
	Observações: Deitel - 4 Ed. - p. 105
*/
import javax.swing.JOptionPane;

public class AdicaoModoGrafico{	
	//método principal, onde inicia a execução do aplicativo java
	public static void main(String[] args){
		String primeiroNumero, segundoNumero; // Strings inseridas pelo usuário
		int num1, num2;			// Numeros inseridos pelo usuário
		int soma;				// soma de num1 e num2
		
		//lê o primeiroNumero do usuário como uma String
		primeiroNumero = JOptionPane.showInputDialog("Entre com o primeiro inteiro: ")	////lê o primeiroNumero do usuário como uma String
		segundoNumero = JOptionPane.showInputDialog("Entre com o segundo inteiro: ");		
		//Converte os numeros do tipo String para o tipo int
		num1 = Integer.parseInt(primeiroNumero);
		num2 = Integer.parseInt(segundoNumero);
		
		//adiciona os numeros
		soma = num1 + num2;		
		//exibe os resultados
		JOptionPane.showMessageDialog (null, 
		"A soma de  " + num1 + " e " + num2 + " = " + soma, "Resultados", JOptionPane.PLAIN_MESSAGE);			
	}// fim do método main
}// fim da classe BemVindo
