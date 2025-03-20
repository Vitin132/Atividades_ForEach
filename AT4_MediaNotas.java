package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT4_MediaNotas {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas:");
        int tamanho = tc2.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a nota:");
            numeros[i] = tc.nextInt();

        }

        double soma = 0;

        for (int numero : numeros) {

            soma += numero;
        }

        double media = soma / numeros.length;

        System.out.println("A média entre as notas é: " + media);
    }

}
