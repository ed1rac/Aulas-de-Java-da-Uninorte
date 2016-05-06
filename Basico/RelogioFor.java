/*	Programa: RelogioFor.java
	Função: Demonstra o uso do for
	Data: 23/05/2014
	Autor: Edkallenn
	Observações: JAVA - ED - 61
*/
public class RelogioFor{	
	//método principal, onde inicia a execução do aplicativo java
	public static void main(String[] args){
		int horas, minutos, segundos;
		for(horas=0;horas<=24;horas++){
			for(minutos=0;minutos<=60;minutos++){
				for(segundos=0;segundos<=60;segundos++){
					System.out.println(horas + "h:"+ minutos + "min: "+ segundos + "s");
					try{
						Thread.sleep(1000); //temporizador - espera 1000 ms até a próxima
						if(segundos== 20)	//instrução
							System.exit(0);
					}
					catch(InterruptedException erro){	//temporizador pode gerar erro
						erro.toString();
					}
				}
				
			}
			
		}
		System.exit(0);
					
	}// fim do método main
}// fim da classe RelogioFor
