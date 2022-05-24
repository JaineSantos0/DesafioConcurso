package com.jainejosiane;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas: ");
        int quantidade = sc.nextInt();

        double[] alturas = new double[quantidade];
        String[] generos = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            generos[i] = sc.next().toLowerCase();
        }

        double alturaMaior = 0;
        for (int i = 0; i < quantidade; i++) {
            if (alturas[i] > alturaMaior) {
                alturaMaior = alturas[i];
            }
        }

        double alturaMenor = 0;
        for (int i = 0; i < quantidade; i++) {
            if (alturas[i] > alturaMenor) {
                alturaMenor = alturas[i];
            } else if (alturas[i] < alturaMenor) {
                alturaMenor = alturas[i];
            }
        }

        double somaAlturasF = 0;
        for (int i = 0; i < quantidade; i++) {
            if (generos[i].equals("f")) {
                somaAlturasF += alturas[i];
            }
        }

        int quantidadeAlturasF = 0;
        for (int i = 0; i < quantidade; i++) {
            if (generos[i].equals("f")) {
                quantidadeAlturasF++;
            }
        }

        int quantidadeAlturasM = 0;
        for (int i = 0; i < quantidade; i++) {
            if (generos[i].equals("m")) {
                quantidadeAlturasM++;
            }
        }

        System.out.printf("Menor altura: %.2f%n",alturaMenor);

        System.out.printf("Maior altura: %.2f%n",alturaMaior);

        double mediaAlturasF = somaAlturasF / quantidadeAlturasF;
        System.out.printf("Média das altura das mulheres: %.2f%n",mediaAlturasF);

        System.out.println("Número de homens: " + quantidadeAlturasM);

        sc.close();
    }
}