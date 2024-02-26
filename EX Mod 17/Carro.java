package cap17;

public  abstract class  Carro {
	 	private String nome;
	    

	    public Carro(String nome) {
	        this.nome = nome;
	    
	    }

	    public void imprimir() {
	        System.out.println("Marca: " + this.getClass().getSimpleName() + " - Modelo: " + nome);
	    }
}
