package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt(); 

        while (senha != 2002) {
            System.out.println("Senha invalida!");
            System.out.print("Tente novamente: ");
            senha = sc.nextInt();
            
        }

        System.out.println("Acesso permitido! ");


        
     

        sc.close();
    }
}