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
	
	
	Medico(String nomeMedico, String sexo, String titulacaoMedico, int salaMedico) {
		super(nomeMedico, sexo);
	
		this.setNomeMedico(nomeMedico);
		this.setSexo(sexo);

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
