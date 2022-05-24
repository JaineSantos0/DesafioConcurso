package com.jainejosiane;

/*
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaComerciante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de mercadorias: ");
        int quantidadeMercadorias = sc.nextInt();
        System.out.println();

        String[] nomeProduto = new String[quantidadeMercadorias];
        double[] precoCompra = new double[quantidadeMercadorias];
        double[] precoVenda = new double[quantidadeMercadorias];

        for (int i = 0; i < quantidadeMercadorias; i++) {
            System.out.println("Produto " + (i + 1) + ": ");
            System.out.print("Nome: ");
            nomeProduto[i] = sc.next();
            System.out.print("Preço compra: ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Preço venda: ");
            precoVenda[i] = sc.nextDouble();
            System.out.println();
        }

        System.out.println();
        System.out.println("RELATÓRIO: ");

        int lucroAbaixo = 0;
        int lucroEntre = 0;
        int lucroAcima = 0;

        for (int i = 0; i < quantidadeMercadorias; i++) {
            double media = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;
            if (media < 10.00) {
                lucroAbaixo++;
            } else if (media >= 10.00 && media <= 20.00) {
                lucroEntre++;
            } else {
                lucroAcima++;
            }
        }

        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre);
        System.out.println("Lucro acima de 20%: " + lucroAcima);

        double totalCompra = 0;
        for (int i = 0; i < quantidadeMercadorias; i++) {
            totalCompra += precoCompra[i];
        }

        double totalVenda = 0;
        for (int i = 0; i < quantidadeMercadorias; i++) {
            totalVenda += precoVenda[i];
        }

        System.out.println("Valor total de compra: " + totalCompra);

        System.out.println("Valor total de venda: " + totalVenda);

        double lucroTotal = totalVenda - totalCompra;
        System.out.println("Lucro total: " + lucroTotal);

        sc.close();
    }
}