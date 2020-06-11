package components;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Produto.Produto;
import controller.ReadController;
import controller.TesteEnum;
import view.MetodosDeApoioView;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class ReadMenuListaProduto extends JPanel {
	private JTable table;

	public ReadMenuListaProduto(JPanel panelAtual, JPanel panelSuperior, JFrame frame, int qtdSelecionada) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 30, 0, 30, 30 };
		gridBagLayout.rowHeights = new int[] { 30, 30, 30, 30, 0, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		table = new JTable();
		ReadController.gerarListaDeProduto(qtdSelecionada, table);
		MetodosDeApoioView.ajustarTabela(table);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Voltar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		add(btnNewButton, gbc_btnNewButton);
		MetodosDeApoioView.voltar(btnNewButton, panelAtual, panelSuperior, frame);
	}
	
	public static ArrayList<Produto> obterListaDeProduto(int qtdSelecionada) {
		List<Produto> listaProduto = ReadController.gerarListaDeProduto(qtdSelecionada);
		ArrayList<Produto> arrayProdutos = new ArrayList<>(listaProduto.size());
		arrayProdutos.addAll(listaProduto);
		return arrayProdutos;
	}

}
