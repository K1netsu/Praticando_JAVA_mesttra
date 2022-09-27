import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class Main{
    public static int calculoTrapezio(int baseMaior, int baseMenor, int altura){
        int areaTrapezio = ((baseMaior+baseMenor)*altura)/2;
        return areaTrapezio;
    }
    
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
		 
		int resposta = 0; 
		 
		System.out.println("BEM VINDO AO SISTEMA DE CÁLCULO DE ÁREAS\n");
		System.out.println("1-Trapézio");
		System.out.println("2-Quadrado");
		System.out.println("3-Retângulo");
		System.out.println("4-Círculo");
		System.out.println("5-Triângulo\n");
		    try{
		   System.out.print("Selecione a opção desejada: ");
		   resposta = teclado.nextInt();
		
		    if(resposta == 1 ){
		        System.out.println();
		        System.out.print("Digite o valor da base maior, da base menor e da altura.\n");
		        
		        System.out.print("Base maior: ");
		        int baseMaior = teclado.nextInt();
		        System.out.print("Base menor: ");
		        int baseMenor = teclado.nextInt();
		        System.out.print("Altura: ");
		        int altura = teclado.nextInt();
		        
		        System.out.print("A área do trapézio é de: " + calculoTrapezio(baseMaior,baseMenor,altura) + "cm².");
		    }
		    else if(resposta == 2 ) {
		        System.out.println();
		        System.out.print("Digite valor do lado do quadrado.\n");
		        
		        System.out.print("Lado: ");
		        int ladoQuadrado = teclado.nextInt();
		        System.out.print("A área do quadrado é de :" + Math.pow(ladoQuadrado,2) + "cm².");
		    }
		    else if(resposta == 3) {
		        System.out.println();
		        System.out.print("Digite o valor da base e da altura.\n");
		        
		        System.out.print("Base: ");
		        int base = teclado.nextInt();
		        System.out.print("Altura: ");
		        int altura = teclado.nextInt();
		        
		        System.out.print("A área do retângulo é de: " + base*altura + "cm².");
		    }
		    else if(resposta == 4) {
		        System.out.println();
		        System.out.print("Digite o valor do raio.\n");
		        
		        double pi = 3.14159f;
		        
		        System.out.print("Raio: ");
		        int raio = teclado.nextInt();
		        double areaCirculo = pi*Math.pow(raio,2);
		        System.out.printf("A área do círculo é de : %.2f cm²." , areaCirculo);
		        
		        
		    }
		    else if(resposta == 5) {
		        System.out.println();
		        System.out.print("Digite o valor da base e da altura.\n");
		        
		        System.out.print("Base: ");
		        int base = teclado.nextInt();
		        System.out.print("Altura: ");
		        int altura = teclado.nextInt();
		        
		        System.out.print("A área do triângulo é de: " + (base*altura)/2 + "cm².");
		    }
		    else{
		        System.out.print("Opção inválida.");
		    }
		    } catch(InputMismatchException ex){
		    System.out.print("Digite um valor entre 1 e 5.");
		    }	
}
}