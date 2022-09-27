import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe a quantidade de cavalos: ");
        int cavalos = teclado.nextInt();
    System.out.print("Informe o valor de cada ferradura: R$ ");
        float valorFerraduras= teclado.nextFloat();
    System.out.println();
        int qtdFerraduras = cavalos*4;
        float valorTotal = (float)qtdFerraduras*valorFerraduras;
    System.out.println("A quantidade de ferraduras necessárias: " + qtdFerraduras);
    System.out.printf("Valor total para a compra das ferraduras: R$ %.2f " , valorTotal);
        
    }
}