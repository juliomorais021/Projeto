package program;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adi extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Adi() {
	  
            
        setBounds(100, 100, 600, 450);
        

		setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(41, 43, 46, 14);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Preço");
		lblNewLabel_1.setBounds(41, 81, 46, 14);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setBounds(41, 128, 76, 14);
		add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(149, 125, 86, 20);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(149, 78, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(149, 40, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexao.add(lblNewLabel.getText(), Double.parseDouble(lblNewLabel_1.getText()), Integer.parseInt(lblNewLabel_2.getText()));
				JOptionPane.showMessageDialog(null, "Mercadoria adicionada");	
			}
		});
		btnNewButton.setBounds(78, 183, 89, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(78, 217, 89, 23);
		add(btnNewButton_1);
		setVisible(true);
	}

}