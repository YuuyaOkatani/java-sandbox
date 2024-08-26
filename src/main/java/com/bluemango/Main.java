package com.bluemango;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 

       System.out.println("Digite o primeiro, segundo e terceiro nome: ");
       String firstName = sc.nextLine(); 
       String secondName = sc.nextLine(); 
       String thirdName = sc.nextLine();
       char firstChar = firstName.charAt(0);
       System.out.println("Nome completo: " + firstName + " " + secondName + " " + thirdName);
       System.out.println("Primeira letra do nome: " + firstChar);
       System.out.print("Digite o primeiro número: ");
       int num1 = sc.nextInt(); 
       System.out.print("Digite o segundo número: ");
       double num2 = sc.nextDouble();

       int sum = (int) ( num1 + num2);
       System.out.println("Soma dos dois números: " + sum);
       




       sc.close();
    }
}