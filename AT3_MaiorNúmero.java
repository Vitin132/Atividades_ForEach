package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT3_MaiorNúmero {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int num = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um número:");
            num = tc.nextInt();
            numeros.add(num);
            
        }
        
        int maiorNumero = Collections.max(numeros);
        
        System.out.println("O maior número é: "+maiorNumero);

    }

}
