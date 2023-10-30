/*
Verificação de número primo: Escreva um programa que verifica se um número dado pelo usuário é primo ou não.
 */

package chatGPT.diaUm;

public class Dois {
    public static void main(String[] args) {
        int numero = 14;

        if(numero % 2 != 0){
            System.out.println(numero + ". seu número é primo!");
        }else{
            System.out.println(numero + ". seu numero não é primo.");
        }
    }
}
