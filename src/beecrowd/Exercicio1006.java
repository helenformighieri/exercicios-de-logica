/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem
peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre
com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito
após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim
como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso
contrário, você receberá "Presentation Error".
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double notaUm = read.nextDouble();
        System.out.println("Agora a segunda: ");
        double notaDois = read.nextDouble();
        System.out.println("Agora a terceira: ");
        double notaTres = read.nextDouble();

        double media = ((2 * notaUm)+(3 * notaDois)+(5 * notaTres))/10;

        System.out.println("Sua média é: " + media);

    }
}