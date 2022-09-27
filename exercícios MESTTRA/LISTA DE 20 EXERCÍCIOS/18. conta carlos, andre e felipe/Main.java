import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor da conta: R$ ");
            float valorConta = teclado.nextFloat();
            int valor = (int)valorConta;
            int valorCarlos = valor/3;
            int valorAndre = valor/3;
            float valorFelipe = valorConta-((valor/3)*2);
        System.out.println("Carlos pagará: R$ "+valorCarlos);
        System.out.println("André pagará : R$ "+valorAndre);
        System.out.printf("Felipe pagará: R$ %.2f", valorFelipe);
    }    
}