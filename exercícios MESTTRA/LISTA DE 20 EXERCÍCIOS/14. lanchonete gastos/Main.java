import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		    System.out.print("Digite a quantidade de sanduiches: ");
		        int qtdeSanduba= teclado.nextInt();
		        int qtdeQueijo = (qtdeSanduba*2*50); float qtdeQueijoKG = qtdeQueijo/1000f;
		        int qtdePresunto = (qtdeSanduba*50); float qtdePresuntoKG = qtdePresunto/1000f;
		        int qtdeHamburguer= (qtdeSanduba*120); float qtdeHamburguerKG = qtdeHamburguer/1000f;
		      
 		System.out.println();
		    System.out.println("Para produzir " + qtdeSanduba + " sanduiches serão necessarios:");
		    System.out.printf("%.2f kgs de mussarela;\n" , qtdeQueijoKG);
		    System.out.printf("%.2f kgs de presunto;\n", qtdePresuntoKG);
		    System.out.printf("%.2f kgs de hamburguer.\n", qtdeHamburguerKG);
	}
}
