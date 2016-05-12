/*	Programa: Localizacao
    Função: Aplicativo que mostra o uso de localização em Java
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: ED - 72 - com alterações             
*/
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
public class Localizacao {
    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        double valor = 1370.25;
        if (local.getCountry().equals("BR")) {
            df.applyPattern("R$ #,##0.00");
        }
        JOptionPane.showMessageDialog(null, "Configuracoes do Sistema Operacional:" +
            "\nSigla: " + local.getCountry() +
            "\nPais: " + local.getDisplayCountry() +
            "\nIdioma: " + local.getDisplayLanguage() +
            "\nTeclado: " + local.getDisplayName() +
            "\nvalor: " + df.format(valor));
        System.exit(0);
    }
}