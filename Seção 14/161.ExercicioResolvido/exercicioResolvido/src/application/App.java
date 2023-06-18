package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employees;
import entities.OutsourcedEmployee;

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
        System.out.print("Nome: ");
        sc.nextLine();//Lê o nome
        String name = sc.nextLine();
        System.out.print("Horas: ");
        int hours = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valuePerHour = sc.nextDouble();
        if (ch ==  'y'){//se for terceirizado
            System.out.println("Digite o Custo Adicional: ");
            double additionalCharge = sc.nextDouble();
            //Employees emp = new OutsourcedEmployee(name, null, null, null);//Instanciando o funcionário terceirizado
            //list.add(emp);//adicionando o funcionário na lista
            list.add(new OutsourcedEmployee(name, null, null, null));
        }
        else{//se não for terceirizado
            //Employees emp = new Employees(name, hours, valuePerHour);//Instanciando o funcionário--Classe emp não é necessário, pode ser feito direto.
            //list.add(emp);//adicionando o funcionário na lista
            list.add(new Employees(name, null, null))
        }
    }

        sc.close();
    }
}