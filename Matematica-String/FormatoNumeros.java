/*	Programa: FormatoNumeros
    Fun��o: Aplicativo que mostra o uso de formatos de n�meros
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 71 - com altera��es             
*/
import java.text.DecimalFormat;
public class FormatoNumeros {
    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat();
        short idade = 38;
        df.applyPattern("000");
        System.out.println(df.format(idade));
        int quantidade = 9750;
        df.applyPattern("#0,000");
        System.out.println(df.format(quantidade));
        long estoque = 198564;
        df.applyPattern("#,##0,000");
        System.out.println(df.format(estoque));
        float altura = 1.74f;
        df.applyPattern("#0.00");
        System.out.println(df.format(altura));
        double peso = 70.25;
        df.applyPattern("#0.00");
        System.out.println(df.format(peso));
        String valorEmReais = "2583.75";
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(Double.parseDouble(valorEmReais)));
    }
}

