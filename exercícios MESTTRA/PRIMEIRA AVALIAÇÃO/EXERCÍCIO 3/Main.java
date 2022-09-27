import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeIndividuo;
		int idadeIndividuo = 0;
		char sexoIndividuo;
		
        int qtdCrianca=0;
        int qtdAdolescente=0;
        int qtdAdulto=0;
        int qtdMelhorIdade=0;
        int maiorIdade=0;
        String individuoMaisVelho = null;
        try{
            for (int i = 1; i<=3; i++){
                System.out.print("Digite o nome do indivíduo 0" + i +" : ");
		        nomeIndividuo = sc.nextLine();

		        System.out.print("Digite a idade do(a) " + nomeIndividuo + " : ");
		        idadeIndividuo = sc.nextInt();
		        sc = new Scanner(System.in);

		        System.out.print("Digite o sexo do(a) " + nomeIndividuo + " : ");
		        sexoIndividuo = sc.next().charAt(0);
		        sc = new Scanner(System.in);
		            if(i==1){
                        if(idadeIndividuo <= 13){
                            System.out.print(nomeIndividuo + " é criança.\n\n");
                            qtdCrianca++;
                        }else if(idadeIndividuo>13 && idadeIndividuo <= 20){
                            System.out.print(nomeIndividuo + " é adolescente.\n\n");
                            qtdAdolescente++;
                        }else if(idadeIndividuo>20 && idadeIndividuo <= 50){
                            System.out.print(nomeIndividuo + " é adulto.\n\n");
                            qtdAdulto++;
                        }else if(idadeIndividuo>50){
                            System.out.print(nomeIndividuo + " é da melhor idade.\n\n");
                            qtdMelhorIdade++;
                        }
                        if(idadeIndividuo>maiorIdade){
                            maiorIdade=idadeIndividuo;
                            individuoMaisVelho = nomeIndividuo;
                        }
		            }if(i==2){
                        if(idadeIndividuo <= 13){
                            System.out.print(nomeIndividuo + " é criança.\n\n");
                            qtdCrianca++;
                        }else if(idadeIndividuo>13 && idadeIndividuo <= 20){
                            System.out.print(nomeIndividuo + " é adolescente.\n\n");
                            qtdAdolescente++;
                        }else if(idadeIndividuo>20 && idadeIndividuo <= 50){
                            System.out.print(nomeIndividuo + " é adulto.\n\n");
                            qtdAdulto++;
                        }else if(idadeIndividuo>50){
                            System.out.print(nomeIndividuo + " é da melhor idade.\n\n");
                            qtdMelhorIdade++;
                        }
                        if(idadeIndividuo>maiorIdade){
                            maiorIdade=idadeIndividuo;
                            individuoMaisVelho = nomeIndividuo;
                        }
		            }if(i==3){
                        if(idadeIndividuo <= 13){
                            System.out.print(nomeIndividuo + " é criança.\n\n");
                            qtdCrianca++;
                        }else if(idadeIndividuo>13 && idadeIndividuo <= 20){
                            System.out.print(nomeIndividuo + " é adolescente.\n\n");
                            qtdAdolescente++;
                        }else if(idadeIndividuo>20 && idadeIndividuo <= 50){
                            System.out.print(nomeIndividuo + " é adulto.\n\n");
                            qtdAdulto++;
                        }else if(idadeIndividuo>50){
                            System.out.print(nomeIndividuo + " é da melhor idade.\n\n");
                            qtdMelhorIdade++;
                        }
                        if(idadeIndividuo>maiorIdade){
                            maiorIdade=idadeIndividuo;
                            individuoMaisVelho=nomeIndividuo;
                        }
		            }
		        sc.close();
            }
                System.out.println("Total de crianças: " + qtdCrianca);
		        System.out.println("Total de adolescentes: " + qtdAdolescente);
		        System.out.println("Total de adultos: " + qtdAdulto);
		        System.out.println("Todal de melhor idade: " + qtdMelhorIdade);
		        System.out.println();
		        System.out.print("O nome do indivíduo mais velho é: " + individuoMaisVelho);
		        
        }catch(InputMismatchException ex){
            System.out.print("Valor incorreto.\nA idade deve ser um número inteiro.");
        }
	}
}
