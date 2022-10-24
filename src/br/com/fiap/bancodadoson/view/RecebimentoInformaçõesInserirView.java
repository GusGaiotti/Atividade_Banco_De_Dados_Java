package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;

import br.com.fiap.bancodadoson.dao.RecebimentoDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;
import br.com.fiap.bancodadoson.model.RecebInfo;

public class RecebimentoInformaçõesInserirView {

	public static void main(String[] args) throws SQLException {

		RecebInfo info = new RecebInfo();
		ContaInfo infoConta  = new ContaInfo();
		info.setCodConta(infoConta.getCodConta()); // Valor padrão inserido na classe "InfoConta" para realização dos testes e vinculo com Classe usuario.
		info.setCodUsuario(infoConta.getCodUser()); // Valor padrão inserido no DB para realização dos testes.
		info.setValorRecebimento(2500);
		info.setDataRecebimento("20/10/2022");
		info.setTipoRecebimento("TED");
		
		
		RecebimentoDAO dao = new RecebimentoDAO();
		dao.insert(info);
		
		
	}
}
