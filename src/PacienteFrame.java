import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PacienteFrame extends JPanel {
	
	private JTextField nomePaciente; 
	private JComboBox sexoPaciente; 
	private JComboBox medico; 
	private JTextField sala; 
	
	private JButton adicionar;
	
	private final String[] medicoNomes = { "Medico Ninguem"};
	private final String[] sexo = { "Masculino", "Feminino"};

	PacienteFrame() {
		JFrame f = new JFrame("Paciente Adicionar");
		 f.setSize(500, 100);
		 f.setLayout(new FlowLayout());

		 
		 nomePaciente = new JTextField("Nome do paciente", 10);
		 
		 medico = new JComboBox(medicoNomes);
		 sexoPaciente = new JComboBox(sexo);
		 
		 
		 adicionar = new JButton("ADICIONAR");
		 
		 f.add(nomePaciente);
		 f.add(sexoPaciente);
		 f.add(medico);
		 f.add(adicionar);
		 
		 f.setVisible(true);
		 
	}
}
