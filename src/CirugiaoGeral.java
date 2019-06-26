import java.util.ArrayList;

public class CirugiaoGeral extends Medico implements MedicoInterface {
	
	CirugiaoGeral() {
		super("Cirugiao Geral", 23);
	}

	@Override
	public ArrayList<String> carregarHabilidades() {
		this.setHabilidades("cirurgia vascular");
		this.setHabilidades("cirurgia torácica");
		this.setHabilidades("cirurgia urológica");
		this.setHabilidades("cirurgia pediátrica");
		this.setHabilidades("cirurgia plástica");
		this.setHabilidades("cirurgia de cabeça e pescoço");
		
		
		return this.getHabilidades();
		
	}	


}
