package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import br.com.fiap.bancodadoson.dao.ObjetivoDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;
import br.com.fiap.bancodadoson.model.ObjetivoInfo;

public class ObjetivoInformaçõesInserirView {

	public static void main(String[] args) throws SQLException {

		ObjetivoInfo info = new ObjetivoInfo();
		ContaInfo infoConta  = new ContaInfo();
		info.setCodUsuario(infoConta.getCodUser()); // Valor padrão inserido no DB para realização dos testes.
		info.setNomeObjetivo("Viagem");
		info.setDescricaoObjetivo("Viagem para daqui 1 ano");
		info.setValorObjetivo(5000);
		info.setDataFinal("25/10/2023");
		
		ObjetivoDAO dao = new ObjetivoDAO();
		dao.insert(info);
		
		
	}
}
