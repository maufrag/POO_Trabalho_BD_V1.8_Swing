package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import ConexaoBD.ConnectionFactory;
import MetodosGerais.MetodosDeApoio;
import Produto.Produto;

public class CreateController {

	public static void obterDadosProduto(String nomeProduto, String descricao, String valorProduto) {
		Produto produto = new Produto(new Date());
		produto.setNomeProduto(nomeProduto);
		produto.setDescricao(descricao);
		produto.setValorCompra(converterDecimal(valorProduto));
		insertInto(produto);
	}

	public static Double converterDecimal(String valor) {
		Double valorDouble = (double) 0;

		if (MetodosDeApoio.isNullOrWhiteSpace(valor))
			return 0.00;

		try {
			valorDouble = Double.parseDouble(valor);
		} catch (Exception e) {
			return 0.00;
		}

		return valorDouble;
	}

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
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Houve algum erro ao cadastrar o produto.");

		}
	}
}
