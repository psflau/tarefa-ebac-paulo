package Modulo11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex1Mod11 {

	public static void main(String[] args) {
		ListaOrdenada();
        
	}

	
	public static void ListaOrdenada() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os nomes sem espaco e com a virgula como separador: ");
		String str = sc.next();
		 
        List<String> lista = Arrays.asList(str.split(","));
        System.out.println();
        System.out.println("LISTA DESORDENADA");
        System.out.println(lista); 
        System.out.println();
        Collections.sort(lista);
        System.out.println("LISTA ORDENADA");
        System.out.println(lista); 
        sc.close();
	}
	
	
}

