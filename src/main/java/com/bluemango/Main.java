package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o npumero de elementos: ");
        int num = sc.nextInt(); // número de elementos dentro de um vetor
        double[] vect = new double[num]; // um vetor

        for(int i = 0; i < num; i++) {
            System.out.print("Digite um número: ");  // pedir um número para colocar dentro do vetor
            vect[i] = sc.nextDouble(); // colocar um número dentro do vetor

        }
        System.out.print("Numeros do vetor: "); 

        for( double n : vect) {
            System.out.print(n + " ");  // imprimir todos os números do vetor
        }

        // este bloco de comando pode ser muito util no futuro.
        // Isso é mesmo muito empolgante HAHHhhahha. 




        
     

        sc.close();
    }
}