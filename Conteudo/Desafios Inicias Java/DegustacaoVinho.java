// Desafio
// Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar.

// Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças para que os cinco competidores possam provar. 
// Eles podem cheiras, saborear e avaliar a bebida para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. 
// No final, as respostas são verificadas para determinar o número de suposições corretas.

// Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes que receberam a resposta correta.


import java.util.Scanner;


public class DegustacaoVinho {

   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);


       String T = scan.nextLine();

       String rCompetidores = scan.nextLine();

       String[] rCompetidoresSplit = rCompetidores.split(" ");


       int count = 0;


       for (int i = 0 ; i < rCompetidoresSplit.length ; i++) {

           if (rCompetidoresSplit[i].equals(T)) {

               count++;

           }

       }


       System.out.println(count);

   }

}



