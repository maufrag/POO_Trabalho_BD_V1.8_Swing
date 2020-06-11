package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.ReadMenuListaProduto;
import components.ReadMenuTelaInicial;

public class ReadView {
	public static void readMenu(JPanel novoPanel, JPanel panelAntigo, JFrame frame) {
		ReadMenuTelaInicial readMenuTelaInicial = new ReadMenuTelaInicial(novoPanel, panelAntigo, frame);
		novoPanel.add(readMenuTelaInicial);
	}
	public static void listar(JPanel panelAntigo , JFrame frame, int qtdSelecionada) {
		JPanel novoPanel = new JPanel();
		MainView.atualizarPanel(novoPanel, panelAntigo, frame);
		ReadMenuListaProduto readMenuListaProduto = new ReadMenuListaProduto(novoPanel, panelAntigo, frame, qtdSelecionada);
		novoPanel.add(readMenuListaProduto);
	}
}
