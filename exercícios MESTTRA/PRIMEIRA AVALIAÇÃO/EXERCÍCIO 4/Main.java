import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valorTotal = 0;
		float valorFinal = 0;
		float totalDesconto=0;
		float totalJuros=0;
		float totalComprasAVista=0;
		float totalComprasParceladas=0;
		char formaPagamento;
	try{
		for(int i=1 ; i<=5; i++){
		    System.out.println("Compra 0"+i);
		    System.out.print("Digite o valor total: R$ ");
		    valorTotal = sc.nextFloat();
		    sc = new Scanner(System.in);
		    
		    float desconto8 = valorTotal*0.08f;
		    float desconto4 = valorTotal*0.04f;
		    float juros8 = valorTotal*0.08f;
		    
		    System.out.print("Digite a forma de pagamento: ");
		    formaPagamento = sc.next().charAt(0);
		    
		    if(formaPagamento=='1'){
                System.out.println("Desconto 8%");
                valorFinal=valorTotal-desconto8;
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                System.out.println();
                totalComprasAVista += valorFinal;
                totalDesconto += desconto8;
            }
            else if(formaPagamento == '2'){
                System.out.println("Desconto de 4%");
                valorFinal=valorTotal-desconto4;
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                System.out.println();
                totalComprasAVista += valorFinal;
                totalDesconto += desconto4;
            }
            else if(formaPagamento=='3'){
                valorFinal = valorTotal;
                System.out.printf("Em 2x de R$ %.2f%n" ,(valorFinal/2));
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                System.out.println();
                totalComprasParceladas += valorFinal;
            }
            else if(formaPagamento=='4'){
                valorFinal = valorTotal+juros8;
                System.out.printf("Em 4x de R$ %.2f%n" , (valorFinal/4));
                System.out.printf("Valor final: R$ %.2f%n" , valorFinal);
                System.out.println();
                totalComprasParceladas += valorFinal;
                totalJuros += juros8;
            }
            else if(formaPagamento != '1' || formaPagamento != '2' || formaPagamento != '3' || formaPagamento != '4'){
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println();    
            }
		   }
		    System.out.print("Total de compras \"À vista\": R$ ");
		    System.out.printf("%.2f%n", totalComprasAVista);
		    System.out.print("Total de compras \"parceladas\": R$ ");
		    System.out.printf("%.2f%n", totalComprasParceladas);
		    System.out.println();
		    System.out.printf("Total de descontos: R$ %.2f%n", totalDesconto);
		    System.out.printf("Total de Juros: R$ %.2f%n", totalJuros);
	    } catch(InputMismatchException ex){
	        System.out.println("Opção inválida, a compra não será processada");
	    }
	    sc.close();
	}		
}