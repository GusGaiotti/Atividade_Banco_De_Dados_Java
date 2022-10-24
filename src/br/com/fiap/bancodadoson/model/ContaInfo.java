package br.com.fiap.bancodadoson.model;

public class ContaInfo {

	
	private int codConta = 3; // Valores padrões definidos para realização dos testes.
	private int codUser = 3; // Valores padrões definidos para realização dos testes.
	private String nomeCompleto;
	private double valorSaldo;
	
	
	public ContaInfo() {
	}
	
	public ContaInfo(int codConta, String nomeCompleto, double valorSaldo, int codUser) {
		super();
		this.codConta = codConta;
		this.nomeCompleto = nomeCompleto;
		this.valorSaldo = valorSaldo;
		this.codUser = codUser;
	}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public int getCodUser() {
		return codUser;
	}

	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}

	@Override
	public String toString() {
		return "ContaInfo [codConta=" + codConta + ", nomeCompleto=" + nomeCompleto + ", valorSaldo=" + valorSaldo
				+ ", codUser=" + codUser + "]";
	}

}
