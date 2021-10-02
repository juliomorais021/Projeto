package program;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ESTOQUE {

	JFrame frmEstoque;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESTOQUE window = new ESTOQUE();
					window.frmEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ESTOQUE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstoque = new JFrame();
		frmEstoque.setTitle("Estoque");
		frmEstoque.setAutoRequestFocus(false);
		frmEstoque.setBounds(100, 100, 600, 450);
		frmEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstoque.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(10, 47, 83, 31);
		frmEstoque.getContentPane().add(btnNewButton);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(10, 89, 83, 31);
		frmEstoque.getContentPane().add(btnRemover);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(10, 131, 83, 31);
		frmEstoque.getContentPane().add(btnEditar);
		
		table = new JTable();
		table.setBounds(103, 47, 424, 312);
		frmEstoque.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(115, 24, 46, 14);
		frmEstoque.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(187, 24, 46, 14);
		frmEstoque.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o");
		lblNewLabel_2.setBounds(302, 24, 46, 14);
		frmEstoque.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setBounds(402, 22, 83, 14);
		frmEstoque.getContentPane().add(lblNewLabel_3);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
