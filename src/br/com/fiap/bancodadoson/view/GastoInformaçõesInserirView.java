package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;

import br.com.fiap.bancodadoson.dao.GastoDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;
import br.com.fiap.bancodadoson.model.GastoInfo;

public class GastoInformaçõesInserirView {

	public static void main(String[] args) throws SQLException {

		GastoInfo info = new GastoInfo();
		ContaInfo infoConta  = new ContaInfo();
		info.setCodUsuario(infoConta.getCodUser()); // Valor padrão inserido no DB para realização dos testes.
		info.setCodConta(infoConta.getCodConta()); // Valor padrão inserido na classe "InfoConta" para realização dos testes e vinculo com Classe usuario.
		info.setValorGasto(250);
		info.setDataGasto("15/04/2020");
		info.setDescricaoGasto("Despesa geral");
		
		GastoDAO dao = new GastoDAO();
		dao.insert(info);
		
		
	}
}
