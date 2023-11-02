/*
Escreva um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um
espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um
espaço em branco após o $.
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1008 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int NUMBER = read.nextInt();
        int HORAS = read.nextInt();
        float VALORHORA= read.nextFloat();

        float SALARY = HORAS * VALORHORA;

        System.out.println(String.format("NUMBER = " + NUMBER + "\nSALARY = U$ %.2f", SALARY));
    }
}
