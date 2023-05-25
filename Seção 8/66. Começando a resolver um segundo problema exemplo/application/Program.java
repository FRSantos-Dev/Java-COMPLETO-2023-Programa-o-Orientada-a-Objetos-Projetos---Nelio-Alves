package application;

import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class Program {

    Locale setDefaultLocale(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Entert product data: ");
    System.out.println("Name: ");
    product.name = sc.nextLine();
    System.out.println("Price: ");
    product.price = sc.nextDouble();
    System.out.println("Quantity in stock: ");
    product.quantity = sc.nextInt();


    sc.close();
}
