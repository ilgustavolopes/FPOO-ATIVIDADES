package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe Carro
		Carro c1 = new Carro();
		//atribuimos um modelo p/ carro 
		c1.modelo = "Fusca 2078";
		System.out.println("carro 1:");
		System.out.println("o modelo e: " + c1.modelo);
		//atribuimos uma potencia p/ o carro
		c1.setPotencia(10000);
		System.out.println("a potencia e: " + c1.getPotencia() + " CV");
		//verificando estado do carro
	    c1.isParado();
	    System.out.println( c1.isParado() + " que seu carro esta parado");
	    //vou modificar o estado do carro
	    c1.setParado(true);
	    //vou frear o carro!
	    //System.out.println("pisando no freio " + c1.getFrear());
	    System.out.println("pisando no freio " + c1.getAcelerar());
	    
	    //instanciando carro 2
	    Carro c2 = new Carro();
	    System.out.println("carro 2:" );
	    System.out.println(c2.modelo);
	    System.out.println(c2.potencia);
	    
	    //instanciando carro 3
	    Carro c3 = new Carro("gol", 2.4f);
	    System.out.println("carro 3:");
	    
	    System.out.println(c3.modelo);
	    System.out.println(c3.potencia);
	    
	    
	}

}
