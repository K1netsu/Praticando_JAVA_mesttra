import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.println("Area do trapezio:");
            System.out.print("Informe o valor da base maior: ");
                int baseMaior = teclado.nextInt();
            System.out.print("Informe o valor da base menor: ");
                int baseMenor = teclado.nextInt();
            System.out.print("Informe o valor da altura: ");
                int altura = teclado.nextInt();
        System.out.print("A area do trapezio é: " + (((baseMaior+baseMenor)*altura)/2));
        System.out.print("\n\n");
        System.out.println("Area do quadrado:");
            System.out.print("Informe o valor de um dos lados: ");
                int ladoQuadrado= teclado.nextInt();
            System.out.print("A area do quadrado é: " + ladoQuadrado*ladoQuadrado);
            System.out.print("\n\n");
        System.out.println("Area do retangulo:");
            System.out.print("Informe o valor da largura: ");
                int largura=teclado.nextInt();
            System.out.print("Informe o valor da altura: ");
                int alturaRet = teclado.nextInt();
        System.out.print("A area do retangulo: "+ largura*altura);
        System.out.print("\n\n");
        System.out.println("Area do circulo:");
            System.out.print("Informe o valor do raio: ");
                int raio= teclado.nextInt();
        System.out.print("A area do circulo é: " + (3.14f*(raio*raio)));
        System.out.print("\n\n");
        System.out.println("Area do triangulo:");
            System.out.print("Informe o valor da base: ");
                int baseTri= teclado.nextInt();
            System.out.print("Informe o valor da altura: ");
                int alturaTri= teclado.nextInt();
        System.out.print("A area do triangulo é: " +  (baseTri*alturaTri)/2f);
    }
}