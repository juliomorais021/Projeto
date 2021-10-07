package program;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Remover extends JFrame {
    private JTextField textField;

    /**
     * Create the panel.
     */
    public Remover() {
        setLayout(null);

        setBounds(100, 100, 600, 450);
        
        JLabel lblNewLabel = new JLabel("ID");
        lblNewLabel.setBounds(22, 40, 46, 14);
        add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Voltar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setVisible(false);
            }
        });
        btnNewButton.setBounds(108, 126, 89, 23);
        add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Remover ");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Conexao.del(Integer.parseInt(lblNewLabel.getText()),false);
            	JOptionPane.showMessageDialog(null,"você deletou o id "+ lblNewLabel.getText());               
            }
        });
        btnNewButton_1.setBounds(10, 100, 89, 23);
        add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Remover Tudo");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Conexao.del(-1,true);
            	JOptionPane.showMessageDialog(null, "Você deletou todas as mercadorias");	
            }
        });
        btnNewButton_2.setBounds(195, 100, 103, 23);
        add(btnNewButton_2);


        textField = new JTextField();
        textField.setBounds(94, 37, 86, 20);
        add(textField);
        textField.setColumns(10);
        setVisible(true);
    }
} 