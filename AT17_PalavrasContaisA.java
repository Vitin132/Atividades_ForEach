package Atividades_ForEach;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT17_PalavrasContaisA {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<>();

        Collections.addAll(palavras, "Vermelho", "Carro", "Luz", "Jaguar");
        
        
        for(String contem : palavras){
            
            System.out.println(contem);
            
            
            
        }
        
        
        
        
        

        

    }

}
