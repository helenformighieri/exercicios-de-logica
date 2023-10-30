/*
Contagem de vogais: Escreva um programa que conta o número de vogais em uma string fornecida pelo usuário.
*/

package chatGPT.diaDois;

public class Tres {
    public static void main(String[] args) {
        String palavra = "helen";
        int numeroDeVogais = 0;

        for (int i = 0; i < palavra.length(); i++){
            char inspecionandoPalavra = palavra.charAt(i);

            if (inspecionandoPalavra == 'a'  || inspecionandoPalavra == 'A' ||
                inspecionandoPalavra == 'e'  || inspecionandoPalavra == 'E' ||
                inspecionandoPalavra == 'i'  || inspecionandoPalavra == 'I' ||
                inspecionandoPalavra == 'o'  || inspecionandoPalavra == 'O' ||
                inspecionandoPalavra == 'u'  || inspecionandoPalavra == 'U'
               ){
                numeroDeVogais++;
            }
        }

        System.out.println("A palavra tem: " + numeroDeVogais + " vogais.");
    }
}
