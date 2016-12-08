/*	Programa: LivroNotas.java - pasta Basico
*	Função: Cria um objeto e chama seu método
*	Data: 23/05/2009 -	Autor: Edkallenn
*	Observações: 					
*/

public class LivroNotasTeste{
	
	public static void main(String[] args) {
				
		//cria um objeto LivroNotas e atribui a uma variável
		LivroNotas meuLivroNotas = new LivroNotas("Linguagem de Programa��o");
		LivroNotas meuBoletim = new LivroNotas("Estat�stica");

		meuLivroNotas.exibeMensagem();
		meuBoletim.exibeMensagem();
		meuLivroNotas.imprimeNomeDaDisciplina();
		meuBoletim.imprimeNomeDaDisciplina();
	
		//chama o método exibeMensagem de meuLivroNotas
		//meuLivroNotas.exibeMensagem("Estruturas de Dados");	
		
	}// fim do método 
}// fim da classe 
