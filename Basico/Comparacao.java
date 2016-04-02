/*	Programa: Comparacao.java - pasta Basico
*	Função: Aplicativo para exemplificar os op. relacionais e logicos
*	Data: 23/05/2009 -	Autor: Edkallenn
*	Observações: 					
*/
import java.util.Scanner;	//programa utiliza a classe scanner

public class Comparacao{	
	public static void main(String[] args) {		
		System.out.println("\nPrograma que compara numeros\n");		
		//cria scanner para obter entrada de dados
		Scanner entrada = new Scanner(System.in);	
		int num1, num2;  //numeros a comparar
		
		//solicita os numeros
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt();	//lê o primeiro inteiro fornecido pelo usuário
		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();	//lê o segundo inteiro 
		
		if(num1==num2)
			System.out.printf("%d == %d\n", num1, num2);
		if(num1!=num2)
			System.out.printf("%d != %d\n", num1, num2);
		if(num1<num2)
			System.out.printf("%d < %d\n", num1, num2);	
		if(num1>num2)
			System.out.printf("%d > %d\n", num1, num2);
		if(num1<=num2)
			System.out.printf("%d <= %d\n", num1, num2);
		if(num1>=num2)
			System.out.printf("%d >= %d\n", num1, num2);
				
	}// fim do método main
}// fim da classe 
