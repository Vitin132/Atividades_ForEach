package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_SomaDosElementos {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número:");
            numeros.add(tc.nextInt());
            System.out.println(numeros);
           

        }
        
        int soma = 0;
        
        for(Integer num : numeros){
            
            soma += num.intValue();
            
        }
        
        System.out.println("A soma dos valores é: "+soma);

    }

}
