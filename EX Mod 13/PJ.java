package Modulo13;

public class PJ extends Pessoa{
	private String cnpj;
	private String ie;
	
	
	
	public PJ(String nome, String endereco, String cnpj, String ie) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	
	@Override
	public String toString() {
		return "Pessoa Juridica [nome=" + super.getNome() + ", endereco= " + super.getEndereco()
		+ ", cnpj= " + this.getCnpj() + " , ie= "+ this.getIe()+ "]";
	}
	
}
