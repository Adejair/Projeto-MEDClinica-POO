import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends Frame {
	
	private JButton btnTelao;
	private JButton btnAdicionarMedicos;
	private JButton btnAdicionarPaciente;
	private JButton btnChamarProximoPaciente;
	
	Menu() {
		JFrame f = new JFrame("MEDClinica");
        f.setSize(400,400); 

	        // Tipo de Layout
        f.setLayout(new GridLayout(4, 1));
        
        btnTelao = new JButton("Abrir Telao");
        btnAdicionarPaciente = new JButton("Adicionar Paciente");
        btnAdicionarMedicos = new JButton("Adicionar Medicos");
        btnChamarProximoPaciente = new JButton("Chamar Proximo Paciente");
        
        f.add(btnChamarProximoPaciente);
        f.add(btnTelao);
        f.add(btnAdicionarMedicos);
        f.add(btnAdicionarPaciente);
	        

        f.setVisible(true);  

        
        btnTelao.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	  {
    			new Telao("12", "joarez(psiquiatra)", "isabella");
        	  }
        });
        
        btnAdicionarMedicos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	  {
        		new MedicoFrame();
        	  }
        });
        
        btnAdicionarPaciente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	  {
        		new PacienteFrame();
        	  }
        });
        
       
	}
}
