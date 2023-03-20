/*
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar,
 que calcule e retorne:

• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:

a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo
da média;
 */


package tests.Teste3;

import java.util.ArrayList;
import java.util.Collections;

public class NewMainDados {

    public static void main(String[] args) {

        Dados dados;
        dados = new Dados();

        DadosControle dadosControle;
        dadosControle = new DadosControle();

        ArrayList dado ;
        dado = dadosControle.convertDados();

        System.out.println("\n Visualizando Informações do Arquivo");
        dados.print(dado);

        CompararPreco cpc;
        cpc = new CompararPreco();
        Collections.sort(dado, cpc);

        System.out.println("\nMenores Dias de Faturamento(Em Ordem)");
        dados.print(dado);

        System.out.println("\nMaiores Dias de Faturamento(Em Ordem)");
        Collections.reverse(dado);
        dados.print(dado);

        System.out.println("\n----------- Média Mensal -----------");
        dados.print(dadosControle.averageDados(dado));


    }
}
