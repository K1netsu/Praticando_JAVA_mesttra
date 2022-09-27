import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe a nota 1: ");
        float nota1= teclado.nextFloat();
    System.out.print("Informe a nota 2: ");
        float nota2= teclado.nextFloat();
    System.out.print("Informe a nota 3: ");
        float nota3= teclado.nextFloat();
    System.out.println("\n");
        float mediaPonderada = ((nota1*1+nota2*2+nota3*3)/6);
    System.out.printf("A média ponderada das notas %.1f, %.1f, %.1f é: %.2f", nota1, nota2 , nota3 , mediaPonderada);
    }
}