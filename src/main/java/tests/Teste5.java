/*
Escreva um programa que inverta os caracteres de um string. IMPORTANTE: a) Essa string pode ser informada através
de qualquer entrada de sua preferência ou pode ser previamente definida no código; b) Evite usar funções prontas,
como, por exemplo, reverse;
 */


package tests;

import java.util.Scanner;

public class Teste5 {

    /**
     * Método responsável por reverter a entrada de dados do usuário.
     * @param strOriginal - Entrada de dados do usuário.
     */
    public static void reverterPalavras (String strOriginal){
        String[] listaPalavras = strOriginal.split(" ");
        StringBuilder strInvertida = new StringBuilder();

        for (int i=0; i<listaPalavras.length; i++){
            String palavra = listaPalavras[i];
            StringBuilder palavraInvertida = new StringBuilder();

            for (int j = palavra.length()-1; j >=0; j--){
                palavraInvertida.append(palavra.charAt(j));
            }

            strInvertida.append(palavraInvertida).append(" ");
        }
        System.out.println("Resultado:" + strInvertida);
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nDigite uma palavra ou frase, também pode conter espaços. Exemplo 'Java', " +
                "'Como está seu dia ?' ou uma sequência numérica '123456' : ");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()) {
            System.out.println("Ops! Tente digitar alguma palvra ou frase.");

        } else{
            System.out.println("\nVocê digitou: " + palavra);
            reverterPalavras(palavra);
        }
    }
}

