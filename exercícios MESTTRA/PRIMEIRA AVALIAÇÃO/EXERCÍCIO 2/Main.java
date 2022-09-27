import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
  public static void main (String[]args){
      
//INICIO DE TUDO
    
    Scanner teclado = new Scanner (System.in);
    int voto1, voto2, voto3, voto4, voto5;

      System.out.println ("=========== Menu de VotaC'C#o ===========");
      System.out.println ("1 - Candidato A");
      System.out.println ("2 - Candidato B");
      System.out.println ("3 - Candidato C");
      System.out.println ("4 - Voto Nulo\n");

    try{
      System.out.print ("Digite o código do candidato para o primeiro voto: ");
      voto1 = teclado.nextInt();
      System.out.print ("Digite o código do candidato para o segundo voto: ");
      voto2 = teclado.nextInt();
      System.out.print ("Digite o código do candidato para o terceiro voto: ");
      voto3 = teclado.nextInt();
      System.out.print ("Digite o código do candidato para o querto voto: ");
      voto4 = teclado.nextInt();
      System.out.print ("Digite o código do candidato para o quinto voto: ");
      voto5 = teclado.nextInt();
      System.out.println();  
      teclado.close ();
        
//CONTAGEM DE VOTOS DE CADA CANDIDATO   

    String votoA,votoB,votoC,votoD,votoE;
    
    votoA = String.valueOf(voto1);
    votoB = String.valueOf(voto2);
    votoC = String.valueOf(voto3);
    votoD = String.valueOf(voto4);
    votoE = String.valueOf(voto5);


    String votosTotais = votoA+votoB+votoC+votoD+votoE;

    int totalVotosA = 0;
    int totalVotosB = 0;
    int totalVotosC = 0;
    int totalVotosNulo = 0;
    char contadorVotos;

    for (int i = 0; i < votosTotais.length (); i++){
	contadorVotos = votosTotais.charAt (i);
	        if (contadorVotos == '1'){
		    totalVotosA++;
            }
	        else if (contadorVotos == '2'){
		    totalVotosB++;
	        }
	        else if (contadorVotos == '3'){
		    totalVotosC++;
	        }
	        else if (contadorVotos == '4'){
		    totalVotosNulo++;
	        }
	   	         
//CALCULO DE PERCENTUAL

    }
            float percentualVotosCandA = (totalVotosA * 20);
            float percentualVotosCandB = (totalVotosB * 20);
            float percentualVotosCandC = (totalVotosC * 20);
            float percentualVotosValidos = percentualVotosCandA + percentualVotosCandB + percentualVotosCandC;
            System.out.println("Percentual de Votos Válidos: " + percentualVotosValidos + "%");
            System.out.println("Percentual de Votos Candidato 1: " + percentualVotosCandA + "%");
            System.out.println("Percentual de Votos Candidato 2: " + percentualVotosCandB + "%");
            System.out.println("Percentual de Votos Candidato 3: " + percentualVotosCandC + "%");
            System.out.println();
            
//CONDIÇÃO CANDIDATO VENCEDOR
        
        if (totalVotosA>totalVotosB && totalVotosA>totalVotosC){
            System.out.print("Canditado vencedor: Candidato 1");
        } else if(totalVotosB>totalVotosA && totalVotosB>totalVotosC){
            System.out.print("Canditado vencedor: Candidato 2");
        } else if(totalVotosC>totalVotosA && totalVotosC>totalVotosB){
            System.out.print("Canditado vencedor: Candidato 3");
        }
        
    }catch(InputMismatchException ex){
        System.out.print("O código inserido deve ser um número de 1 a 4.");
    }
  }
}
