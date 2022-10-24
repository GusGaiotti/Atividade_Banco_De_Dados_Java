package br.com.fiap.bancodadoson.model;

public class RecebInfo {

	private int codRecebimento;
	private int codConta;
	private int codUsuario;
	private double valorRecebimento;
	private String dataRecebimento;
	private String tipoRecebimento;
	


	@Override
	public String toString() {
		return "RecebInfo [codRecebimento=" + codRecebimento + ", codConta=" + codConta + ", codUsuario=" + codUsuario
				+ ", valorRecebimento=" + valorRecebimento + ", dataRecebimento=" + dataRecebimento
				+ ", tipoRecebimento=" + tipoRecebimento + "]";
	}

	public RecebInfo() {
	}
	
	public RecebInfo(int codRecebimento, int codConta, int codUsuario, double valorRecebimento, String dataRecebimento,
			String tipoRecebimento) {
		super();
		this.codRecebimento = codRecebimento;
		this.codConta = codConta;
		this.codUsuario = codUsuario;
		this.valorRecebimento = valorRecebimento;
		this.dataRecebimento = dataRecebimento;
		this.tipoRecebimento = tipoRecebimento;
	}
	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public int getCodRecebimento() {
		return codRecebimento;
	}
	public void setCodRecebimento(int codRecebimento) {
		this.codRecebimento = codRecebimento;
	}
	public int getCodConta() {
		return codConta;
	}
	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public double getValorRecebimento() {
		return valorRecebimento;
	}
	public void setValorRecebimento(double valorRecebimento) {
		this.valorRecebimento = valorRecebimento;
	}
	public String getTipoRecebimento() {
		return tipoRecebimento;
	}
	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}
	
	
	
}