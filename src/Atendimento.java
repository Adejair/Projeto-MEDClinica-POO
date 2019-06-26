import java.util.Stack;

public class Atendimento  {
	protected int notaAtendimento;
	protected Stack<Paciente> listaAtendimentos = new Stack<Paciente>();
	
	
	protected void registrarAtendimento(Paciente paciente) {
		// bd_paciente.
		System.out.println(">> registrando atendimento do paciente ");
	}


	protected int getNotaAtendimento() {
		return notaAtendimento;
	}


	protected void setNotaAtendimento(int notaAtendimento) {
		this.notaAtendimento = notaAtendimento;
	}
	
	protected void pedirAtendimento(Paciente paciente) {
		this.listaAtendimentos.add(paciente);
	}
	
	
	
	protected String getAtendimentos(int numeroAtendimento) { 
		return this.listaAtendimentos.toString();
	}
	
	
	
}
