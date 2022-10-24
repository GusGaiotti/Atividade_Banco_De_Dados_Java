package br.com.fiap.bancodadoson.view;

import java.sql.SQLException;
import java.util.List;
import br.com.fiap.bancodadoson.dao.ObjetivoDAO;
import br.com.fiap.bancodadoson.model.ObjetivoInfo;

public class ObjetivoListaView {

	public static void main(String[] args) {

		try {
			
			ObjetivoDAO dao = new ObjetivoDAO();
			List<ObjetivoInfo> listaObjetivo= dao.findAll();

			for (ObjetivoInfo objetivoInfo : listaObjetivo) {
				System.out.println(objetivoInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
