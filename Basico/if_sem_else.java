/*	Programa: if-sem-else.java - pasta básico
	Função: Mostra o uso do if sem o else
	Data: 23/05/2014
	Autor: Edkallenn
	Observações: Java 7 - ED - p. 49 com alterações do professor
*/
import javax.swing.JOptionPane;
public class if_sem_else {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog("Digite sua resposta: S (SIM) ou N (NÃO)");
        String men = "Letra Fornecida: " + resposta;
        if (!resposta.equals("S") && !resposta.equals("N")){
            men = men + " É inválida! ";
        }
        JOptionPane.showMessageDialog(null, men);
        System.exit(0);
    }
}
