package VIEW;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Historico1 extends JInternalFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historico1 frame = new Historico1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Historico1() {
		setMaximizable(true);
		setFocusTraversalKeysEnabled(false);
		setFocusCycleRoot(false);
		setIconifiable(true);
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 842, 486);
		getContentPane().setLayout(null);
		
		JTextPane txtpnHistrico = new JTextPane();
		txtpnHistrico.setEditable(false);
		txtpnHistrico.setText("HISTÓRICO DE COMPRAS - CLIENTES");
		txtpnHistrico.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnHistrico.setBounds(10, 11, 372, 40);
		getContentPane().add(txtpnHistrico);
		
		JTextPane txtpnConsulteAsCompras = new JTextPane();
		txtpnConsulteAsCompras.setEditable(false);
		txtpnConsulteAsCompras.setText("Consulte as compras realizadas pelos clientes. Insira o ID do cliente e clique em \"PESQUISAR\".\r\nAs informações serão apresentadas na tabela logo abaixo.");
		txtpnConsulteAsCompras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnConsulteAsCompras.setBounds(10, 54, 519, 40);
		getContentPane().add(txtpnConsulteAsCompras);
		
		JTextPane txtpnIdCliente = new JTextPane();
		txtpnIdCliente.setEditable(false);
		txtpnIdCliente.setText("ID CLIENTE");
		txtpnIdCliente.setBounds(10, 108, 81, 20);
		getContentPane().add(txtpnIdCliente);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(97, 108, 42, 20);
		getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("PESQUISAR");
		btnNewButton.setBounds(161, 105, 106, 23);
		getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 156, 762, 209);
		getContentPane().add(table);

	}

}
