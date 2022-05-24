package com.jainejosiane;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */

import java.util.Scanner;

public class ProgramaMaisVelho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        String[] nomes = new String[pessoas];
        int[] idades = new int[pessoas];

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelha = 0;
        for (int i = 0; i < pessoas; i++) {
            if (idades[i] > maisVelha) {
                maisVelha += idades[i];
            }
        }

        System.out.print("Pessoa mais velha:");

        for (int i = 0; i < pessoas; i++) {
            if (idades[i] == maisVelha) {
                System.out.print(" " + nomes[i]);
            }
        }

        sc.close();
    }
}