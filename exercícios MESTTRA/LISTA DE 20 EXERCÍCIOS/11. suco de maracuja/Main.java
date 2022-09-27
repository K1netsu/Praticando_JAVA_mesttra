import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		    System.out.print("Digite a QTDE de lts de suco necessária: ");
		        int qtdeSuco = teclado.nextInt();
		    System.out.println();
		    System.out.println("Sera necessario para fazer 34 lts de suco de maracujá: ");
		        float qtdeAgua = qtdeSuco*0.80f;
		        float qtdeSucoConcent= qtdeSuco*0.20f;
            System.out.println(qtdeAgua + " lts de água.");
            System.out.println(qtdeSucoConcent + " lts de suco concentrado de maracujá." );
	}
}
