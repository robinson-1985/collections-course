package one.digitalinnovation.list.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");  // o método recebe um inteiro e um elemento: troca uma posição por outra.

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);     // remove: retira o index que foi pedido.

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3); // o get é um comando que printa o index que é selecionado.

        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos"); // retorna o indice do elemento que está na lista

        System.out.println(posicao);

        int tamanho = nomes.size(); // size: retona quantos elementos temos em nossa lista.

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");  // retorna um booleano

        System.out.println(temAnderson);   // retorna uma list dizendo se tem ou não: aqui temos true.

        boolean temFernando = nomes.contains("Fernando");  // retorna um booleano

        System.out.println(temFernando);   // retorna uma list dizendo se tem ou não: aqui tem um false.

        boolean listaEstaVazia = nomes.isEmpty();   // ele retorna simplesmente um booleano;

        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {

            System.out.println("--->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("----->" + iterator.next());
        }

        nomes.clear();

        listaEstaVazia = nomes.isEmpty();   // ele retorna simplesmente um booleano;

        System.out.println(listaEstaVazia);



    }
}
