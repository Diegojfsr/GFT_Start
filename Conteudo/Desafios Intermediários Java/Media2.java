/*  
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. 
*/


// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Media2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double nota1 = input.nextDouble();
    double nota2 = input.nextDouble();
    double nota3 = input.nextDouble();
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    double media = ((nota1 *  2  ) + (nota2 * 3   ) + (nota3 *  5  )) / (2+3+5);
    System.out.printf("MEDIA = %.1f", media);
  }
}





