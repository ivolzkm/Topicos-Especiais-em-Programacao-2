package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Empregado;

public class EmpregadoDAO {
	public void salvar(Empregado empModel) {
		String sql = "INSERT INTO empregado(cpf, nome, endereco, salario)VALUES(?, ?, ?, ?)";	
		Conexao con = new Conexao();
		
		try(Connection conexao = Conexao.criarConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql)){
			stmt.setString(1, empModel.getCpf());
			stmt.setString(2, empModel.getNome());
			stmt.setString(3, empModel.getEndereço());
			stmt.setDouble(4, empModel.getSalario());
			stmt.execute();
			System.out.println("Sucesso");
		} catch (SQLException e) {
			System.out.println("erro");
			e.printStackTrace();
		}
	
		
	
	}
	
	
	
	
	

}
