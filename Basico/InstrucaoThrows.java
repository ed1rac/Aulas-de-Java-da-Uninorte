/*	Programa: InstrucaoThrows
    Fun��o: Aplicativo que mostra o uso da instru��o Throws
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: ED - 59             
*/
import javax.swing.JOptionPane;
public class InstrucaoThrows {
    public static void main(String args[]){
        float nota = Float.parseFloat(
            JOptionPane.showInputDialog("Forne�a um n�mero entre 0 e 10"));
        try{
            if (nota < 0 || nota > 10){
                throw new Exception ("Fora da faixa permitida (0 a 10)");
            }
            //continua a execu��o normalmente
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro.toString());
        }
        System.exit(0);
    }
}