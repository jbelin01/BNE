/*# Codifique um algoritmo em uma das linguagens, que calcule a área de uma pirâmide, 
cuja área total é calculada por A = Ab + Ah, usando obrigatoriamente as "fórmulas" fornecidas abaixo.
*
Problema: Leia  do teclado a aresta da base de uma pirâmide equilátera. Mostre o valor da área total da pirâmide.  
A área total das 4 faces laterais, cuja a altura mede 10 milímetros. */

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double hL = 10.0;  // hL = Altura Face Lateral

        System.out.println("Digite a aresta da base da pirâmide (em mm):");
        double aB = scanner.nextDouble(); // aB = aresta da Base

        aB = (Math.pow(aB, 2) * Math.sqrt(3)) / 4; // Cálculo do aB ( aresta Base )

        double areaL = (aB * hL) / 2;// Cálculo da areaL (área de uma face lateral - AH ) 

        double areaTotal = aB + 4 * areaL; // Cálculo área Total do triângulo

        System.out.printf("A área total da pirâmide é %.2f mm²%n", areaTotal);

        scanner.close();
    }
}
