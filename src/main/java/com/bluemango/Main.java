package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro horário: "); // solicitando um número inteiro ao usuário
        int horarioInicial = sc.nextInt();
        System.out.print("Segundo horário: "); // solicitando um número inteiro ao usuário
        int horarioFinal = sc.nextInt();
        int horarioTotal;

        if (horarioInicial > horarioFinal) {
            horarioTotal = 24 - horarioInicial + horarioFinal;

        } else {
            horarioTotal = horarioInicial - horarioFinal;
            // imprimindo o resultado
        }

        if(horarioTotal == 0) {
            horarioTotal = 24; 
        }



        System.out.println("O jogo durou " + horarioTotal + " horas");
     

        sc.close();
    }
}