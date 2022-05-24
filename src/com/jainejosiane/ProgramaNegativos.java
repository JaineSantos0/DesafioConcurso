package com.jainejosiane;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

import java.util.Scanner;

public class ProgramaNegativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int valores = sc.nextInt();


        int[] vect = new int[valores];

        for (int i = 0; i < valores; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");

        for (int i = 0; i < valores; i++) {
            if (vect[i]<0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}