import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o valor do salário mínimo: R$ ");
    float salarioMin = teclado.nextFloat();
    System.out.print("Informe o valor do salário do funcionário : R$ ");
    float salarioFunc = teclado.nextFloat();
    System.out.println("\n");
    float mediaSalarioMinFunc= (salarioFunc/salarioMin);
    System.out.printf("O funcionário recebe %.1f",mediaSalarioMinFunc);
    System.out.print(" salários mínimos!");
    }
}