package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import java.util.List;
import br.com.fiap.bancodadoson.dao.RecebimentoDAO;
import br.com.fiap.bancodadoson.model.RecebInfo;

public class RecebimentoListaView {

	public static void main(String[] args) {

		try {
			
			RecebimentoDAO dao = new RecebimentoDAO();
			List<RecebInfo> listaReceb = dao.findAll();

			for (RecebInfo recebInfo : listaReceb) {
				System.out.println(recebInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
