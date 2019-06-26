import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Medico extends Pessoa {
	public String nomeMedico;
	public String sexo;
	public String titulacaoMedico;
	public int salaMedico;
	
	public ArrayList<String> habilidades = new ArrayList<String>();
	
	
	Medico() {
	}
	
	Medico(String titulacaoMedico, int salaMedico) {
		this.setTitulacaoMedico(titulacaoMedico);
		this.setSalaMedico(salaMedico);

	}
	
	
	Medico(String nomeMedico, String sexo, String titulacaoMedico, int salaMedico) throws SQLException {
		super(nomeMedico, sexo);
	
		this.setNomeMedico(nomeMedico);
		this.setSexo(sexo);
		
		String sql = "INSERT INTO MEDICOS(NOME, SEXO, TITULO, SALA) VALUES (?, ?, ?, ?)";
		
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db"); 
				PreparedStatement pstmt = connection.prepareStatement(sql);) {			
			pstmt.setString(1, nomeMedico);
			pstmt.setString(2, sexo);
			pstmt.setString(3, titulacaoMedico);
			pstmt.setInt(4, salaMedico);
	
			pstmt.executeUpdate();
			System.out.println("inserido!");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public ArrayList<String> carregarMedicos() throws SQLException {
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) 
		{
			
            PreparedStatement stmt = connection.prepareStatement("select * from MEDICOS");
            ResultSet resultSet = stmt.executeQuery();

            ArrayList<String> medicos = new ArrayList<String>();
            
            
            while (resultSet.next()) {
           
                String nome = resultSet.getString("NOME");
                String titulo = resultSet.getString("TITULO");
                Integer sala = resultSet.getInt("SALA");

                System.out.println("NOME - " + nome + "  ESPECIALIDADE " + titulo + " - SALA " + sala);
                medicos.add(nome + "(" + titulo + ")" + "(" + sala + ")");
        
            }
            
			System.out.println("inserido!");
			 return medicos;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}



	public String getNomeMedico() {
		return nomeMedico;
	}



	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getTitulacaoMedico() {
		return titulacaoMedico;
	}



	public void setTitulacaoMedico(String titulacaoMedico) {
		this.titulacaoMedico = titulacaoMedico;
	}



	public int getSalaMedico() {
		return salaMedico;
	}



	public void setSalaMedico(int salaMedico) {
		this.salaMedico = salaMedico;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}
	

	public void setHabilidades(String habilidade) {
		this.habilidades.add(habilidade);
	}
	
	public void chamarPaciente(Paciente paciente) {
		// mostrarTelao.desenharTelao(paciente.getNome(), this.getNomeMedico(), this.getSalaMedico());
	}
	
	
}
