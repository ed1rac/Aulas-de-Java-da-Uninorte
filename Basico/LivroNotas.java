/*	Programa: LivroNotas.java - pasta Basico
*	Função: Declaração de classe com um método
*	Data: 23/05/2009 -	Autor: Edkallenn
*	Observações: 					
*/
public class LivroNotas{

	String nomeDaDisciplina;

	//construir o objeto já com o nome da disciplina
	LivroNotas(String disciplina){
		//este objeto que ele vai criar vai receber como nome da disciplina a String disciplina
		nomeDaDisciplina = disciplina;
	}

	//algo que imprime na tela a propriedade nomeDaDisciplina
	public void imprimeNomeDaDisciplina(){
		
		System.out.println(nomeDaDisciplina);
	}
	
	public void exibeMensagem() {				
		//exibe uma mensagem de boas-vindas para o usuário
		System.out.println("Bem vindo ao livro de notas de " + nomeDaDisciplina);				
	}// fim do método 

	public void exibeMensagem(String disciplina){
		System.out.println("Seja bem vindo ao Livro de Notas de " + disciplina);
	}

}// fim da classe 
