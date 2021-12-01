package program;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Remover extends JFrame {
    private JTextField textField;

    /**
     * Create the panel.
     */
    public Remover() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\filip\\OneDrive\\Imagens\\1683bbee32d279ec96ae032ae463965d.png"));
    	setTitle("REMOVER!!");
    	getContentPane().setBackground(SystemColor.textHighlight);
        getContentPane().setLayout(null);

        setBounds(100, 100, 359, 203);
        
        JLabel lblNewLabel = new JLabel("ID");
        lblNewLabel.setBounds(22, 40, 46, 14);
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Voltar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setVisible(false);
            }
        });
        btnNewButton.setBounds(94, 103, 89, 23);
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Remover ");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Conexao.del(Integer.parseInt(lblNewLabel.getText()),false);
            	JOptionPane.showMessageDialog(null,"você deletou o id "+ lblNewLabel.getText());               
            }
        });
        btnNewButton_1.setBounds(22, 65, 89, 23);
        getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Remover Tudo");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Conexao.del(-1,true);
            	JOptionPane.showMessageDialog(null, "Você deletou todas as mercadorias");	
            }
        });
        btnNewButton_2.setBounds(178, 65, 103, 23);
        getContentPane().add(btnNewButton_2);


        textField = new JTextField();
        textField.setBounds(54, 37, 211, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        setVisible(true);
    }
} 