/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem
a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a
nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5
dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade.
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1005 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double notaUm = leia.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double notaDois = leia.nextDouble();

        double MEDIA = ((3.5 * notaUm) + (7.5 * notaDois))/11;

        System.out.println(String.format("MEDIA = %.5f", MEDIA));





    }
}
