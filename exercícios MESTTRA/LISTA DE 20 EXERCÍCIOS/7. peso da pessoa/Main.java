import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o peso em KG: ");
        float peso = teclado.nextFloat();
    System.out.println();
        float engorda15= (peso*(float)1.15);
        float engorda20= (peso*(float)1.20);
    System.out.print("Caso a pessoa engorde 15%,");
    System.out.printf(" ficará com: %.2f KG\n" , engorda15);
    System.out.print("Caso a pessoa engorde 20%,");
    System.out.printf(" ficará com: %.2f KG" , engorda20);
        
    }
}