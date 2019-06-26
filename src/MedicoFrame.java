import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MedicoFrame extends JPanel {
	
	private JTextField nomeMedico; 
	private JComboBox sexoMedico; 
	private JComboBox titulacaoMedico; 
	private JTextField sala; 
	
	private JButton adicionar;
	
	private final String[] titulacoes = { "Cirugiao Geral", "Fonoaudilogo"};
	private final String[] sexo = { "Masculino", "Feminino"};
	
	
	MedicoFrame() {
		JFrame f = new JFrame("Medico Adicionar");
		 f.setSize(500, 100);
		 f.setLayout(new FlowLayout());

		 
		 nomeMedico = new JTextField("Nome do Medico", 10);
		 sala = new JTextField("Sala", 3);
		 
		 titulacaoMedico = new JComboBox(titulacoes);
		 sexoMedico = new JComboBox(sexo);
		 
		 
		 adicionar = new JButton("ADICIONAR");
		 
		 f.add(nomeMedico);
		 f.add(sala);
		 f.add(sexoMedico);
		 f.add(titulacaoMedico);
		 f.add(adicionar);
		 
		 f.setVisible(true);
		 
	}
}
