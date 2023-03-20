package tests.Teste3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;


public class DadosControle {

    ArrayList<Dados> arrayDados;
    Dados dado;


    public ArrayList convertDados() {

        arrayDados = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            JSONArray dadosArquivo = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream
                    ("files/dados.json"), "UTF-8"));

            for (Object o : dadosArquivo) {
                JSONObject json = (JSONObject) o;
                int dia = Integer.parseInt(json.get("dia").toString());
                double valor = Double.parseDouble(json.get("valor").toString().replace(",", ""));

                dado = new Dados();
                dado.setDia(dia);
                dado.setValor(valor);
                arrayDados.add(dado);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayDados;
    }

    public ArrayList<Dados> averageDados(ArrayList<Dados> dados){
        ArrayList<Dados> arrayDados = new ArrayList<>();

        //para somar todos os valores
        double total=0.0;
        for (Dados value : dados) {
            total += value.getValor();
        }

        System.out.println("\nTotal de Faturamento(mês): " + NumberFormat.getCurrencyInstance().format(total));

        //media dos valores do mês
        double media = total/21;

        System.out.println("\nMédia dos valores(mês): " + NumberFormat.getCurrencyInstance().format(media));

        System.out.println("\n------------------------------------ " +
                "\nDias em que o valor, foi maior que a Média");
        //trazer valores superiores a média mensal
        for (int i = 0; i < dados.size(); i++) {
            //System.out.println();
            if(dados.get(i).getValor()>media){
                //valor1=dados.get(i).getValor();
                arrayDados.add(dados.get(i));
            }
        }
        return arrayDados;
    }
}


