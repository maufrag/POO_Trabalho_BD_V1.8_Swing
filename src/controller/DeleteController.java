package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoBD.ConnectionFactory;
import MetodosGerais.MetodosDeApoio;

public class DeleteController {
	public static void delete(int idProduto) {
		String query = "delete from produto where id_produto = ?";
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, idProduto);
			statement.execute();
			con.close();
			System.out.println("Dados excluidos com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
