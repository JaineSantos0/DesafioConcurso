package com.jainejosiane;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

import java.util.Scanner;

public class ProgramasNumerosPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int numeros = sc.nextInt();

        int[] vect = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite o número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Números pares: ");

        for (int i = 0; i < numeros; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(" " + vect[i]);
            }
        }

        int quantidade = 0;
        for (int i = 0; i < numeros; i++) {
            if (vect[i] % 2 == 0) {
                quantidade++;
            }
        }

        System.out.println();
        System.out.println("Quantidade pares: " + quantidade);

        sc.close();
    }
}