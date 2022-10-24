package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import java.util.List;
import br.com.fiap.bancodadoson.dao.ContaDAO;
import br.com.fiap.bancodadoson.model.ContaInfo;

public class ContaListaView {

	public static void main(String[] args) {

		try {
			
			ContaDAO dao = new ContaDAO();
			List<ContaInfo> listaConta = dao.findAll();
			for (ContaInfo contaInfo : listaConta) {
				System.out.println(contaInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
