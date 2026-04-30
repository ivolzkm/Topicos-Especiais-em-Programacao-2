package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EmpregadoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCPF;
	private JTextField textFieldNome;
	private JTextField textFieldEndereço;
	private JTextField textFieldSalario;
	private JButton btnCadastrar;
	private JButton btnConsultar;
	private JButton btnAtualizar;
	private JButton btnRemover;
	
	
	

	public JTextField getTextFieldCPF() {
		return textFieldCPF;
	}

	public void setTextFieldCPF(JTextField textFieldCPF) {
		this.textFieldCPF = textFieldCPF;
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldEndereço() {
		return textFieldEndereço;
	}

	public void setTextFieldEndereço(JTextField textFieldEndereço) {
		this.textFieldEndereço = textFieldEndereço;
	}

	public JTextField getTextFieldSalario() {
		return textFieldSalario;
	}

	public void setTextFieldSalario(JTextField textFieldSalario) {
		this.textFieldSalario = textFieldSalario;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}

	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}

	

	/**
	 * Create the frame.
	 */
	public EmpregadoView() {
		setTitle("Empregado CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][][][][][]"));
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCPF, "cell 0 1,alignx center");
		
		textFieldCPF = new JTextField();
		contentPane.add(textFieldCPF, "cell 1 1,growx");
		textFieldCPF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 2,alignx center");
		
		textFieldEndereço = new JTextField();
		textFieldEndereço.setColumns(10);
		contentPane.add(textFieldEndereço, "cell 1 2,growx");
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_2, "cell 0 3,alignx center");
		
		textFieldNome = new JTextField();
		contentPane.add(textFieldNome, "cell 1 3,growx");
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Salário");
		contentPane.add(lblNewLabel, "cell 0 4,alignx center");
		
		textFieldSalario = new JTextField();
		contentPane.add(textFieldSalario, "cell 1 4,growx");
		textFieldSalario.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		contentPane.add(btnCadastrar, "flowx,cell 1 9");
		
		btnConsultar = new JButton("Consultar");
		contentPane.add(btnConsultar, "cell 1 9");
		
		btnAtualizar = new JButton("Atualizar");
		contentPane.add(btnAtualizar, "cell 1 9");
		
		btnRemover = new JButton("Remover");
		contentPane.add(btnRemover, "cell 1 9");

	}

}
