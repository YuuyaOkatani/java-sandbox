package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.next();
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.print("Digite a nacionalidade da pessoa: ");
        String nacionalidade = sc.next();

        

        System.out.println("Digite o salário do trabalhador: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o setor do trabalhador: ");
        String setor = sc.next();
        Trabalhador pessoa = new Trabalhador(nome, idade, nacionalidade , salario, setor);

        System.out.println("Pessoa criada: " + pessoa.getIdade());
        // ótimo exemplo do polimorfismo 
        






        sc.close();
    }
}