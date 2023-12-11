package Atividades_Gustavo_Lopes;

public class ProdutoPadaria implements Produto {
	private String nome;
	private double preco;
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public double getPreco() {
		return preco;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//metodo da propria classe
	//criar metodo exibir info
	public void exibirinfo() {
		System.out.println(getNome());
		System.out.println(getPreco());
	}

}
