package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.DeleteMenuListagem;
import components.DeleteMenuTelaInicial;

public class DeleteView {
	public static void deleteMenu(JPanel panelAtual, JPanel panelAnterior, JFrame frame) {
		DeleteMenuTelaInicial deleteMenuTelaInicial = new DeleteMenuTelaInicial(panelAtual, panelAnterior, frame);
		panelAtual.add(deleteMenuTelaInicial);
	}

	public static void listagemItem(JPanel panelAnterior, JFrame frame) {
		JPanel novoPanel = new JPanel();
		MainView.atualizarPanel(novoPanel, panelAnterior, frame);
		DeleteMenuListagem deleteMenuListagem = new DeleteMenuListagem(novoPanel, panelAnterior, frame);
		novoPanel.add(deleteMenuListagem);
	}
}
