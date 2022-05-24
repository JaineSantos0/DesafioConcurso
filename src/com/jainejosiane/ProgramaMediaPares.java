package com.jainejosiane;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaMediaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        int numeros = sc.nextInt();

        int[] vect = new int[numeros];

        System.out.println("Digite o número: ");

        for (int i = 0; i < numeros; i++) {
            vect[i] = sc.nextInt();
        }

        int numerosPares = 0;
        for (int i = 0; i < numeros; i++) {
            if (vect[i] % 2 == 0) {
                numerosPares++;
            }
        }

        int soma = 0;
        for (int i = 0; i < numeros; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
            }
        }

        if (numerosPares == 0) {
            System.out.println("Nenhum número par");
        } else {
            double media = soma / numerosPares;
            System.out.printf("Média dos pares: %.1f", media);
        }

        sc.close();
    }
}