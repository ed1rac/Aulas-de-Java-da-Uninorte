/*	Programa: ExercicioSala
	Função: Exercícios feitos em sala
	Data: 23/05/2014
	Autor: Edkallenn
	Observações: 
*/
import javax.swing.JOptionPane;
import java.util.Scanner;	//programa utiliza a classe scanner

public class ExercicioSala{
  public static void main (String args[]){
    String primeiroNumero, segundoNumero, terceiroNumero; // Strings inseridas pelo usuário
		int num1, num2, num3, mul;			// Numeros inseridos pelo usuário
				
		//lê o primeiroNumero do usuário como uma String
		primeiroNumero = JOptionPane.showInputDialog("Entre com o primeiro inteiro: ");		
		//lê o primeiroNumero do usuário como uma String
		segundoNumero = JOptionPane.showInputDialog("Entre com o segundo inteiro: ");		
		//Converte os numeros do tipo String para o tipo int
		terceiroNumero = JOptionPane.showInputDialog("Entre com o terceiro inteiro: ");		
		//Converte os numeros do tipo String para o tipo int
		num1 = Integer.parseInt(primeiroNumero);
		num2 = Integer.parseInt(segundoNumero);
		num3 = Integer.parseInt(terceiroNumero);
		
		//multiplica os numeros
		mul = num1 * num2 * num3;		
		//exibe os resultados
		JOptionPane.showMessageDialog (null, 
		"A multiplicacao de  " + num1 + " x " + num2 + " x " + num3 + " = " + mul, "Resultados", JOptionPane.PLAIN_MESSAGE);
		
		float reais, dolar;
		Scanner entrada = new Scanner(System.in);	
		//solicita os numeros
		System.out.print("Digite a cotacao do dolar: ");
		dolar = entrada.nextFloat(); //lê o primeiro inteiro fornecido pelo usuário
		System.out.print("Digite a quantidade em reais a ser convertida: ");
		reais = entrada.nextFloat();	//lê o segundo inteiro 
		
		System.out.printf("\n R$ %.2f convertido para dolares a cotacao U$ 1,00 a %.2f = %.2f ", reais, dolar,reais/dolar);	
		
	
		
					
  }
}

