package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import java.util.List;
import br.com.fiap.bancodadoson.dao.GastoDAO;
import br.com.fiap.bancodadoson.model.GastoInfo;

public class GastoListaView {

	public static void main(String[] args) {

		try {
			
			GastoDAO dao = new GastoDAO();
			List<GastoInfo> listaGasto= dao.findAll();

			for (GastoInfo gastoInfo : listaGasto) {
				System.out.println(gastoInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
