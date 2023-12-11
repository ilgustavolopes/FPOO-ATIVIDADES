package Aula_0409;
import java.util.List;
import java.util.ArrayList;
public class TesteBiblioteca {

	public static void main(String[] args) {
		//instancia de obj livro
		Livro l1 = new Livro("As Cronicas de Narnia", "CS Lewis");
		Livro l2 = new Livro("Ate que nada mais importe", "Luciano Subira");
		//instancia da lista vazia
		List<Livro> lista_de_livro = new ArrayList<Livro>();
		//addceonando objs livros no obj lista
		lista_de_livro.add(l1);
		lista_de_livro.add(l2);
		//foreach para ler a lista
		System.out.println("Lista de livros: ");
		for (Livro  vassoura : lista_de_livro) {
			 //tipo     //obj        //minhalista
			System.out.println(vassoura.getTitulo() + " / " + vassoura.getAutor());
		}
		//instanciando a biblioteca
		System.out.println("\nLista de livros da biblioteca: ");
		Biblioteca b1 = new Biblioteca(lista_de_livro);
		List <Livro> li = b1.getTotalLivrosBiblioteca();
		for(Livro espanador : li) {
			System.out.println(espanador.getTitulo() + " / " + espanador.getAutor());
		}
		
	}

}
