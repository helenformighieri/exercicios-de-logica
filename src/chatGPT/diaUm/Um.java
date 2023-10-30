/*
Soma de números pares: Escreva um programa que calcula a soma de todos os números pares de 1 a 100.
 */

package chatGPT.diaUm;

public class Um {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
