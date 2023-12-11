package Aula_1206;

public class Cardapio {

	public static void main(String[] args) {
				int categoria = 0;
				int lanches= 2;
				int bebidas=2;
				int sobremesas=1;
				switch (categoria) {
						case 1:
							System.out.println("Voce escolheu Lanches");
							switch (lanches) {
									case 1:
										System.out.println("Voce escolheu um hamburger");
									break;
									case 2:
										System.out.println("Voce escolheu um hotdog");
									break;
		
									default:
										System.out.println("Voce escolheu um alimento nao valido");
									break;
							}
						break;
						case 2:
							System.out.println("Voce escolheu Bebidas");
							switch (bebidas) {
									case 1:
										System.out.println("Voce escolheu uma coca cola");
									break;
									case 2:
										System.out.println("Voce escolheu uma agua");
									break;
		
									default:
										System.out.println("Voce escolheu uma bebida nao valida");
									break;
					        }
						break;
						case 3:
							System.out.println("Voce escolheu Sobremesas");
							switch (sobremesas) {
								case 1:
									System.out.println("Voce escolheu um pudim");
								break;
								case 2:
									System.out.println("Voce escolheu um bolo de chocolate");
								break;
	
								default:
									System.out.println("Voce escolheu uma sobremesa nao valida");
								break;
					        }
						break;
						default:
							System.out.println("Voce nao escolheu uma categoria valida");
						break;
						
				}

	}

}
