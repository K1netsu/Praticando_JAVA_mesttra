import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float salarioInicial;
		float aumentoSalario = 0;
		float salarioPosAumento;
		float salarioFinal;
		float descontoFGTS;
		float descontoINSS;
		float totalDescontos;
		
		System.out.print("Digite o salário do funcionário: ");
		salarioInicial = teclado.nextFloat();
		
		if(salarioInicial<=2000){
		    aumentoSalario = salarioInicial*0.15f;
		    salarioPosAumento = salarioInicial+aumentoSalario;
		    descontoINSS = salarioPosAumento*0.11f;
		    descontoFGTS = salarioPosAumento*0.08f;
		    totalDescontos = descontoFGTS+descontoINSS;
		    salarioFinal = salarioPosAumento-totalDescontos;
		    
		    System.out.printf("O aumento será de: %.2f%n" , aumentoSalario);
		    System.out.printf("O salário pós reajuste será de: %.2f%n" , salarioPosAumento);
		    System.out.printf("O desconto de INSS será de: %.2f%n" , descontoINSS);
		    System.out.printf("O desconto de FGTS será de: %.2f%n" , descontoFGTS);
		    System.out.printf("O total de descontos será de: %.2f%n" , totalDescontos);
		    System.out.printf("O salário final será de: %.2f%n" , salarioFinal);
		} else if (salarioInicial>= 3000){
		    aumentoSalario = salarioInicial*0.10f;
		    salarioPosAumento = salarioInicial+aumentoSalario;
		    descontoINSS = salarioPosAumento*0.11f;
		    descontoFGTS = salarioPosAumento*0.08f;
		    totalDescontos = descontoFGTS+descontoINSS;
		    salarioFinal = salarioPosAumento-totalDescontos;
		    
		    System.out.printf("O aumento será de: %.2f%n" , aumentoSalario);
		    System.out.printf("O salário pós reajuste será de: %.2f%n" , salarioPosAumento);
		    System.out.printf("O desconto de INSS será de: %.2f%n" , descontoINSS);
		    System.out.printf("O desconto de FGTS será de: %.2f%n" , descontoFGTS);
		    System.out.printf("O total de descontos será de: %.2f%n" , totalDescontos);
		    System.out.printf("O salário final será de: %.2f%n" , salarioFinal);
		}
		teclado.close();
	}
}
