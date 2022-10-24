package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;

import br.com.fiap.bancodadoson.dao.InvestimentoDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;
import br.com.fiap.bancodadoson.model.InvestInfo;

public class InvestimentoInformaçõesInserirView {

	public static void main(String[] args) throws SQLException {

		InvestInfo info = new InvestInfo();
		ContaInfo infoConta  = new ContaInfo();
		info.setCodConta(infoConta.getCodConta()); // Valor padrão inserido na classe "InfoConta" para realização dos testes e vinculo com Classe usuario.
		info.setCodUsuario(infoConta.getCodUser()); // Valor padrão inserido no DB para realização dos testes.
		info.setNomeInvestimento("CDB");
		info.setValorInvestimento(2000);
		info.setDataAplicacao("05/10/2019");
		info.setDataVencimento("05/10/2024");
		info.setTipoInvestimento("Pré fixado");
		
		
		InvestimentoDAO dao = new InvestimentoDAO();
		dao.insert(info);
		
		
	}
}
