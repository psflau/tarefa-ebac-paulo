
public class exMod8 {

	public static void main(String[] args) {
		media();
	}
	
	public static void media(){
		double nota1, nota2, nota3, nota4;
	    double media = 0;
	    String nome = "Paulo";
		
        nota1 = 8;
        System.out.println("Aluno " + nome + ", 1ª nota: " + nota1);
        
        
        nota2 = 5;
        System.out.println("Aluno " + nome + ", 2ª nota: " + nota2);

        
        nota3 = 7;
        System.out.println("Aluno " + nome + ", 3ª nota: " + nota3);
        
        nota4 = 9;
        System.out.println("Aluno " + nome + ", 4ª nota: " + nota4);
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno " + nome + " é " + media);
        
	}

}
