//@author: Daiane Tararam
package controller;

public class TabelaLinear {
    public TabelaLinear(){
        super();
    }

    //Adicionando um número ao final da array
    public static int[] adicionarFinal(int[] array, int valor){
        //É preciso criar uma array temporaria com o tempo maior 
        int[] arrayTemporaria = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            arrayTemporaria[i] = array[i];
        }
        arrayTemporaria[array.length] = valor;
        return arrayTemporaria;
    }

    //Adicionando um número em uma determinada posição
    public static int[] inserirArray(int[] array, int valor, int posicao){
        int[] arrayTemporaria = new int[array.length+1];
        for(int i = 0; i < array.length; i++){
            if(i < posicao){
                arrayTemporaria[i] = array[i];
            }else{
                arrayTemporaria[i + 1] = array[i];
            }
        }
        arrayTemporaria[posicao] = valor;
        return arrayTemporaria;
    }
    
    //Removendo um número de uma determinada posição da Array
    public static int[] remover(int[] array, int posicao){
        int[] arrayTemporaria = new int[array.length - 1];
        for(int i = 0; i < array.length; i++){
            if(i < posicao){
                arrayTemporaria[i] = array[i];
            }
            if(i > posicao){
                arrayTemporaria[i-1]= array[i];
            }
        }
        return arrayTemporaria;
    }
}
