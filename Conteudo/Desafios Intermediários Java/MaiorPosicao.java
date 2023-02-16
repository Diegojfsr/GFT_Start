/*
 Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 */


 // Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0, posicao = 0;
        for (int i = 1; i <= 100; i++) {
            int num = entrada.nextInt();
            if (maior > num) {
                maior = maior;
                posicao = posicao;
            } else {
                posicao = i;
                maior = num;
            }
        }
        System.out.print(maior + "\n" + posicao + "\n");
    }
}




