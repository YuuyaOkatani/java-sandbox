package com.bluemango;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 

       System.out.print("Entre com um número inteiro: ");  // solicitando um número inteiro ao usuário
       int num = sc.nextInt(); 

       if(num % 2 ==0){
        System.out.println("PAR");
       }
       else{
        System.out.println("IMPAR");
       }






       sc.close();
    }
}