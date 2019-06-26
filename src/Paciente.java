import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Paciente extends Pessoa {
	
	Paciente() {}
	
	Paciente(String nomePaciente, String sexoPaciente, String medicoStr) throws SQLException {
		super(nomePaciente, sexoPaciente);
		String sql = "INSERT INTO PACIENTES(NOME, SEXO, MEDICO) VALUES (?, ?, ?)";
		
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db"); 
				PreparedStatement pstmt = connection.prepareStatement(sql);) {			
			pstmt.setString(1, nomePaciente);
			pstmt.setString(2, sexoPaciente);
			pstmt.setString(3, medicoStr);
	
			pstmt.executeUpdate();
			System.out.println("inserido!");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public String[] carregarProximoPaciente() throws SQLException {
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) 
		{
			String[] dados = new String[2];
			
            PreparedStatement stmt = connection.prepareStatement("SELECT NOME,MEDICO from PACIENTES ORDER BY ID DESC");
            ResultSet resultSet = stmt.executeQuery();
            
            while(resultSet.next()) {
  
            	String nome = resultSet.getString("NOME");
            	String medico = resultSet.getString("MEDICO");
            	
            	dados[0] = nome;
            	dados[1] = medico;
            	
            	return dados;
            }
            
           
			return null;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
