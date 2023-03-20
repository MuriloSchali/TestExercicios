/*
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: SP – R$67.836,43 RJ – R$36.678,66
MG – R$29.229,88 ES – R$27.165,48 Outros – R$19.849,53.

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do
valor total mensal da distribuidora.
 */


package tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Teste4 {

    public static void main(String[] args) {

        double sp = 67836.43 , rj = 36678.66, mg = 29229.88 , es = 27165.48 , outros = 19849.53,
                faturamento = (sp + rj + mg + es + outros);

        System.out.println("\n----- Faturamento em reais por cada Estado -----");
        System.out.println("\nFaturamento de SP: " + NumberFormat.getCurrencyInstance().format(sp));
        System.out.println("\nFaturamento de MG: " + NumberFormat.getCurrencyInstance().format(rj));
        System.out.println("\nFaturamento de RJ: " + NumberFormat.getCurrencyInstance().format(mg));
        System.out.println("\nFaturamento de ES: " + NumberFormat.getCurrencyInstance().format(es));
        System.out.println("\nFaturamento de OUTROS: " + NumberFormat.getCurrencyInstance().format(outros));

        System.out.println("\n-------------------------------------------------\nValor total de Faturamento Mensal: " +
                NumberFormat.getCurrencyInstance().format(faturamento) +
                "\n-------------------------------------------------");

        System.out.println("\n----- Porcentagem por cada Estado -----\n");

        double rs1 = ((sp/faturamento)*100), rs2 = ((rj/faturamento)*100), rs3 = ((mg/faturamento)*100),
                rs4 = ((es/faturamento)*100), rs5 = ((outros/faturamento)*100), rs6 = (rs1 + rs2 + rs3 + rs4 + rs5);

        System.out.println("SP: " +  new DecimalFormat("00.00").format(rs1) + "%");
        System.out.println("RJ: " +  new DecimalFormat("00.00").format(rs2) + "%");
        System.out.println("MG: " +  new DecimalFormat("00.00").format(rs3) + "%");
        System.out.println("ES: " +  new DecimalFormat("00.00").format(rs4) + "%");
        System.out.println("OUTROS: " +  new DecimalFormat("00.00").format(rs5) + "%");

        System.out.println("\nRepresentando: " +  new DecimalFormat("00.00").format(rs6) + "% que as " +
                "porcentagens estão corretas.");
    }
}
