package com.jainejosiane;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */

import java.util.Scanner;

public class ProgramaSomaVetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números para cada vetor: ");
        int numeros = sc.nextInt();

        int[] vectA = new int[numeros];
        int[] vectB = new int[numeros];
        int[] vectC = new int[numeros];

        System.out.println("Digite os números do vetor A: ");

        for (int i = 0; i < numeros; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os números do vetor B: ");

        for (int i = 0; i < numeros; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor resultante ou C: ");

        for (int i = 0; i < numeros; i++) {
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}