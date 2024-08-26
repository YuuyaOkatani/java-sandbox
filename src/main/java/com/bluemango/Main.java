package com.bluemango;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 

       System.out.println("Digite o primeiro, segundo e terceiro nome: ");
       String firstName = sc.nextLine(); 
       String secondName = sc.nextLine(); 
       String thirdName = sc.nextLine();
       System.out.println("Nome completo: " + firstName + " " + secondName + " " + thirdName);


       sc.close();
    }
}