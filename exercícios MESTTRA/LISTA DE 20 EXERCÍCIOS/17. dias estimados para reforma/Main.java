import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de paes vendidos: ");
            int paesVendidos = teclado.nextInt();
        System.out.print("Digite a quantidade de broas vendidas: ");
            int broasVendidas = teclado.nextInt();
        System.out.print("Digite o valor da reforma: ");
            float valorReforma = teclado.nextFloat();
        
        float valorBroasVendidas = broasVendidas*1.60f;
        float valorPaesVendidos = paesVendidos*0.12f;
        float faturamentoDiário = (valorPaesVendidos+valorBroasVendidas);
        System.out.println();
        System.out.printf("Faturamento com a venda de broas: R$ %.2f\n" , valorBroasVendidas);
        System.out.printf("Faturamento com a venda de paes: R$ %.2f\n" , valorPaesVendidos);
        System.out.printf("Faturamento diário: R$ %.2f\n" , faturamentoDiário);
            float valorDaPoupança = faturamentoDiário*0.10f;
        System.out.printf("Valor do depósito na poupança: R$ %.2f\n" , valorDaPoupança);
            float diasParaPagarAReforma = (valorReforma/valorDaPoupança);
        System.out.printf("Para pagar a reforma serão necessários: %.0f dias" , diasParaPagarAReforma);
    }    
}