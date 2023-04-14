package Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int cost = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("How much coffee do you want to buy?: ");
    int num = sc.nextInt();

//        Coffee coffee = Coffee.S

    String coffee = sc.nextLine();
    coffee = sc.nextLine();
//    System.out.println(Coffee.coffee.cost);

//    for (int i = 0; i < num; i++) {
//        System.out.print("What sized coffee do you want to get (s, m, l): ");
//        String coffee = sc.nextLine();
//        Coffee c = Coffee.valueOf(coffee);
//        cost += c.cost;
//    }
    System.out.println(cost);

    }
}


