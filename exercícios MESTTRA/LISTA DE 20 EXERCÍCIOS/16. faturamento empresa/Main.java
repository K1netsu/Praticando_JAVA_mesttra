import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o valor do faturamento anterior: ");
            float faturamentoAnterior = teclado.nextFloat();
            float metaFaturamento = faturamentoAnterior*1.20f;
System.out.println();
        System.out.println("A meta do próximo mês é: " + metaFaturamento);
            float aumento = faturamentoAnterior*0.20f;
        System.out.printf("Um aumento de: R$ %.2f \n" , aumento);
        System.out.println("Quantidades de peças que precisam ser vendidas para atingirmos a meta: ");
        System.out.println();
            float produto1= aumento/150;
            float produto2= aumento/220;
            float produto3= aumento/97;
        System.out.printf("Produto 1: %.2f peças.\n", produto1);
        System.out.printf("Produto 2: %.2f peças.\n", produto2);
        System.out.printf("Produto 3: %.2f peças.\n", produto3);
            
    }    
}
