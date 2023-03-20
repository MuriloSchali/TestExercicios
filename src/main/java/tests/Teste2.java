/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
definido no código;
 */


package tests;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args)  {
        try {
            int n1 = 0, n2 = 1, n3 = 0, i;
            Scanner scan = new Scanner(System.in);
            System.out.println("\nDigite um número que seja da sequência de Fibonacci. ");
            i = scan.nextInt();

            while (i > n3) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }

            if (i == 0) {
                System.out.println("\nO número  está na sequência de Fibonacci. \n O proximo número é: 1 ");
            } else if (i == n3) {
                System.out.println("\nO número " +i+ " está na sequência de Fibonacci. O proximo número é: " +(n1 + i));
            } else {
                System.out.println("\nEste número não faz parte da sequência de Fibonacci.");
            }
        } catch(InputMismatchException e){

            System.out.println("\nTente novamente! Digite somente números.");
        }
    }
}
