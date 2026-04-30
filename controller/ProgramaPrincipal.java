package controller;

import java.awt.EventQueue;
import model.Empregado;
import view.EmpregadoView;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpregadoView frame = new EmpregadoView();
					Empregado model = new Empregado();
					
					// Deixamos apenas 2 parâmetros aqui para bater com o Controller!
					EmpregadoController controller = new EmpregadoController(frame, model);
					
					// Não precisamos chamar o registraListener() aqui, pois você já colocou ele dentro do Controller.
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}