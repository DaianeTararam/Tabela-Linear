//@author: Daiane Tararam
package view;
import controller.TabelaLinear;

public class TabelaLinearPrincipal {
    public static void main(String[] args) {
        TabelaLinear tab = new TabelaLinear();
        int[] array = {90, 70, 50, 80, 60, 85};
        //imprimindo a array 

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");    
        }
        System.out.println();

        //Adicionando um número ao final da array
        array = tab.adicionarFinal(array, 75);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");    
        }
        System.out.println();

        //Adicionando um número em uma determinada posição 
        array = tab.inserirArray(array,8, 2);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");    
        }
        System.out.println();

        //Removendo um número de uma determinada posição da Array
        array = tab.remover(array, 5);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");    
        }
    }
}
