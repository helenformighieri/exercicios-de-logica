/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme
exemplo abaixo, com um espaço em branco antes e depois da igualdade
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        int D = read.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
