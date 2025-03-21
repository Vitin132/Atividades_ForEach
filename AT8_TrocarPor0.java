package Atividades_ForEach;

/**
 *
 * @author Aluno
 */
public class AT8_TrocarPor0 {

    public static void main(String[] args) {

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int impares : lista) {
            if (impares % 2 != 0) {
                
                
                
                impares = 0;
                System.out.println(impares);
                
                
            }

        }
        
        

    }

}
