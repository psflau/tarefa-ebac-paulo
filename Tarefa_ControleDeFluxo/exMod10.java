import java.util.Scanner;

public class exMod10 {


		public static void main(String[] args) {
			media();
		}
		
		public static void media(){
			Scanner sc = new Scanner(System.in);
			double nota=0;
			for(int i = 0; i<4;i++){
				System.out.print("Digite a "+(i+1)+" nota: ");
				double valor = sc.nextDouble();
				nota+=valor;
			}
			
		    double media = nota/4;
		    
		    if (media>=7) {
		    	System.out.println("Media: " + media + " Aluno aprovado");
		    }else if(media>=5 & media<7){
		    	System.out.println("Media: " + media + " Aluno em recuperacao");
		    }else {
		    	System.out.println("Media: " + media + " Aluno reprovado");
		    }
    
	        sc.close();
	}

}
