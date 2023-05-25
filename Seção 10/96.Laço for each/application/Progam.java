package application;

public class Progam {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);// vect[i] = vect na posição i
        }

        System.out.println("----------------------------");

        for (String obj : vect) {// Para cada objeto obj contido em vect
            System.out.println(obj);
        }
    }
}