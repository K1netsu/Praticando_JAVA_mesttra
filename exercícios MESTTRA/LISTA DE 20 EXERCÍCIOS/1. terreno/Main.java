import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Quantos metros o terreno possui de frente: ");
        float terrenoFrente = teclado.nextFloat();
    System.out.print("Quantos metros o terreno possui de lateral: ");
        float terrenoLateral = teclado.nextFloat();
    System.out.print("Informe o valor do metro quadrado: ");
        float precoMetro = teclado.nextFloat();
                System.out.println("\n");
        float areaTerreno = (terrenoFrente*terrenoLateral); 
        float valorTerreno = (areaTerreno*precoMetro);
    System.out.println("Area total do terreno de " + terrenoFrente + "mts de frente com " + terrenoLateral + "mts de lateral é : " + areaTerreno +"mts");
    System.out.printf("O valor deste terreno é: R$ %.2f" , valorTerreno);
    }
}