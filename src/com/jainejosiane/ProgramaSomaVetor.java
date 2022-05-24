package com.jainejosiane;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int valores = sc.nextInt();

        double[] vect = new double[valores];

        for (int i = 0; i < valores; i++) {
            System.out.println("Digite o número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < valores; i++) {
            soma += vect[i];
        }

        for (int i = 0; i < valores; i++) {
            System.out.print(" " + vect[i]);
        }

        System.out.println();
        System.out.print("Valores: ");

        System.out.println();
        System.out.printf("Soma= %.2f",soma);

        double media = soma / valores;
        System.out.println();
        System.out.printf("Média= %.2f",media);

        sc.close();
    }
}