/*
Escreva um programa que leia três valores com ponto flutuante de dupla
precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde
 a uma das áreas descritas acima, sempre com mensagem correspondente e um
 espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado
 com 3 dígitos após o ponto decimal.
*/

package beecrowd;

import java.util.Scanner;

public class Exercicio1012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double TRIANGULO = (A * C)/2;
        double CIRCULO = 3.14159 * (C * C);
        double TRAPEZIO = (( A + B ) * C)/2.0;
        double QUADRADO = B * B;
        double RETANGULO = A * B;


        System.out.println(String.format("TRIANGULO: %.3f", TRIANGULO));
        System.out.println(String.format("CIRCULO: %.3f", CIRCULO));
        System.out.println(String.format("TRAPEZIO: %.3f", TRAPEZIO));
        System.out.println(String.format("QUADRADO: %.3f", QUADRADO));
        System.out.println(String.format("RETANGULO: %.3f", RETANGULO));

    }
}
