public class Exemplo {


    public static void main(String[] args) {

        int x = 20;

        Object obj = x;// Boxing é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível

        System.out.println(obj);

        int y = (int) obj;// Unboxing é o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível

        System.out.println(y);

    }
}