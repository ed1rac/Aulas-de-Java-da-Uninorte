/*  Programa: GetMessageEPrintStackTrace
    Função: Aplicativo que mostra o uso de GetMessage e PrintStackTrace
    Data: 23/05/2014 -  Autor: Edkallenn
    Observações: ED - 59             
*/
public class GetMessageEPrintStackTrace {
    public static void main(String args[]) {
        int x = 10;
        try {
            int y = x / 0; // gera uma excecao
        }
        catch (Exception erro) {
            System.out.println(erro.getMessage()); 
            erro.printStackTrace(); 
        }
    }
}

























