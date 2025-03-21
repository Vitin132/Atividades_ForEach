package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class filtrarNumerosParesDeUmArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);
        
        
        System.out.println("A lista de números é: ");
        System.out.println(numeros);

        System.out.println("Os números pares são: ");
        for (int pares : numeros) {

            if (pares % 2 == 0) {

                System.out.println(pares);

            }

        }

    }

}
