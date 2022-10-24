package br.com.fiap.bancodadoson.model;

public class ObjetivoInfo {

	private int codObjetivo;
	private int codUsuario;
	private String NomeObjetivo;
	private String DescricaoObjetivo;
	private double ValorObjetivo;
	private String dataFinal;
	
	
	
	public ObjetivoInfo() {
	}
	
	public ObjetivoInfo(int codObjetivo, int codUsuario, String nomeObjetivo, String descricaoObjetivo,
			double valorObjetivo, String dataFinal) {
		super();
		this.codObjetivo = codObjetivo;
		this.codUsuario = codUsuario;
		NomeObjetivo = nomeObjetivo;
		DescricaoObjetivo = descricaoObjetivo;
		ValorObjetivo = valorObjetivo;
		this.dataFinal = dataFinal;
	}



	@Override
	public String toString() {
		return "ObjetivoInfo [codObjetivo=" + codObjetivo + ", codUsuario=" + codUsuario + ", NomeObjetivo="
				+ NomeObjetivo + ", DescricaoObjetivo=" + DescricaoObjetivo + ", ValorObjetivo=" + ValorObjetivo
				+ ", dataFinal=" + dataFinal + "]";
	}



	public int getCodObjetivo() {
		return codObjetivo;
	}



	public void setCodObjetivo(int codObjetivo) {
		this.codObjetivo = codObjetivo;
	}



	public int getCodUsuario() {
		return codUsuario;
	}



	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}



	public String getNomeObjetivo() {
		return NomeObjetivo;
	}



	public void setNomeObjetivo(String nomeObjetivo) {
		NomeObjetivo = nomeObjetivo;
	}



	public String getDescricaoObjetivo() {
		return DescricaoObjetivo;
	}



	public void setDescricaoObjetivo(String descricaoObjetivo) {
		DescricaoObjetivo = descricaoObjetivo;
	}



	public double getValorObjetivo() {
		return ValorObjetivo;
	}



	public void setValorObjetivo(double valorObjetivo) {
		ValorObjetivo = valorObjetivo;
	}



	public String getDataFinal() {
		return dataFinal;
	}



	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	} 
	
}
	
	
	
	