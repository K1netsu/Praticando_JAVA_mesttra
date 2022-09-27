import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		    System.out.print("Digite a QTDE de frangos: ");
		        int frangos = teclado.nextInt();
		        float anelIdent = frangos*4.00f;
		        float anelAlim = frangos*2*3.50f;
		        float valorTotal= anelAlim+anelIdent;
		    System.out.println();
		    System.out.printf("O valor total para identificar os frangos é: R$ %.2f" , valorTotal);
	}
}
