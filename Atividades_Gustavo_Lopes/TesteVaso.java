package Atividades_Gustavo_Lopes;

import java.util.ArrayList;
import java.util.Scanner;

import Aula_2308.Animal1;

public class TesteVaso {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		// instanciando objetos
		System.out.println("------------VASO SIMPLES SEM PARAMETROS JA DEFINIDOS-------------");
		Vaso v1 = new Vaso();
		System.out.println("sou um vaso sem parametros");
		System.out.println("Digite a cor de seu vaso: ");
		v1.setCor(entrada.next());
		System.out.println("Digite o tamanho de seu vaso: ");
		v1.setTamanho(entrada.nextDouble());
		System.out.println("Digite o material de seu vaso: ");
		v1.setMaterial(entrada.next());
		
		v1.exibir();
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n----------VASO SIMPLES COM PARAMETROS JA DEFINIDOS------");
        Vaso v2 = new Vaso("Vermelho", 13.5, "Argila" );
        
        v2.exibir();
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\n------------VASO DECORADO SEM PARAMETROS DEFINIDOS------------");
        VasoDecorado vd1 = new VasoDecorado();
        System.out.println("Sou um Vaso decorado sem parametros definidos");
        System.out.println("Digite a cor de seu vaso:");
        vd1.setCor(entrada.next());
        System.out.println("Digite o tamanho de seu vaso:");
        vd1.setTamanho(entrada.nextDouble());
        System.out.println("Digite o material de seu vaso: ");
		vd1.setMaterial(entrada.next());
		System.out.println("Digite a decoracao de seu vaso: ");
		vd1.setDecoracao(entrada.next());
		
		
		vd1.exibir();
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("------------VASO DECORADO COM PARAMETROS JA DEFINIDOS------------");
		VasoDecorado vd2 = new VasoDecorado("bolinhas", "roxo", 16.4, "madeira");
		
		vd2.exibir();
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
	}

}
