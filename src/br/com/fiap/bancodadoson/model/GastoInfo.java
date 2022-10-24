package br.com.fiap.bancodadoson.model;


public class GastoInfo {

	private int codGasto;
	private int codUsuario;
	private int codConta;
	private double valorGasto;
	private String dataGasto;
	private String descricaoGasto;
	
	
	public GastoInfo(int codGasto, int codUsuario, int codConta, double valorGasto, String dataGasto, String descricaoGasto) {
		super();
		this.codGasto = codGasto;
		this.codUsuario = codUsuario;
		this.codConta = codConta;
		this.valorGasto = valorGasto;
		this.dataGasto = dataGasto;
		this.descricaoGasto = descricaoGasto;
	}

	public String getDataGasto() {
		return dataGasto;
	}

	public void setDataGasto(String dataGasto) {
		this.dataGasto = dataGasto;
	}

	public GastoInfo() {
	}

	public int getCodGasto() {
		return codGasto;
	}

	public void setCodGasto(int codGasto) {
		this.codGasto = codGasto;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}

	public String getDescricaoGasto() {
		return descricaoGasto;
	}

	public void setDescricaoGasto(String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}

	@Override
	public String toString() {
		return "GastoInfo [codGasto=" + codGasto + ", codUsuario=" + codUsuario + ", codConta=" + codConta
				+ ", valorGasto=" + valorGasto + ", dataGasto=" + dataGasto + ", descricaoGasto=" + descricaoGasto
				+ "]";
	}
	
}