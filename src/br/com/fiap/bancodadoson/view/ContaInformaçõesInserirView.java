package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import br.com.fiap.bancodadoson.dao.ContaDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;

public class ContaInformaçõesInserirView {

	public static void main(String[] args) throws SQLException {

		ContaInfo info = new ContaInfo();
		info.setNomeCompleto("Joao Pedro");
		info.setValorSaldo(2000);
		info.setCodUser(info.getCodUser()); // Valor padrão inserido no DB para realização dos testes.
		ContaDAO dao = new ContaDAO();
		dao.insert(info);
		
		//Classe apenas para teste, visto que o usuario não deverá conseguir alterar as informações acima.
		//O cadastro da CONTA do usuario deve ser feito apenas uma vez por usuario.
		
	}
}
