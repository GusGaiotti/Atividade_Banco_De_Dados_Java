package br.com.fiap.bancodadoson.model;

public class InvestInfo {

	private int codInvest;
	private int codConta;
	private int codUsuario;	
	private String nomeInvestimento;
	private double valorInvestimento;
	private String dataAplicacao;
	private String dataVencimento;
	private String tipoInvestimento;
	
	
	
	public InvestInfo(int codInvest, int codConta, int codUsuario, String nomeInvestimento, double valorInvestimento,
			String dataAplicacao, String dataVencimento, String tipoInvestimento) {
		super();
		this.codInvest = codInvest;
		this.codConta = codConta;
		this.codUsuario = codUsuario;
		this.nomeInvestimento = nomeInvestimento;
		this.valorInvestimento = valorInvestimento;
		this.dataAplicacao = dataAplicacao;
		this.dataVencimento = dataVencimento;
		this.tipoInvestimento = tipoInvestimento;
	}

	public String getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	public InvestInfo() {
	}
	
	public int getCodInvest() {
		return codInvest;
	}

	public void setCodInvest(int codInvest) {
		this.codInvest = codInvest;
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

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public double getValorInvestimento() {
		return valorInvestimento;
	}

	public void setValorInvestimento(double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}

	@Override
	public String toString() {
		return "InvestInfo [codInvest=" + codInvest + ", codConta=" + codConta + ", codUsuario=" + codUsuario
				+ ", nomeInvestimento=" + nomeInvestimento + ", valorInvestimento=" + valorInvestimento
				+ ", dataAplicacao=" + dataAplicacao + ", dataVencimento=" + dataVencimento + ", tipoInvestimento="
				+ tipoInvestimento + "]";
	}



	






















}