import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o dia: ");
            int dia= teclado.nextInt();
        System.out.print("Digite o mês: ");
            int mes= teclado.nextInt();
        int diasPassados= (mes*30)+dia;
        
        System.out.print("A quantidade de dias que se passaram foi: " + diasPassados + " dias.");
    }    
}