/*
Fazer um programa para ler dois númeroa inteiros M e N,
e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições.
Em seguida, ler um número inteiro X que pertence à matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X,
quando houver, conforme exemplo.
*/

import java.util.Scanner;

public class MatrizesExe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();// lendo número inteiro M
        int n = sc.nextInt();// lendo número inteiro N
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {// lendo matriz
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();// lendo número inteiro X
        sc.close();
    }
}
