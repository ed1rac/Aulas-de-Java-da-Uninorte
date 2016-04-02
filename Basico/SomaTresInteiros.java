/*	Programa: SomaTresInteiros.java - pasta Basico
*	Função: Aplicativo que mostra a soma de 3 inteiros
*	Data: 23/05/2009 -	Autor: Edkallenn
*	Observações: 
*/
import java.util.Scanner;	//programa utiliza a classe scanner

public class SomaTresInteiros{

	public static void main(String[] args) {
		
		System.out.println("\nPrograma que calcula a soma de 3 inteiros\n");
		
		//cria scanner para obter entrada de dados
		Scanner entrada = new Scanner(System.in);	
		int num1, num2, num3, soma;  //quatro variáveis inteiras
		
		//solicita os numeros
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt(); //lê o primeiro inteiro fornecido pelo usuário
		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();	//lê o segundo inteiro 
		System.out.print("Digite o terceiro numero: ");
		num3 = entrada.nextInt();	//lê o terceiro inteiro
		
		soma = num1 + num2 + num3;		
		System.out.printf("A soma de %d + %d + %d eh %d", num1, num2, num3, soma);		
		
	}// fim do método main
}// fim da classe 
