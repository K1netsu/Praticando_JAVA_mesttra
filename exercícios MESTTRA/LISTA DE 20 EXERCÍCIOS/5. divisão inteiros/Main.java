import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o valor 1: ");
    int valor1 = teclado.nextInt();
    System.out.print("Informe o valor 2: ");
    int valor2 = teclado.nextInt();
    System.out.println();
    float valorDiv = (valor1/(float)valor2);
    System.out.printf("A divisão de %d por %d é %.2f",valor1,valor2, valorDiv );
    }
}