package com.jainejosiane;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAbaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int numeros = sc.nextInt();

        double[] vect = new double[numeros];

        System.out.println("Digite o número: ");

        for (int i = 0; i < numeros; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < numeros; i++) {
            soma += vect[i];
        }

        double media = soma/numeros;
        System.out.printf("Media: %.3f",media);
        System.out.println();

        System.out.print("Números abaixo da média: ");

        for (int i = 0; i < numeros; i++) {
            if (vect[i] < media) {
                System.out.printf(" %.1f",vect[i]);
            }
        }

        sc.close();
    }
}