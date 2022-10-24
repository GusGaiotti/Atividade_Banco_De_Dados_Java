package br.com.fiap.bancodadoson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.bancodadoson.model.GastoInfo;

public class GastoDAO {

	
	
		
	public List<GastoInfo> findAll() throws SQLException{
		
		List<GastoInfo> listaGasto = new ArrayList<GastoInfo>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_GASTO");
			
			
			while( rs.next() ) {
				
				GastoInfo gastoInfo = new GastoInfo();
				gastoInfo.setCodGasto( rs.getInt("CD_GASTO") );
				gastoInfo.setCodUsuario( rs.getInt("CD_USUARIO") );
				gastoInfo.setCodConta( rs.getInt("CD_CONTA") );
				gastoInfo.setValorGasto( rs.getDouble("VL_GASTO") );
				gastoInfo.setDataGasto(rs.getString("DT_GASTO"));
				gastoInfo.setDescricaoGasto( rs.getString("DS_TIPO") );
				
				listaGasto.add(gastoInfo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return listaGasto;
		
	}
	
	public void insert(GastoInfo gastoInfo) throws SQLException {
		String SQL1 = 
			" INSERT INTO T_GASTO(CD_GASTO, CD_USUARIO, CD_CONTA, VL_GASTO, DT_GASTO, DS_TIPO ) "
			+ " VALUES (SQ_GASTO.NEXTVAL, ? , ? , ?, ?, ? )";
		
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			PreparedStatement ptmt = conn.prepareStatement(SQL1);

			
			ptmt.setInt(1, gastoInfo.getCodUsuario());
			ptmt.setInt(2, gastoInfo.getCodConta());
			ptmt.setDouble(3, gastoInfo.getValorGasto());
			ptmt.setString(4, gastoInfo.getDataGasto());
			ptmt.setString(5, gastoInfo.getDescricaoGasto());
			
			ptmt.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
	}	
}
