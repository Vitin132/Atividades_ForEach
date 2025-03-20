

package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT2_LetrasMaiusculas {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<String> palavras = new ArrayList<>();
        
        for(int i = 1; i <= 5; i++){
            
            System.out.println("Digite uma palavra:");
            String palavra = tc.nextLine().toUpperCase();
            
            palavras.add(palavra);
            
            
        }
        
        System.out.println("Lista de Palavras:");
        System.out.println(palavras);
        
        
    }
    
    
}
