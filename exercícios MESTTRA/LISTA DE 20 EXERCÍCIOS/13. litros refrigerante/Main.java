import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		    System.out.print("Digite a quantidade de latas de 350ml: ");
		        int latas350 = teclado.nextInt();
		    System.out.print("Digite a quantidade de garrafas de 600ml: ");
		        int garrafas600 = teclado.nextInt();
		    System.out.print("Digite a quantidade de garrafas de 2lts: ");
		        int garrafa2lt = teclado.nextInt();
		 System.out.println();
		        int totalMl = (latas350*350 + garrafas600*600 + garrafa2lt*2000);
		        int totalLt = totalMl/1000;
		 System.out.print("A quantidade total de litros é: " + totalLt);
		  
		    
	}
}
