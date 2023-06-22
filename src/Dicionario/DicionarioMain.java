package Dicionario;

import java.util.*;

public class DicionarioMain {
    public static void main(String[] args) {
        HashMap<String,List<String>> aurelios= new HashMap<>();

        List<String> cores = new ArrayList<>();
        cores.add("azul");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("vermelho");
        cores.add("preto");
        cores.add("branco");
        cores.add("rosa");
        cores.add("roxo");

        aurelios.put("Abobora",cores);
        aurelios.put("Baiacu",cores);
        aurelios.put("Casa",cores);
        aurelios.put("dado",cores);
        aurelios.put("escola",cores);
        aurelios.put("Ferradura",cores);

        Dicionario dicionario = new Dicionario();

        dicionario.setDicionario(aurelios);


        System.out.println(dicionario.getDicionario());

        for (Map.Entry<String, List<String>> pair : aurelios.entrySet()) {
            System.out.println(pair.getKey()+"->"+pair.getValue());

        }
    }
}
