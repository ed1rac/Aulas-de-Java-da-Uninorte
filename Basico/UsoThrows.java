/*	Programa: UsoThrows
    Fun��o: Aplicativo que mostra o uso da cl�usula Throws
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 58             
*/
import java.io.*;
public class UsoThrows {
    public static void main(String args[]) throws IOException  {
       BufferedReader dado;
       System.out.println("Entre com seu nome:");
       dado = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Seu nome � " + dado.readLine());
    }
}