/*	Programa: ConversaoDeTipos
	Função: Aplicativo que mostra exemplos de Conversao De Tipos
	Data: 23/05/2014
	Autor: Edkallenn
	Observações: Java 7 - ED - p. 41
*/
public class ConversaoDeTipos {
   
   public static void main(String args[]) {
    try{
	
        double nota1, nota2, trabalho, media;
        nota1 = Double.parseDouble(args[0]);
        nota2 = Double.parseDouble(args[1]);
        trabalho = Double.parseDouble(args[2]);
        media = (nota1 + nota2 + trabalho) / 3;
        System.out.println("Media = " + media);
	}
    catch(ArrayIndexOutOfBoundsException erro){
        System.out.println("Digite as tres notas!!" + erro.toString());
    }
    }
}




