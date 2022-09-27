import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a hora normal trabalhada: ");
            int horaNormal  = teclado.nextInt();
        horaNormal = horaNormal*10;
        System.out.print("Digite a hora extra trabalhada: ");
            int horaExtra = teclado.nextInt();
        horaExtra = horaExtra*15;
        System.out.print("Digite a quantidade de dependentes: ");
            int dependentes = teclado.nextInt();
        dependentes = dependentes*90;
        
        System.out.println();
        System.out.println("Horas normais: R$ "+ horaNormal);
        System.out.println("Adicional de Horas extras: R$ "+ horaExtra);
        System.out.println("Adicional de dependentes: R$ "+ dependentes);
        
                float imposto = (horaNormal*0.11f);
            float salarioLíquido = horaNormal - (float)imposto;
            float salarioFinal = salarioLíquido+horaExtra+dependentes;
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLíquido);
        System.out.printf("O salário final é de: R$ %.2f" , salarioFinal);
    }
}
