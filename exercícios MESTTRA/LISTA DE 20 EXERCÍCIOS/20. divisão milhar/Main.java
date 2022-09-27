import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de quatro digitos: ");
            int milhar= teclado.nextInt();
        int milhares= milhar/1000;
        int centenas= (milhar -(milhares*1000))/100;
        int dezenas= (milhar-((milhares*1000)+(centenas*100)))/10;
        int unidades = milhar-((milhares*1000)+(centenas*100)+(dezenas*10));
        System.out.println("Milhares: "+ milhares);
        System.out.println("Centenas: "+ centenas);
        System.out.println("Dezenas: "+ dezenas);
        System.out.print("Unidades: "+ unidades);
    }    
}