import java.util.Scanner;

public class Main
{
    
    public static void calculaSomaSubtração(int valor, int x){
        System.out.print(valor + " + " + x + " = " +  (valor+x));
        System.out.print("\t" + valor + " - " + x  + " = " + (valor-x));
        System.out.print("\n");

    }
    public static void calculaMultDiv(int valor, int x){
        System.out.print(valor + " * " + x + " = " + (valor*x));
        System.out.print("\t" + valor + " / " + x + " = " + ((float)valor/x));
        System.out.print("\n");
    }
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("TABUADA");
        System.out.println("_______________________________");
	    
		int valor = teclado.nextInt();
		calculaSomaSubtração(valor,1);
		calculaSomaSubtração(valor,2);
		calculaSomaSubtração(valor,3);
		calculaSomaSubtração(valor,4);
		calculaSomaSubtração(valor,5);
		calculaSomaSubtração(valor,6);
		calculaSomaSubtração(valor,7);
		calculaSomaSubtração(valor,8);
		calculaSomaSubtração(valor,9);
		calculaSomaSubtração(valor,10);
		System.out.println("\n");
		calculaMultDiv(valor,1);
		calculaMultDiv(valor,2);
		calculaMultDiv(valor,3);
		calculaMultDiv(valor,4);
		calculaMultDiv(valor,5);
		calculaMultDiv(valor,6);
		calculaMultDiv(valor,7);
		calculaMultDiv(valor,8);
		calculaMultDiv(valor,9);
		calculaMultDiv(valor,10);
		teclado.close();
		
	}
}
