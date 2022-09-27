import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o salário: ");
        float salarioInicial = teclado.nextFloat();
        float salarioReajustado = salarioInicial*(float)1.15;
        float inss= salarioReajustado*(float)0.11;
        float fgts= salarioReajustado*(float)0.08;
        float totalDescontos = fgts+inss;
        float salarioFinal= salarioReajustado-totalDescontos; 
        String percent = "%";
    System.out.println();
    System.out.printf("Salario Inicial: %.2f\n" , salarioInicial);
    System.out.printf("Salario Reajustado: %.2f\n" , salarioReajustado);
    System.out.printf("Desconto 11%s INSS: %.2f\n" , percent, inss);
    System.out.printf("Desconto 8%s  FGTS: %.2f\n" , percent, fgts);
    System.out.printf("Total Descontos FGTS+INSS: %.2f\n" , totalDescontos);
    System.out.printf("Salario Final: %.2f" , salarioFinal);
    }
}