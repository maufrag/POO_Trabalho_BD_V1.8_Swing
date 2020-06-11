package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ConexaoBD.ConnectionFactory;
import Produto.Produto;

public class UpdateController {

	public static String obterValorCompraTratado(String valorCompra) {
		if (valorCompra.contains(",")) {
			String[] textoDividido = valorCompra.split(",");
			valorCompra = textoDividido[0] + "." + textoDividido[1];
		}
		return valorCompra;
	}

	public static Produto toProduto(int idProduto, String nomeProduto, String descricao, String valorCompra) {
		Produto produto = new Produto();
		produto.setIdProduto(idProduto);
		produto.setNomeProduto(nomeProduto);
		produto.setDescricao(descricao);
		valorCompra = obterValorCompraTratado(valorCompra);
		try {
			Double valorCompraDecimal = Double.parseDouble(valorCompra);
			produto.setValorCompra(valorCompraDecimal);
		} catch (Exception e) {
			produto.setValorCompra(0.00);
		}
		return produto;
	}

	public static void update(Produto produto) {
		try {
			Connection con = ConnectionFactory.getConnection();

			String query = String
					.format("Update produto set nomeProduto = ?,descricao = ?, valorCompra = ?  where id_produto = ?");

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, produto.getNomeProduto());
			statement.setString(2, produto.getDescricao());
			statement.setDouble(3, produto.getValorCompra());
			statement.setInt(4, produto.getIdProduto());

			statement.executeUpdate();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(int idProduto, String nomeCampo, Double novoValor) {
		try {
			Connection con = ConnectionFactory.getConnection();

			String query = String.format("Update produto set %s = ? where id_produto = ?", nomeCampo);

			PreparedStatement statement = con.prepareStatement(query);
			statement.setDouble(1, novoValor);
			statement.setInt(2, idProduto);

			statement.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
