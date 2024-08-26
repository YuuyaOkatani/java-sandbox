package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro horário: "); // solicitando um número inteiro ao usuário
        int a = sc.nextInt();
        System.out.print("Segundo horário: "); // solicitando um número inteiro ao usuário
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}