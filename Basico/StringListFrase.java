/*	Programa: StringListFrase  -	Fun��o: Aplicativo que mostra constru��o de frases
	Data: 23/05/2014 -	Autor: Edkallenn
	Observa��es: Use a cabe�a - altera��es do professor               
*/

public class StringListFrase {
    public static void main(String args[]) {
        String[] Lista1={"24/7", "V�rias camadas", "30.000 metros", "Business2Business",
                        "Todos ganham", "front-end","baseado na web", "difundido", "inteligente",
                        "seis sigma", "caminho cr�tico", "din�mico"};
        String[] Lista2={"habilitado", "adesivo", "valor agrgado", "orientado",
                        "central", "distribu�do","agrupado", "solidificado", "independente de m�quina",
                        "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
                        "compartilhado", "cooperativo", "acelerado"};
        String[] Lista3={"processo", "ponto m�ximo", "solu��o", "arquitetura",
                        "habilita��o no n�cleo", "estrat�gia","mindshare", "portal", "espa�o",
                        "vis�o", "paradigma", "miss�o"};

        int tamLista1 = Lista1.length;
        int tamLista2 = Lista2.length;
        int tamLista3 = Lista3.length;


        int rand1 = (int) (Math.random() * tamLista1);
        int rand2 = (int) (Math.random() * tamLista2);
        int rand3 = (int) (Math.random() * tamLista3);

        String frase = Lista1[rand1] + " " + Lista2[rand2] + " " + Lista3[rand3] + " " +
                        Lista1[rand3] + " " + Lista2[rand1] + " " + Lista3[rand2];

        System.out.println("Programa que gera frase automaticamente");
        System.out.println(frase);
    }
}