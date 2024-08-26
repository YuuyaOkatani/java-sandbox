package com.bluemango;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 

       System.out.print("Digite o primeiro número: ");
       int a = sc.nextInt(); 
       System.out.print("Digite o segundo número: ");
       int b = sc.nextInt();

       int sum = a + b;
       System.out.println("The sum of " + a + " and " + b + " is: " + sum);

       sc.close();
    }
}