package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.UpdateMenuAtualizarInformacao;
import components.UpdateMenuTelaInicial;

public class UpdateView {
	public static void updateMenu(JPanel panelAtual, JPanel panelAntigo, JFrame frame) {
		UpdateMenuTelaInicial updateMenuTelaInicial = new UpdateMenuTelaInicial(panelAtual, panelAntigo, frame);
		panelAtual.add(updateMenuTelaInicial);
	}
	
	public static void updateListaProduto(JPanel panelSuperior, JFrame frame) {
		JPanel novoPanel = new JPanel();
		MainView.atualizarPanel(novoPanel, panelSuperior, frame);
		UpdateMenuAtualizarInformacao updateMenuAtualizarInformacao = new UpdateMenuAtualizarInformacao(novoPanel, panelSuperior, frame);
		novoPanel.add(updateMenuAtualizarInformacao);
	}
}
