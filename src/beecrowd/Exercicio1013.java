/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos
seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB =(a+b+abs(a-b))
               2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo
passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
package beecrowd;

import java.util.Scanner;

public class Exercicio1013 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        int maior = (a + b + Math.abs(a-b)) / 2;

        if ( maior > c){
            System.out.println(maior + " eh o maior");
        }else{
            System.out.println(c + " eh o maior");
        }




    }
}
