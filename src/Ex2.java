/*# Construa um algoritmo que faça uma Pesquisa Linear em um vetor de elementos numéricos, usando função: Por exemplo Pesquisar(vet, n).
*
Problema: Dado o vetor[6] = { 9, 17, 2, 26, 14,  ? }. <<< Complete o último valor numérico do vetor com um número inteiro, 
a sua escolha e que não deve se repetir na lista, dentro do seu código.
Obs.: Se o usuário digitar um valor existente neste vetor, por exemplo 14, 
o algoritmo deve chamar a função Pesquisar para procurar e Mostrar para escrever na tela: se foi encontrado o valor no conjunto deverá mostrar o valor e qual a posição relativa no vetor;
 ou se não, escrever que não foi encontrado e pedir para o usuário digitar novamente ou sair. */

import java.util.Scanner;

public class Ex2 {

    public static int Pesquisar(int[] vet, int valor) {
        for (int i = 0; i < vet.length; i++) { // lenght para achar pelo tamanho do vetor 
            if (vet[i] == valor) return i;  // retorna a posição do vetor 
        }
        return -1; // caso não encontre 
    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] vet = {9, 17, 2, 26, 14, 0}; 

        System.out.println("Digite um valor para completar o vetor que não repita aos valores anteriores: ");
        int valor = scanner.nextInt();

        while(Pesquisar(vet, valor) != -1){
            System.out.println("Este valor já possue dentro do vetor. Digite outro valor:");
            valor = scanner.nextInt();
        }

        vet[5] = valor;

        while (true) {
            System.out.println("Digite um valor para pesquisar no vetor ou -1 para sair:");
            valor = scanner.nextInt();
            if (valor == -1) {
            break; // se digitado -1, sai do loop
            }
           
            if ( Pesquisar(vet, valor) != -1) { 
                System.out.println("Valor " + valor + " encontrado na posição " +  Pesquisar(vet, valor)); // pesquisa o valor e se existente mostra na tela
            } 
            else {
                System.out.println("Valor não encontrado."); // se não existente
            }
        }
}
}