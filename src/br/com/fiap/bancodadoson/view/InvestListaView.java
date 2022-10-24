package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import java.util.List;
import br.com.fiap.bancodadoson.dao.InvestimentoDAO;
import br.com.fiap.bancodadoson.model.InvestInfo;

public class InvestListaView {

	public static void main(String[] args) {

		try {
			
			InvestimentoDAO dao = new InvestimentoDAO();
			List<InvestInfo> listaInvest = dao.findAll();

			for (InvestInfo investInfo : listaInvest) {
				System.out.println(investInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
