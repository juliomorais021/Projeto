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
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class index {

	private JFrame frmCsyspdv;
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
					window.frmCsyspdv.setVisible(true);
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
		frmCsyspdv = new JFrame();
		frmCsyspdv.getContentPane().setBackground(SystemColor.textHighlight);
		frmCsyspdv.getContentPane().setForeground(Color.CYAN);
		frmCsyspdv.setForeground(Color.CYAN);
		frmCsyspdv.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\filip\\OneDrive\\Imagens\\1683bbee32d279ec96ae032ae463965d.png"));
		frmCsyspdv.setTitle("CsysPDV");
		frmCsyspdv.setBounds(100, 100, 450, 300);
		frmCsyspdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCsyspdv.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(110, 64, 46, 14);
		frmCsyspdv.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(166, 61, 150, 20);
		frmCsyspdv.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(110, 113, 46, 14);
		frmCsyspdv.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("(\u261E\uFF9F\u30EE\uFF9F)\u261E Login");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\filip\\OneDrive\\Imagens\\152532.png"));
		btnNewButton.addActionListener(new ActionListener() {
		@Override
			public void actionPerformed(ActionEvent e) {
			//usando  um  if  para fazer
			if(Conexao.contem_usuario(textField.getText(), passwordField.getText())) 
			{
				
				JOptionPane.showMessageDialog(null, "Logado com susesso!");	
				frmCsyspdv.setVisible(false);
				ESTOQUE abri = new ESTOQUE();
				abri.frmEstoque.setVisible(true);
				
				 
	
			}else 
			{
				JOptionPane.showMessageDialog(null, "O usuario não existe!"); 
				
			}
				
			}
		});
		btnNewButton.setBounds(179, 152, 133, 42);
		frmCsyspdv.getContentPane().add(btnNewButton);
		
	
				
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 110, 150, 20);
		frmCsyspdv.getContentPane().add(passwordField);
	}
	
	
}