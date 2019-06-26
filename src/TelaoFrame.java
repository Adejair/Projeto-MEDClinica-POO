import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;



public class TelaoFrame extends JPanel {
	
	TelaoFrame(String salaAtendimento, String medico, String paciente) {
		 JFrame f = new JFrame("Telao de atendimento");
		 
		 
		 f.setLayout(new GridLayout(2, 3));
		 f.setSize(700, 100);

		Border borderTop = BorderFactory.createLineBorder(Color.blue);
		 
	    JLabel salaLabelTop = new JLabel("Sala", JLabel.CENTER);
	    salaLabelTop.setVerticalTextPosition(JLabel.BOTTOM);
	    salaLabelTop.setHorizontalTextPosition(JLabel.CENTER);
	    salaLabelTop.setBorder(borderTop);
	    salaLabelTop.setForeground(Color.blue);
	    salaLabelTop.setFont(new Font(salaLabelTop.getFont().getName(), salaLabelTop.getFont().getStyle(), 15));
	    
	    
	    JLabel medicoLabelTop = new JLabel("Medico", JLabel.CENTER);
	    medicoLabelTop.setVerticalTextPosition(JLabel.BOTTOM);
	    medicoLabelTop.setHorizontalTextPosition(JLabel.CENTER);
	    medicoLabelTop.setBorder(borderTop);
	    medicoLabelTop.setForeground(Color.blue);
	    medicoLabelTop.setFont(new Font(medicoLabelTop.getFont().getName(), medicoLabelTop.getFont().getStyle(), 15));
	    
	    JLabel pacienteLabelTop = new JLabel("Paciente", JLabel.CENTER);
	    pacienteLabelTop.setVerticalTextPosition(JLabel.BOTTOM);
	    pacienteLabelTop.setHorizontalTextPosition(JLabel.CENTER);
	    pacienteLabelTop.setBorder(borderTop);
	    pacienteLabelTop.setForeground(Color.blue);
	    pacienteLabelTop.setFont(new Font(pacienteLabelTop.getFont().getName(), pacienteLabelTop.getFont().getStyle(), 15));
		 
		 
		    
	    JLabel labelSala = new JLabel("INICIALIZANDO COMPONENTE....");

	    Border border = BorderFactory.createLineBorder(Color.BLACK);
	    labelSala.setBorder(border);
	    labelSala.setPreferredSize(new Dimension(150, 100));
	    
	    labelSala.setText(salaAtendimento);
	    
	    labelSala.setHorizontalAlignment(JLabel.CENTER);
	    labelSala.setVerticalAlignment(JLabel.CENTER);
	    
	    JLabel medicoLabel = new JLabel(medico, JLabel.CENTER);
	    medicoLabel.setVerticalTextPosition(JLabel.BOTTOM);
	    medicoLabel.setHorizontalTextPosition(JLabel.CENTER);
	    medicoLabel.setBorder(border);

	    JLabel pacienteLabel = new JLabel(paciente, JLabel.CENTER);
	    pacienteLabel.setVerticalTextPosition(JLabel.BOTTOM);
	    pacienteLabel.setHorizontalTextPosition(JLabel.CENTER);
	    pacienteLabel.setBorder(border);

	    DesenharLinha linha = new DesenharLinha();
	   
	    f.add(salaLabelTop);
	    f.add(medicoLabelTop);
	    f.add(pacienteLabelTop);
	    
	    f.add(labelSala);
	    f.add(medicoLabel);
	    f.add(pacienteLabel);
	    
	    f.setBackground(Color.BLUE);
	    f.setVisible(true);
	}

}
