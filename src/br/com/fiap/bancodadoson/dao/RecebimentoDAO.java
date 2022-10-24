package br.com.fiap.bancodadoson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bancodadoson.model.RecebInfo;

public class RecebimentoDAO {

	
	
		
	public List<RecebInfo> findAll() throws SQLException{
		
		List<RecebInfo> listaReceb = new ArrayList<RecebInfo>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_RECEBIMENTO");
			
			
			while( rs.next() ) {
				
				RecebInfo recebInfo = new RecebInfo();
				recebInfo.setCodRecebimento( rs.getInt("CD_RECEBIMENTO") );
				recebInfo.setCodConta( rs.getInt("CD_CONTA") );
				recebInfo.setCodUsuario( rs.getInt("CD_USUARIO") );
				recebInfo.setValorRecebimento( rs.getDouble("VL_RECEBIMENTO") );
				recebInfo.setDataRecebimento( rs.getString("DT_RECEBIMENTO") );
				recebInfo.setTipoRecebimento( rs.getString("DS_TIPO") );
				
				listaReceb.add(recebInfo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return listaReceb;
		
	}
	
	public void insert(RecebInfo recebInfo) throws SQLException {
		String SQL1 = 
			" INSERT INTO T_RECEBIMENTO(CD_RECEBIMENTO, CD_CONTA, CD_USUARIO, VL_RECEBIMENTO, DT_RECEBIMENTO, DS_TIPO  ) "
			+ " VALUES (SQ_RECEBIMENTO.NEXTVAL, ? , ? , ? , ? , ?)";
		
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			PreparedStatement ptmt = conn.prepareStatement(SQL1);

			
			ptmt.setInt(1, recebInfo.getCodConta());
			ptmt.setInt(2, recebInfo.getCodUsuario());
			ptmt.setDouble(3, recebInfo.getValorRecebimento());
			ptmt.setString(4, recebInfo.getDataRecebimento());
			ptmt.setString(5, recebInfo.getTipoRecebimento());
			
			ptmt.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
	}	
}
