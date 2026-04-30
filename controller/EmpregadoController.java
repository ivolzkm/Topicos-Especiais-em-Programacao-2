package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.EmpregadoDAO;
import model.Empregado;
import view.EmpregadoView;

public class EmpregadoController implements ActionListener {
	private EmpregadoView empView;
	private EmpregadoDAO empDao;
	private Empregado empModel;

	public EmpregadoController(EmpregadoView empView, Empregado empModel) {
		this.empView = empView;
		this.empModel = empModel;
		empDao = new EmpregadoDAO();
		registraListener();
	}

	public void registraListener() {
		empView.getBtnCadastrar().addActionListener(this);
		// TODO: Realizar para os demais botões
	}

	public void cadastrar() {
		empModel.setCpf(empView.getTextFieldCPF().getText());
		empModel.setNome(empView.getTextFieldNome().getText());
		empModel.setEndereço(empView.getTextFieldEndereço().getText());
		empModel.setSalario(Double.valueOf(empView.getTextFieldSalario().getText()));
		empDao.salvar(empModel);
		JOptionPane.showMessageDialog(empView, "cadastro realizado");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("1. O clique do botão foi detectado!"); // Coloque isso

		if (e.getSource() == empView.getBtnCadastrar()) {
			System.out.println("2. Entrou no IF do botão Cadastrar!"); // Coloque isso
			cadastrar();
		}
	}

}
