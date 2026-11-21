package org.CaixaVerso.nivel4;
/**
public class Snail {

    public static int[] snail(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
        }


        int[][];


        // enjoy
    }

    public static int[][] removeLine(int[][] array, int lineToRemove) {
        // error

        int[][] newArray = new int[array.length - 1][];
        int newIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(i == lineToRemove) {
                continue;
            }
            newArray[newIndex++] = array[i];
        }

        return newArray;
    }

    public static int[][] removeColumn(int[][] array, int columnToRemove) {

        int lines = array.length;
        int columns = array[0].length;

        int[][] newArray = new int[lines][columns - 1];

        for(int i = 0; i < lines; i++) {
            // Copia os elementos ANTES da coluna removida
            if(columnToRemove > 0) {
                System.arraycopy(array[i], 0, newArray[i], 0, columnToRemove);
            }

            // Copia os elementos DEPOIS da coluna removida
            if(columnToRemove <  columns - 1) {
                System.arraycopy(array[i], columnToRemove + 1, newArray[i], columnToRemove, columns - columnToRemove - 1);
            }


        }

        return array;
    }
}
 **/


/**
        for (int i = 0; i < linhas; i++) {
        // Copia os elementos ANTES da coluna removida
        if (colParaRemover > 0) {
        System.arraycopy(matriz[i], 0, novaMatriz[i], 0, colParaRemover);
            }
                    // Copia os elementos DEPOIS da coluna removida
                    if (colParaRemover < colunas - 1) {
        System.arraycopy(matriz[i], colParaRemover + 1, novaMatriz[i], colParaRemover, colunas - colParaRemover - 1);
            }
                    }

 **/


// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/java