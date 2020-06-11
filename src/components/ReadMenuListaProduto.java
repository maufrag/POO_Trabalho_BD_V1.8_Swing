package components;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Produto.Produto;
import controller.DeleteController;
import controller.ReadController;
import controller.TesteEnum;
import view.MetodosDeApoioView;

import java.awt.GridBagLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.GridLayout;

public class ReadMenuListaProduto extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ReadMenuListaProduto(JPanel panelAtual, JPanel panelSuperior, JFrame frame) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 30, 0, 30, 30 };
		gridBagLayout.rowHeights = new int[] { 30, 30, 30, 30, 0, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		table = new JTable();
		ReadController.gerarListaDeProduto(TesteEnum.TodosOsValores.getValue(), table);
		MetodosDeApoioView.ajustarTabela(table);
		scrollPane.setViewportView(table);

	}
	


	public static ArrayList<Produto> obterListaDeProduto() {
		List<Produto> listaProduto = ReadController.gerarListaDeProduto(TesteEnum.TodosOsValores.getValue());
		ArrayList<Produto> arrayProdutos = new ArrayList<>(listaProduto.size());
		arrayProdutos.addAll(listaProduto);
		return arrayProdutos;
	}

}
