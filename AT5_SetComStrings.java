

package Atividades_ForEach;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class AT5_SetComStrings {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Set<String> frutas = new HashSet<>();
        String nomes = null;
        
        for(int i = 0; i < 5; i++){
        System.out.println("Digite nomes de frutas para adicionar à lista:");
        nomes = tc.nextLine();
        
        frutas.add(nomes);
        
        System.out.println(frutas);
        }
        
        for(String fruta : frutas){
            
            System.out.println(fruta);
            
        }
        
        
        
    }

}
