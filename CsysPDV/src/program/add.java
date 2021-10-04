package program;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public add() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(30, 52, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 49, 186, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_1.setBounds(30, 85, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantidade");
		lblNewLabel_1_1.setBounds(30, 110, 56, 14);
		add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(96, 82, 186, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 113, 186, 20);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				public static  void  Add() {

			        Statement stmt1 = null;
			        String dados = "insert into mercadoria "+" (nome_mercadoria,valor_mercadoria,qtn_mercadoria)"+" values ('S','2','3')";

			        try {

			            Connection cn = Conexao.fazendo_conexao();
			            stmt1 = cn.createStatement();
			            stmt1.executeUpdate(dados);
			        } catch (Exception e) {
			            // TODO: handle exception
			        }

			    };
			}
		);
		btnNewButton.setBounds(140, 144, 89, 23);
		add(btnNewButton);

	}
}
