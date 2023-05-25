import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");// Na posição 2 eu quero adicionar o marco.

        System.out.println(list.size());// Imprime o tamannho da lista.

        list.remove("Anna");// remove usando a String
        list.remove(1);// remove por comparação da posição
        list.removeIf(x -> x.charAt(0) == 'M');// remove usando o predicado(reposta = V || F)

        for (String x : list) {// Para cada String x pertencente a lista.
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));// Retorna o index do Bob.
        System.out.println("Index of Marco: " + list.indexOf("Marco"));// Retorna o index do Marco.
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // Cria uma nova lista com os elementos que começam com a letra A.
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        // Cria uma nova lista com os elementos que começam com a letra J.
        System.out.println(name);

    }
}