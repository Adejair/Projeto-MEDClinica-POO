import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends Frame {
	
	private JButton btnTelao;
	private JButton btnAdicionarMedicos;
	private JButton btnAdicionarPaciente;

	Menu() {
		JFrame f = new JFrame("MEDClinica");
        f.setSize(400,400); 

	        // Tipo de Layout
        f.setLayout(new GridLayout(4, 1));
        
        btnTelao = new JButton("Abrir Telao");
        btnAdicionarPaciente = new JButton("Adicionar Paciente");
        btnAdicionarMedicos = new JButton("Adicionar Medicos");

        f.add(btnTelao);
        f.add(btnAdicionarMedicos);
        f.add(btnAdicionarPaciente);
	        

        f.setVisible(true);  

        
        
        btnTelao.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	  {
    	
    			
    			try {
					String[] carregarProximoPaciente = new Paciente().carregarProximoPaciente();
					System.out.println(carregarProximoPaciente);
					new Telao("12", carregarProximoPaciente[1], carregarProximoPaciente[0]);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
