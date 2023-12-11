package Aula_3008;

public class UsoInterface implements InterfacePai {
	//atributos
	public int result;
	public int v1;
	public int v2;
	//construtor defalut
	UsoInterface(){
		
	}
	//implementando metodos da interface
	@Override
	public void multiplicacao(int v1, int v2) {
		result = v1*v2;
		System.out.println("multiplicacao :" + result);
	}

	@Override
	public void soma(int v1, int v2) {
		result = v1+v2;
		System.out.println("soma :" + result);
	}
	//metodo da propria classe
	public void divisao(int v1, int v2) {
		result = v1/v2;
	}
	
}
