package Aula_1406;

public class ArrayList1 {

	public static void main(String[] args) {
		java.util.List<String> nomes = new java.util.ArrayList<String>();
        nomes.add("Kleber");
        nomes.add("Manoel");
        nomes.add("Pedro");
        nomes.add("Paulo");
        System.out.println("Nomes:");
        for(String vassoura : nomes) {
        	System.out.println(vassoura);
        }
	}

}
