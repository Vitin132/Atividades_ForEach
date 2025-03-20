package Atividades_ForEach;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT6_MaiorQue10 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        int contador = 0;

        System.out.println("Quantos números você vai digitar?");
        int quant = tc2.nextInt();

        int[] numeros = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o número:");
            numeros[i] = tc.nextInt();

            if (numeros[i] > 10) {

                contador++;

            }

        }
        System.out.println("A quantidade de números que são maiores que 10 é: "+contador);

    }

}
