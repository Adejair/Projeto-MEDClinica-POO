import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PacienteFrame extends JPanel {
	
	private ArrayList<String> medicos;
	
	private JTextField nomePaciente; 
	private JComboBox sexoPaciente; 
	private JComboBox medico; 
	private JTextField sala; 
	
	private JButton adicionar;
	
	private final String[] medicoNomes = { "NENHUM MEDICO DISPONIVEL"};
	private final String[] sexo = { "Masculino", "Feminino"};

	PacienteFrame() {
		loadInfo();
		
		
		JFrame f = new JFrame("Paciente Adicionar");
		 f.setSize(500, 100);
		 f.setLayout(new FlowLayout());

		 
		 nomePaciente = new JTextField("Nome do paciente", 10);
		 
		 medico = new JComboBox((medicos.toArray().length > 0 ?  medicos.toArray() : medicoNomes ) );
		 sexoPaciente = new JComboBox(sexo);
		 
		 
		 
		 adicionar = new JButton("ADICIONAR");
		 
		 f.add(nomePaciente);
		 f.add(sexoPaciente);
		 f.add(medico);
		 f.add(adicionar);
		 
		 f.setVisible(true);
		 
		 
		 
		 
        adicionar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	  {
    			try {
					new Paciente(nomePaciente.getText(), String.valueOf(sexoPaciente.getSelectedItem()), String.valueOf(medico.getSelectedItem()));
					loadInfo();
    			} catch (SQLException e1) {
					e1.printStackTrace();
				}
        	  }
        });
        
	}
	
	
	public void loadInfo() {
		try {
			
			medicos = new Medico().carregarMedicos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
