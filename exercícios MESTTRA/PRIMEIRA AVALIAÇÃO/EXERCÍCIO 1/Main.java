import java.util.Scanner;

public class Main{
  public static void main (String[]args){
    Scanner teclado = new Scanner (System.in);
    int valorInserido = 0;
    int qtdNotas = 0;
    System.out.print ("Digite a quantidade de dinheiro a ser sacada: ");
    valorInserido = teclado.nextInt ();
        if (valorInserido > 1){
    	System.out.println ("\n");
    	System.out.println ("Quantidades");
    	qtdNotas = valorInserido / 100;
    	System.out.println ("100 reais: " + qtdNotas);
    	valorInserido = valorInserido % 100;
    	qtdNotas = valorInserido / 50;
    	System.out.println ("50 reais: " + qtdNotas);
    	valorInserido = valorInserido % 50;
    	qtdNotas = valorInserido / 20;
    	System.out.println ("20 reais: " + qtdNotas);
    	valorInserido = valorInserido % 20;
    	qtdNotas = valorInserido / 10;
    	System.out.println ("10 reais: " + qtdNotas);
    	valorInserido = valorInserido % 10;
    	qtdNotas = valorInserido / 5;
    	System.out.println ("5 reais: " + qtdNotas);
    	valorInserido = valorInserido % 5;
    	qtdNotas = valorInserido / 2;
    	System.out.println ("2 reais: " + qtdNotas);
    	valorInserido = valorInserido % 2;
    }else if (valorInserido == 1){
	    System.out.print ("Valor precisa ser maior que 1");
    }else if (valorInserido == 0){
        System.out.print ("Valor precisa ser maior que 0");
    }
    teclado.close ();
  }
}


