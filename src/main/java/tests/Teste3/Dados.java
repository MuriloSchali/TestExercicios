package tests.Teste3;


import java.text.DecimalFormat;
import java.util.ArrayList;

class Dados {

    int dia;
    double valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void print(ArrayList<Dados> dados) {

        DecimalFormat df;
        df = new DecimalFormat("   #,##0.00");
        System.out.println("------------------------------------");
        System.out.printf("%7s", "Dia");
        System.out.printf("%13s", "Valor");
        System.out.println();

        for (int i = 0; i < dados.size(); i++) {
            System.out.printf("%7s", dados.get(i).getDia());
            System.out.printf("%13s", df.format(dados.get(i).getValor()));
            System.out.println("");
        }
    }
}
