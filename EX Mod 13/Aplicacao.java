package Modulo13;

public class Aplicacao {

	public static void main(String[] args) {
		PF pessoaFisica = new PF("Paulo", "Rua teste", "123.654.789-21", "133.66.4.2");
		
		System.out.println(pessoaFisica.toString());
		
		PJ pessoaJuridica = new PJ("Ebac", "Rua JAva Web", "61745987000-11", "123654789");
		System.out.println(pessoaJuridica.toString());

	}

}
