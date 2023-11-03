/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando
de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá
ser apresentado com 2 casas após o ponto.
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int pecaUm = read.nextInt();
        int qtdUM = read.nextInt();
        float valorUm = read.nextFloat();
        float somaPecasUm = qtdUM * valorUm;

        int pecaDois = read.nextInt();
        int qtdDois = read.nextInt();
        float valorDois = read.nextFloat();
        float somaPecasDois = qtdDois * valorDois;

        float TOTAL = somaPecasUm + somaPecasDois;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", TOTAL));

    }
}
