package VIEW;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Estoque1 extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque1 frame = new Estoque1();
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
	public Estoque1() {
		setIconifiable(true);
		setMaximizable(true);
		setFocusable(false);
		setFocusTraversalKeysEnabled(false);
		setFocusCycleRoot(false);
		setClosable(true);
		setBounds(100, 100, 840, 495);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBounds(0, 0, 812, 464);
		getContentPane().add(contentPane);
		
		JTextPane txtpnGestoDeEstoque = new JTextPane();
		txtpnGestoDeEstoque.setEditable(false);
		txtpnGestoDeEstoque.setText("GESTÃO DE ESTOQUE");
		txtpnGestoDeEstoque.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnGestoDeEstoque.setBounds(10, 24, 251, 31);
		contentPane.add(txtpnGestoDeEstoque);
		
		JTextPane txtpnCadastrarProduto = new JTextPane();
		txtpnCadastrarProduto.setEditable(false);
		txtpnCadastrarProduto.setText("CADASTRAR PRODUTO");
		txtpnCadastrarProduto.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnCadastrarProduto.setBounds(10, 62, 185, 22);
		contentPane.add(txtpnCadastrarProduto);
		
		JTextPane txtpnCdigo = new JTextPane();
		txtpnCdigo.setEditable(false);
		txtpnCdigo.setText("Código");
		txtpnCdigo.setBounds(20, 95, 43, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnNome_1 = new JTextPane();
		txtpnNome_1.setEditable(false);
		txtpnNome_1.setText("Nome");
		txtpnNome_1.setBounds(20, 126, 43, 20);
		contentPane.add(txtpnNome_1);
		
		JTextPane txtpnNome_3 = new JTextPane();
		txtpnNome_3.setEditable(false);
		txtpnNome_3.setText("Data de Venc.");
		txtpnNome_3.setBounds(59, 186, 85, 20);
		contentPane.add(txtpnNome_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(84, 126, 271, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 95, 64, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(216, 261, 139, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LISTAR PRODUTOS");
		btnNewButton_1.setBounds(20, 261, 155, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(172, 184, 48, 22);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(229, 184, 52, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(291, 184, 64, 22);
		contentPane.add(comboBox_2);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(20, 295, 770, 106);
		contentPane.add(table);
		
		JTextPane txtpnNome_2_1 = new JTextPane();
		txtpnNome_2_1.setEditable(false);
		txtpnNome_2_1.setText("Registro/MS");
		txtpnNome_2_1.setBounds(172, 95, 85, 20);
		contentPane.add(txtpnNome_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(270, 95, 85, 20);
		contentPane.add(textField_2);
		
		JTextPane txtpnNome_3_1 = new JTextPane();
		txtpnNome_3_1.setEditable(false);
		txtpnNome_3_1.setText("Data de Fabr.");
		txtpnNome_3_1.setBounds(58, 156, 85, 20);
		contentPane.add(txtpnNome_3_1);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setEditable(true);
		comboBox_3_2.setBounds(171, 154, 48, 22);
		contentPane.add(comboBox_3_2);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setEditable(true);
		comboBox_1_2.setBounds(228, 154, 52, 22);
		contentPane.add(comboBox_1_2);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setEditable(true);
		comboBox_2_2.setBounds(290, 154, 64, 22);
		contentPane.add(comboBox_2_2);
		
		JTextPane txtpnQuantidade = new JTextPane();
		txtpnQuantidade.setEditable(false);
		txtpnQuantidade.setText("QUANTIDADE");
		txtpnQuantidade.setBounds(20, 219, 84, 20);
		contentPane.add(txtpnQuantidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(114, 217, 48, 22);
		contentPane.add(comboBox);
		
		JTextPane txtpnValorUnit = new JTextPane();
		txtpnValorUnit.setEditable(false);
		txtpnValorUnit.setText("VALOR UNIT.");
		txtpnValorUnit.setBounds(182, 217, 85, 20);
		contentPane.add(txtpnValorUnit);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(270, 217, 86, 20);
		contentPane.add(textField_3);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(382, 95, 408, 189);
		contentPane.add(table_1);
		
		JTextPane txtpnEstoque = new JTextPane();
		txtpnEstoque.setEditable(false);
		txtpnEstoque.setText("ESTOQUE");
		txtpnEstoque.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnEstoque.setBounds(382, 62, 185, 22);
		contentPane.add(txtpnEstoque);

	}
}
