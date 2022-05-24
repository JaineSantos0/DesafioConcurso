package com.jainejosiane;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int alunos = sc.nextInt();
        System.out.println();

        String[] nomes = new String[alunos];
        double[] notas1Semestre = new double[alunos];
        double[] notas2Semestre = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Dados do " + (i + 1) + "o aluno: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Nota do 1o semestre: ");
            notas1Semestre[i] = sc.nextDouble();
            System.out.print("Nota do 2o semestre: ");
            notas2Semestre[i] = sc.nextDouble();
            System.out.println();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < alunos; i++) {
            double media = (notas1Semestre[i] + notas2Semestre[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}