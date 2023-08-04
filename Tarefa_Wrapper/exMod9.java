
public class exMod9 {

	public static void main(String[] args) {
		 //CASTING IMPLICITO
		char ch = 'P';
	    int in = 'F';
	    float f = 39;
	    
	    System.out.println();
	    System.out.println("IMPLICITO");
	    System.out.println("Char: " + ch);
	    System.out.println("Int: " + in);
	    System.out.println("Float: " + f);
	    
	    //CASTING EXPLICITO
	    char ch2 = (char) 110.5;
	    int in2 = (int) 723.471;
	    int in3 = (char) (ch);
	    float f2  = (float) 5.0;

	    System.out.println();
	    System.out.println("EXPLICITO");
	    System.out.println("Char: " + ch2);
	    System.out.println("Int: " + in2);
	    System.out.println("Int: " + in3);
	    System.out.println("Float: " + f2);
	    
	}

}
