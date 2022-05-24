package com.jainejosiane;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaMaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int numeros = sc.nextInt();

        double[] vect = new double[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite o número: ");
            vect[i] = sc.nextDouble();
        }

        double maiorNumero = 0;
        for (int i = 0; i < numeros; i++) {
            if (vect[i] > maiorNumero) {
                maiorNumero = vect[i];
            }
        }

        System.out.println();
        System.out.println("Maior número: " + maiorNumero);

        System.out.print("Posiçaõ do maior número: ");

        for (int i = 0; i < numeros; i++) {
            if (vect[i] == maiorNumero) {
                System.out.print(i);
            }
        }

        sc.close();
    }
}