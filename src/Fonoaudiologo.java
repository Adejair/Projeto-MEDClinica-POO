import java.util.ArrayList;

public class Fonoaudiologo extends Medico implements MedicoInterface{

	Fonoaudiologo() {
		super("Fonoaudilogo", 10);
	}
	
	@Override
	public ArrayList<String> carregarHabilidades() {
		this.setHabilidades(" REALIZAR AVALIAÇÃO FONOAUDIOLÓGICA ");
		this.setHabilidades(" REALIZAR DIAGNÓSTICO DE FONOAUDIOLOGIA ");
		this.setHabilidades(" EXECUTAR TERAPIA (HABILITAÇÃO/REABILITAÇÃO)");
		this.setHabilidades(" MONITORAR DESEMPENHO DO PACIENTE OU\n" + 
				"CLIENTE  ");
		return this.getHabilidades();
	}
	
	private void fazerFonoaudiologia() { 
		// TODO: Registrar no banco de dados..
	}

}
