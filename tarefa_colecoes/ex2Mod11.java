package Modulo11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2Mod11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome e sexo das pessoas: ");
		String texto = sc.nextLine();
		
		/*TRANSFORMO TUDO PRA MINUSCULO*/
		texto = texto.toLowerCase();
			
		/*TRANSFORMO A STRING EM ARRAY*/
		String[] str= texto.split(",");
			
		/*CRIO AS LISTAS*/
		List<String> homens=new ArrayList<>();
		List<String> mulheres=new ArrayList<>();
		
		/*SE UM ELEMENTO DO ARRAY FOR MASCULINO JOGO NA LISTA HOMENS SENAO JOGO NA LISTA MULHERES*/
		for (int i=0;i<str.length;i++) {
			if(str[i].contains("-m"))
				homens.add(str[i]);
			else
				mulheres.add(str[i]);
		}
		
		/*CONVERTO LISTA PRA STRING E ESPECIFICO O DELIMITADOR*/
		String delim = " ";
		String resH = String.join(delim, homens);
		String resM = String.join(delim, mulheres);
		
		/*APAGO -M / -F*/
		String strHomem = resH.replace("-m", "");
		String strMulher = resM.replace("-f", "");
	    
		//IMPRIMO SOMENTE A STRING
		System.out.println();
		System.out.println(("String HOMENS " + strHomem));
		System.out.println(("String MULHERES " + strMulher));

		/*ZERO A LISTA*/
		homens.clear();
		mulheres.clear();
		
		homens.add(strHomem);
		mulheres.add(strMulher);
		
		System.out.println();
		System.out.println("LISTA HOMENS " +homens);
		System.out.println("LISTA MULHERES " +mulheres);
	}
}

