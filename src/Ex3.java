/*# Construir um algoritmo que leia da entrada duas listas de 90 valores numéricos inteiros.
*
Problema: O algoritmo deve intercalar os vetores entre si, 
mostrando uma terceira lista com o vetor resultante intercalado. 
Imagem sem legenda */

import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] lista1 = new int[90];

        int[] lista2 = new int[90];

        int[] lista1_2 = new int[180];

        int j = 0;

        double media;


        System.out.println("Digite os 90 valores da primeira lista:");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 90 valores da segunda lista:");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 90; i++) {

            lista1_2[j++] = lista1[i];
            lista1_2[j++] = lista2[i]; // passa por um loop colocando os numeros das listas intercaladamente 
        }


        int soma = 0;

        for ( int i = 0; i < lista1_2.length; i++){
            soma += lista1_2[i];
        }

        media = soma / lista1_2.length;

        for (int i = 0; i < lista1_2.length; i++){

            System.out.println(lista1_2[i] + " ");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
}   


}

