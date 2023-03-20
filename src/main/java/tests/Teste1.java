package tests;

public class Teste1 {

    public static void main (String [] argsString)
    {
        int indice = 13, soma = 0, k = 0;

        while(k < indice){

            k = k + 1;
            soma = soma + k;
        }
        System.out.println("\nO valor da variavel soma, será de noventa e um (" + soma+").");
    }
}
