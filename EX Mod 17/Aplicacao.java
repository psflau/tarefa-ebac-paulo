package cap17;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		  List<Carro> carros = new ArrayList<>();
	        carros.add(new VW("Polo"));
	        carros.add(new Fiat("Argo"));
	        carros.add(new Ford("Ranger"));
	        
	        imprimirCarros(carros);
	    }

	    public static void imprimirCarros(List<? extends Carro> lista) {
	        for (Carro c : lista)  //pego somente o que estende de carro 
	        	c.imprimir();
	    }
	}


