package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ConexaoBD.ConnectionFactory;
import Produto.Produto;

public class ReadController {
	public static List<Produto> gerarListaDeProduto(int limiteSolicitado) {
		String selectQuery = montarQuerySelect(limiteSolicitado);

		List<Produto> listaDeProduto = new ArrayList<Produto>();
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement statement = con.prepareStatement(selectQuery);

			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt("id_Produto"));
				produto.setNomeProduto(rs.getString("nomeProduto"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setDataCadastro(rs.getDate("dataCadastro"));
				produto.setDataVencimento(rs.getDate("dataVencimento"));
				produto.setValorCompra(rs.getDouble("valorCompra"));
				listaDeProduto.add(produto);
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDeProduto;
	}

	public static void gerarListaDeProduto(int limiteSolicitado, JTable table) {
		String selectQuery = montarQuerySelect(limiteSolicitado);

		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement statement = con.prepareStatement(selectQuery);
			ResultSet rs = statement.executeQuery();
			table.setModel(resultSetToTableModel(rs));

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static String montarQuerySelect(int limite) {

		String queryInicial = "Select * from produto";
		String complementoLimit = String.format(" LIMIT %d", limite);
		queryInicial = limite >= 0 ? queryInicial + complementoLimit : queryInicial;

		return queryInicial;
	}

	private static TableModel resultSetToTableModel(ResultSet rs) {
		try {
			ResultSetMetaData metaData = rs.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			Vector<String> columnNames = new Vector<String>();

			// Get the column names
			for (int column = 0; column < numberOfColumns; column++) {
				columnNames.addElement(metaData.getColumnLabel(column + 1));
			}

			// Get all rows.
			Vector<Vector<Object>> rows = new Vector<Vector<Object>>();

			while (rs.next()) {
				Vector<Object> newRow = new Vector<Object>();

				for (int i = 1; i <= numberOfColumns; i++) {
					newRow.addElement(rs.getObject(i));
				}

				rows.addElement(newRow);
			}

			return new DefaultTableModel(rows, columnNames);
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
}
