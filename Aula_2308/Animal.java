package Aula_2308;

public class Animal {//classe pai ou super classe
	//atributos
	public String nome = "Ligeirinho";
	//metodo construtor
    public Animal() {
    	//super();
    	System.out.println("OBJ animal acabou de nascer");
    }
    //metodos
    public void som() {
    	System.out.println("\n som da classe Animal");
    }
    public void brincar() {
    	System.out.println("\nbrincando. . .");
    }
    public void som1() {
    	System.out.println("\n som1 da classe animal");
    }
}//fim classe
