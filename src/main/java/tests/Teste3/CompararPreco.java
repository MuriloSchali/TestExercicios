package tests.Teste3;

import java.util.Comparator;

public class CompararPreco implements Comparator<Dados>{

    //comparar dois argumentos
    @Override
    public int compare( Dados c1, Dados c2) {
        if(c1 == null || c2 == null)
            System.out.println("Preço em Branco!");

        Double preco1 = c1.getValor();
        Double preco2 = c2.getValor();

        return preco1.compareTo(preco2);
    }
}
