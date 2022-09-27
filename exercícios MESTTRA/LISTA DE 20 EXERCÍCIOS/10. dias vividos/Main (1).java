import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
            int anoAtual = teclado.nextInt();
        System.out.print("Digite o ano que você nasceu: ");
            int anoNascimento = teclado.nextInt();
            int idadeAnos = anoAtual-anoNascimento;
            int idadeMeses = idadeAnos*12;
            int idadeDias = idadeMeses*30;
            int idadeSemanas = idadeMeses*4;
        System.out.println("A idade desta pessoa em: ");
        System.out.println("anos é: "+idadeAnos);
        System.out.println("meses é: "+idadeMeses);
        System.out.println("dias é: "+idadeDias);
        System.out.println("semanas é: "+idadeSemanas);
    }    
}