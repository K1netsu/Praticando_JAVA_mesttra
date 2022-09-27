import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        float tamanhoLateral;
        float tamanhoFrente;
        float valorMetroQuadrado;
        float difLateralFrente;
        float acrescimo=0;
        float desconto=0;
        float areaTotal;
        float valorTerreno;
        
        System.out.print("Quantos metros o terreno possui de frente: ");
        tamanhoFrente = teclado.nextFloat();
        System.out.print("Quantos metros o terreno possui de lateral: ");
        tamanhoLateral = teclado.nextFloat();
        System.out.print("Informe o valor do metro quadrado: R$ ");
        valorMetroQuadrado = teclado.nextFloat();
        
        difLateralFrente = Math.abs(tamanhoFrente-tamanhoLateral);
        areaTotal = tamanhoFrente*tamanhoLateral;
        valorTerreno = areaTotal*valorMetroQuadrado;
        
        if (difLateralFrente<(0.10f*tamanhoFrente)){
            acrescimo = 1.22f;
            valorTerreno = valorTerreno*acrescimo;
            System.out.println("\n");
            System.out.printf("A area total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f mts.%n" ,tamanhoFrente ,tamanhoLateral, areaTotal);
            System.out.printf("O terreno recebeu um acréscimo de 22%% e custará: R$ %.2f %n", valorTerreno);
            
        }
        else if (tamanhoFrente<(0.40f*tamanhoLateral)){
            desconto = 0.12f;
            desconto = valorTerreno*desconto;
            valorTerreno = valorTerreno-desconto;
            
            System.out.println("\n");
            System.out.printf("A area total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f mts.%n" ,tamanhoFrente ,tamanhoLateral, areaTotal);
            System.out.printf("O terreno recebeu um desconto de 12%% e custará: R$ %.2f %n", valorTerreno);
            
        }else if (tamanhoFrente>(tamanhoLateral*0.70f)){
            desconto = 0.15f;
            desconto = valorTerreno*desconto;
            valorTerreno = valorTerreno-desconto;
            
            System.out.println("\n");
            System.out.printf("A area total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f mts.%n" ,tamanhoFrente ,tamanhoLateral, areaTotal);
            System.out.printf("O terreno recebeu um desconto de 15%% e custará: R$ %.2f %n", valorTerreno);
            
        }else{
            
            System.out.println("\n");
            System.out.printf("A area total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f mts.%n" ,tamanhoFrente ,tamanhoLateral, areaTotal);
            System.out.printf("O terreno não recebeu nenhuma alteração e custará: R$ %.2f %n", valorTerreno);
            
        }
	}
}

