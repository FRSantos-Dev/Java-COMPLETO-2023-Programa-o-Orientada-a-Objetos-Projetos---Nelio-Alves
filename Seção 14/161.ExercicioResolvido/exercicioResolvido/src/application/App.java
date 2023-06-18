package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employees;

public class App{

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();//Criando a lista

        System.out.println("Entre o número de Funcionários: ");
        int n = sc.nextInt();

        for(int i = 1; i < n; i++){
        System.out.println("Funcionário #" + i + "data: ");
        System.out.println("Terceirizado (y/n) ?");
        char ch = sc.next().charAt(0);//Lê o caractere da linha anterior y ou n
        }




        sc.close();
    }
}