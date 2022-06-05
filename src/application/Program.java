package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner store = new Scanner(System.in);
    
    Product product = new Product();

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = store.nextLine();
    System.out.println("Price: ");
    product.price = store.nextDouble();
    System.out.println("Quantity: ");
    product.quantity = store.nextInt();

    // System.out.println(product.name + ", " + product.price + ", " + product.quantity);

    store.close();
  }
}
