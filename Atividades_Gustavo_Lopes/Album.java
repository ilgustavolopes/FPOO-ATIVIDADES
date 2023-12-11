package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Album {

	public static void main(String[] args) {
		
		int n[] = {};//3 espaços
        int m[] = {1,2};
        int i;
        for(i=0; i<3; i++) {
          if(n[i] == m[i]) {
        	  m[i] = m[i] - m[i];
          }
        }
	}

}
