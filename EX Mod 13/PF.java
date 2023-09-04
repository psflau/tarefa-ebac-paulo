package Modulo13;

public class PF extends Pessoa{
	private String cpf;
	private String rg;
	
	
	
	
	public PF(String nome, String endereco, String cpf, String rg) {
		super(nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa Fisica [nome=" + super.getNome() + ", endereco= " + super.getEndereco()
		+ ", cpf= " + this.getCpf() + " , rg= "+ this.getRg()+ "]";
	}
	
	
	
}
