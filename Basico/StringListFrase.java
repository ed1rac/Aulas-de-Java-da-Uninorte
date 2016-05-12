/*	Programa: StringListFrase  -	Função: Aplicativo que mostra construção de frases
	Data: 23/05/2014 -	Autor: Edkallenn
	Observações: Use a cabeça - alterações do professor               
*/

public class StringListFrase {
    public static void main(String args[]) {
        String[] Lista1={"24/7", "Várias camadas", "30.000 metros", "Business2Business",
                        "Todos ganham", "front-end","baseado na web", "difundido", "inteligente",
                        "seis sigma", "caminho crítico", "dinâmico"};
        String[] Lista2={"habilitado", "adesivo", "valor agrgado", "orientado",
                        "central", "distribuído","agrupado", "solidificado", "independente de máquina",
                        "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
                        "compartilhado", "cooperativo", "acelerado"};
        String[] Lista3={"processo", "ponto máximo", "solução", "arquitetura",
                        "habilitação no núcleo", "estratégia","mindshare", "portal", "espaço",
                        "visão", "paradigma", "missão"};

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