package VIEW;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Compras1 extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras1 frame = new Compras1();
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
	public Compras1() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("REGISTRO DE COMPRAS");
		setBounds(100, 100, 814, 504);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBounds(0, 0, 793, 468);
		getContentPane().add(contentPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 109, 770, 112);
		contentPane.add(table);
		
		JTextPane txtpnTabelaDeProdutos = new JTextPane();
		txtpnTabelaDeProdutos.setEditable(false);
		txtpnTabelaDeProdutos.setText("TABELA DE PRODUTOS");
		txtpnTabelaDeProdutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnTabelaDeProdutos.setBounds(20, 78, 202, 20);
		contentPane.add(txtpnTabelaDeProdutos);
		
		JTextPane txtpnRegistrarCompra = new JTextPane();
		txtpnRegistrarCompra.setEditable(false);
		txtpnRegistrarCompra.setText("REGISTRAR COMPRA");
		txtpnRegistrarCompra.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnRegistrarCompra.setBounds(10, 11, 166, 20);
		contentPane.add(txtpnRegistrarCompra);
		
		JTextPane txtpnSelecioneOItem = new JTextPane();
		txtpnSelecioneOItem.setEditable(false);
		txtpnSelecioneOItem.setText("Insira o ID do cliente ");
		txtpnSelecioneOItem.setBounds(10, 47, 125, 20);
		contentPane.add(txtpnSelecioneOItem);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(139, 48, 48, 20);
		contentPane.add(textField);
		
		JTextPane txtpnQuantidade = new JTextPane();
		txtpnQuantidade.setEditable(false);
		txtpnQuantidade.setText("QUANTIDADE");
		txtpnQuantidade.setBounds(500, 241, 84, 20);
		contentPane.add(txtpnQuantidade);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("SIM");
		chckbxNewCheckBox.setBounds(721, 228, 59, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("NÃO");
		chckbxNewCheckBox_1.setBounds(721, 253, 59, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextPane txtpnGenrico = new JTextPane();
		txtpnGenrico.setEditable(false);
		txtpnGenrico.setText("GENÉRICO");
		txtpnGenrico.setBounds(644, 241, 82, 20);
		contentPane.add(txtpnGenrico);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(588, 239, 43, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("FINALIZAR COMPRA");
		btnNewButton.setBounds(614, 345, 166, 32);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(655, 308, 125, 32);
		contentPane.add(textField_1);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setEditable(false);
		txtpnTotal.setText("TOTAL");
		txtpnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnTotal.setBounds(596, 318, 59, 20);
		contentPane.add(txtpnTotal);
		
		JTextPane txtpnResumoDaCompra = new JTextPane();
		txtpnResumoDaCompra.setEditable(false);
		txtpnResumoDaCompra.setText("DESCRIÇÃO DO PRODUTO");
		txtpnResumoDaCompra.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnResumoDaCompra.setBounds(10, 272, 202, 20);
		contentPane.add(txtpnResumoDaCompra);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 296, 480, 81);
		contentPane.add(textField_2);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(684, 283, 96, 20);
		contentPane.add(btnCalcular);
		
		JTextPane txtpnDataDaCompra = new JTextPane();
		txtpnDataDaCompra.setEditable(false);
		txtpnDataDaCompra.setText("DATA DA COMPRA");
		txtpnDataDaCompra.setBounds(185, 241, 113, 20);
		contentPane.add(txtpnDataDaCompra);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"07", "8-"}));
		comboBox_1.setBounds(355, 239, 52, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"09", "-90"}));
		comboBox_2.setBounds(417, 239, 64, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"02", "04"}));
		comboBox_3.setBounds(298, 239, 48, 22);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton_2 = new JButton("PESQUISAR");
		btnNewButton_2.setBounds(194, 47, 125, 23);
		contentPane.add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 47, 48, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(337, 50, 443, 20);
		contentPane.add(textField_4);

	}

}
