/*	Programa: RestoInteiro.java - pasta Basico/Exercicios
*	Função: Aplicativo que mostra o resto da divisão de dois numeros
*	Data: 23/05/2009 -	Autor: Edkallenn
*	Observações: 					
*/
import java.util.Scanner;	//programa utiliza a classe scanner

public class RestoInteiro{
	
	public static void main(String[] args) {
		
		System.out.println("\nPrograma que calcula o resto da divisao de 2 inteiros\n");
		
		//cria scanner para obter entrada de dados
		Scanner entrada = new Scanner(System.in);	
		int num1, num2, resto;  //tres variáveis inteiras
		
		//solicita os numeros
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt();	//lê o primeiro inteiro fornecido pelo usuário
		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();	//lê o segundo inteiro 
				
		resto = num1 % num2;
		
		System.out.printf("%d mod %d = %d", num1, num2, resto);		
		
	}// fim do método main
}// fim da classe 
