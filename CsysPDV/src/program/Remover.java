package program;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Remover extends JPanel {

	/**
	 * Create the panel.
	 */
	public Remover() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(115, 74, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(26, 40, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remover Tudo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(191, 40, 103, 23);
		add(btnNewButton_2);

	}

}
