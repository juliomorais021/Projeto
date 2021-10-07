package program;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class index {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(110, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(166, 61, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(110, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
		@Override
			public void actionPerformed(ActionEvent e) {
			//usando  um  if  para fazer
			if(Conexao.contem_usuario(textField.getText(), passwordField.getText())) 
			{
				
				JOptionPane.showMessageDialog(null, "Logado com susesso!");	
				frame.setVisible(false);
				ESTOQUE abri = new ESTOQUE();
				abri.frmEstoque.setVisible(true);
				
				 
	
			}else 
			{
				JOptionPane.showMessageDialog(null, "O usuario não existe!"); 
				
			}
				
			}
		});
		btnNewButton.setBounds(199, 178, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
				
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 110, 150, 20);
		frame.getContentPane().add(passwordField);
	}
	
	
}