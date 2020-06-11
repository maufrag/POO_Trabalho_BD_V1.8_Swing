package view;

import components.CreateMenuObterDados;
import components.CreateMenuTelaInicial;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateView {

	public static void menuCreate(JPanel panelAtual, JPanel menuInicialPanel, JFrame frame) {
		CreateMenuTelaInicial createMenuTelaInicial = new CreateMenuTelaInicial(panelAtual, menuInicialPanel, frame);
		panelAtual.add(createMenuTelaInicial);
	}

	public static void obterDados(JPanel panelAnterior, JFrame frame) {
		JPanel novoPanel = new JPanel();
		MainView.atualizarPanel(novoPanel, panelAnterior, frame);
		CreateMenuObterDados createMenuObterDados = new CreateMenuObterDados(novoPanel, panelAnterior, frame);
		novoPanel.add(createMenuObterDados);
	}

}