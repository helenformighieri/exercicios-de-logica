/*
Sequência de Fibonacci: Escreva um programa que gera os primeiros n números da sequência de Fibonacci, onde n é fornecido pelo usuário.
*/

package chatGPT.diaDois;

public class Dois {

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int termo = 19;
        int resultado = calcularFibonacci(termo);
        System.out.println("O " + termo + "º termo na sequência de Fibonacci é: " + resultado);
    }
}

