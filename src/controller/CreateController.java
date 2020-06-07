package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoBD.ConnectionFactory;
import Produto.Produto;

public class CreateController {
	public static void insertInto(Produto produto) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String insertQuery = String.format(
					"insert into produto(nomeProduto, descricao, dataCadastro, dataVencimento, valorCompra) values (?, ?, ?, ?, ?)");
			PreparedStatement statement = con.prepareStatement(insertQuery);
			statement.setString(1, produto.getNomeProduto());
			statement.setString(2, produto.getDescricao());
			statement.setDate(3, (java.sql.Date) produto.getDataCadastro());
			statement.setDate(4, (java.sql.Date) produto.getDataVencimento());
			statement.setDouble(5, produto.getValorCompra());
			statement.execute();
			con.close();
			System.out.println("\nValores inseridos com sucesso.\n\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
