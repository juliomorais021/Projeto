package program;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ESTOQUE {

    JFrame frmEstoque;
    private JTable table;

    
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

    
    public ESTOQUE() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmEstoque = new JFrame();
        frmEstoque.getContentPane().setBackground(SystemColor.textHighlight);
        frmEstoque.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\filip\\OneDrive\\Imagens\\1683bbee32d279ec96ae032ae463965d.png"));
        frmEstoque.setTitle("Estoque");
        frmEstoque.setAutoRequestFocus(false);
        frmEstoque.setBounds(100, 100, 600, 450);
        frmEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmEstoque.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Adicionar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 new Adi();
              

            }
        });
        btnNewButton.setBounds(10, 47, 83, 31);
        frmEstoque.getContentPane().add(btnNewButton);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Remover();

            }
        });
        btnRemover.setBounds(10, 89, 83, 31);
        frmEstoque.getContentPane().add(btnRemover);

        JLabel lblNewLabel = new JLabel("ID");
        lblNewLabel.setBounds(156, 24, 46, 14);
        frmEstoque.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nome");
        lblNewLabel_1.setBounds(234, 24, 46, 14);
        frmEstoque.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o");
        lblNewLabel_2.setBounds(333, 24, 46, 14);
        frmEstoque.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Quantidade");
        lblNewLabel_3.setBounds(450, 24, 83, 14);
        frmEstoque.getContentPane().add(lblNewLabel_3);
        
        table = new JTable();
        table.setBounds(147, 55, 386, 244);
        frmEstoque.getContentPane().add(table);
        
        JLabel lblNewLabel_4 = new JLabel("Deus \u00E9 Fiel!!!   Volte Sempre");
        lblNewLabel_4.setBounds(279, 351, 295, 49);
        frmEstoque.getContentPane().add(lblNewLabel_4);
        
        JButton btnRegist = new JButton("Registrar Pessoa");
        btnRegist.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		new registro();
        		
        		
        	}
        });
        btnRegist.setBounds(11, 158, 126, 49);
        frmEstoque.getContentPane().add(btnRegist);
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub

    }
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}