package com.jainejosiane;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAlturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int numeros = sc.nextInt();

        String [] nomes = new String[numeros];
        int [] idades = new int[numeros];
        double [] alturas = new double[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < numeros; i++) {
            soma = soma + alturas[i];
        }

        double mediaAltura = soma / numeros;
        System.out.println();
        System.out.printf("Altura média: %.2f",mediaAltura);

        double menor16 = 0;
        for (int i = 0; i < numeros; i++) {
            if (idades[i] < 16) {
                menor16++;
            }
        }

        double percentualMenor16 = (menor16 / numeros) * 100;
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.2f",percentualMenor16);
        System.out.println();

        for (int i = 0; i < numeros; i++) {
            if (idades[i] <16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}