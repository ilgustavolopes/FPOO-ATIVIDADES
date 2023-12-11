package Aula_1408;

public class Carro {
	
    //atributos
	public String modelo;
	float potencia;
	public boolean parado;
	
	//construtor padrao (default)
	public Carro(){
		System.out.println("acabei de nascer!");
	}
	//construtor com parametros
	public Carro(String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;
		System.out.println("model: " + modelo + " potenc: " + potencia);
	}
	//metodos getters e setters
	
	//modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	//potencia
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float p) {
		this.potencia = p;
	}
	
	// metodos especiais(lógica)
	
	//acelerar
	public boolean getAcelerar() {
	     if(parado == true) {
	    	 System.out.println("sem movimento");
	     }else {
	    	 System.out.println("acelerando");
	     }
	     return parado; 
	}
	
	//frear
	public boolean getFrear() {
		if(parado == true) {
			System.out.println("voce freou");
		}else {
			System.out.println("na banguela....");
		}
		return parado;
	}
	
	//testa o estado em que o carro se encontra
	public boolean isParado() {
		return parado;
	}
	//muda o estado do carro
	public void setParado(boolean pa) {
		this.parado = pa;
	}
	
}
