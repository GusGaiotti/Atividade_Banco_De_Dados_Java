package br.com.fiap.bancodadoson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.bancodadoson.model.ObjetivoInfo;


public class ObjetivoDAO {

	
	
		
	public List<ObjetivoInfo> findAll() throws SQLException{
		
		List<ObjetivoInfo> listaObjetivo = new ArrayList<ObjetivoInfo>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_OBJETIVO");
			
			
			while( rs.next() ) {
				
				ObjetivoInfo objetivoInfo = new ObjetivoInfo();
				objetivoInfo.setCodObjetivo( rs.getInt("CD_OBJETIVO") );
				objetivoInfo.setCodUsuario( rs.getInt("CD_USUARIO") );
				objetivoInfo.setNomeObjetivo( rs.getString("NM_OBJETIVO") );
				objetivoInfo.setDescricaoObjetivo( rs.getString("DS_OBJETIVO") );
				objetivoInfo.setValorObjetivo( rs.getDouble("VL_OBJETIVO") );
				objetivoInfo.setDataFinal( rs.getString("DT_FINAL") );
				
				listaObjetivo.add(objetivoInfo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return listaObjetivo;
		
	}
	
	public void insert(ObjetivoInfo objetivoInfo) throws SQLException {
		String SQL1 = 
			" INSERT INTO T_OBJETIVO(CD_OBJETIVO, CD_USUARIO, NM_OBJETIVO, DS_OBJETIVO, VL_OBJETIVO, DT_FINAL  ) "
			+ " VALUES (SQ_OBJETIVO.NEXTVAL, ? , ? , ? , ? , ?)";
		
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			PreparedStatement ptmt = conn.prepareStatement(SQL1);

			
			ptmt.setInt(1, objetivoInfo.getCodUsuario());
			ptmt.setString(2, objetivoInfo.getNomeObjetivo());
			ptmt.setString(3, objetivoInfo.getDescricaoObjetivo());
			ptmt.setDouble(4, objetivoInfo.getValorObjetivo());
			ptmt.setString(5, objetivoInfo.getDataFinal());
			
			ptmt.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
	}	
}
