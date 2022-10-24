package br.com.fiap.bancodadoson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bancodadoson.model.ContaInfo;

public class ContaDAO {

	
	
		
	public List<ContaInfo> findAll() throws SQLException{
		
		List<ContaInfo> listaConta = new ArrayList<ContaInfo>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_CONTA");
			
			
			while( rs.next() ) {
				
				ContaInfo contaInfo = new ContaInfo();
				contaInfo.setCodConta( rs.getInt("CD_CONTA") );
				contaInfo.setNomeCompleto( rs.getString("NM_USUARIO") );
				contaInfo.setValorSaldo( rs.getDouble("VL_SALDO") );
				contaInfo.setCodUser( rs.getInt("CD_USUARIO") );
				
				listaConta.add(contaInfo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return listaConta;
		
	}
	
	public void insert(ContaInfo contaInfo) throws SQLException {
		String SQL1 = 
			" INSERT INTO T_CONTA(CD_CONTA, NM_USUARIO, VL_SALDO, CD_USUARIO  ) "
			+ " VALUES (?, ? , ? , ? )";
		
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			PreparedStatement ptmt = conn.prepareStatement(SQL1);

			ptmt.setInt(1, contaInfo.getCodConta());
			ptmt.setString(2, contaInfo.getNomeCompleto());
			ptmt.setDouble(3, contaInfo.getValorSaldo());
			ptmt.setInt(4, contaInfo.getCodUser());
			
			ptmt.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
	}	
}
