package br.com.fiap.bancodadoson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.bancodadoson.model.InvestInfo;

public class InvestimentoDAO {

	
	
		
	public List<InvestInfo> findAll() throws SQLException{
		
		List<InvestInfo> listaInvest = new ArrayList<InvestInfo>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_INVESTIMENTO");
			
			
			while( rs.next() ) {
				
				InvestInfo investInfo = new InvestInfo();
				investInfo.setCodInvest( rs.getInt("CD_INVESTIMENTO") );
				investInfo.setCodConta( rs.getInt("CD_CONTA") );
				investInfo.setCodUsuario( rs.getInt("CD_USUARIO") );
				investInfo.setNomeInvestimento( rs.getString("NM_INVESTIMENTO") );
				investInfo.setValorInvestimento( rs.getDouble("VL_INVESTIMENTO") );
				investInfo.setDataAplicacao( rs.getString("DT_APLICAÇÃO") );
				investInfo.setDataVencimento( rs.getString("DT_VENCIMENTO") );
				investInfo.setTipoInvestimento( rs.getString("DS_TIPO") );
				
				
				
				listaInvest.add(investInfo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return listaInvest;
		
	}
	
	public void insert(InvestInfo investInfo) throws SQLException {
		String SQL1 = 
			" INSERT INTO T_INVESTIMENTO(CD_INVESTIMENTO, CD_CONTA, CD_USUARIO, NM_INVESTIMENTO, VL_INVESTIMENTO, DT_APLICAÇÃO, DT_VENCIMENTO,  DS_TIPO  ) "
			+ " VALUES (SQ_INVESTIMENTO.NEXTVAL, ? , ? , ?, ?, ?, ?, ? )";
		
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("url", "XXXXXX", "XXXXXX");
			PreparedStatement ptmt = conn.prepareStatement(SQL1);

			
			ptmt.setInt(1, investInfo.getCodConta());
			ptmt.setDouble(2, investInfo.getCodUsuario());
			ptmt.setString(3, investInfo.getNomeInvestimento());
			ptmt.setDouble(4, investInfo.getValorInvestimento());
			ptmt.setString(5, investInfo.getDataAplicacao());
			ptmt.setString(6, investInfo.getDataVencimento());
			ptmt.setString(7, investInfo.getTipoInvestimento());
			
			ptmt.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
	}	
}
