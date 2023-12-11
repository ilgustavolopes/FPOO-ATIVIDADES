package Aula_1406;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//criando(instanciando) a lista vazia de tipo INTEIRO
		ArrayList<Integer> lista = new ArrayList<Integer>(5);
		//adicionar numeros(elementos/itens) na lista
		lista.add(14);
		lista.add(100);
		lista.add(-50);
		lista.add(98);
		lista.add(1000);//removi este da posiçao quatro
		lista.remove(4);
		lista.add(333);//adicionei este a posiçao quatro
		System.out.println("estes sao seus numeros");
		//ler os numeros da lista
		for(Integer vassoura : lista) {
			System.out.println(vassoura);
		}//fim for
		//escolhendo um numero especifico da lista
		int ver_conteudo = lista.get(4);
		System.out.println("conteudo escolhido e:" + ver_conteudo);
		//pegando o tamanho da lista
		int tamanho = lista.size();
		System.out.println("tamanho da lista:" + tamanho);
	}//fim main

}//fim class
