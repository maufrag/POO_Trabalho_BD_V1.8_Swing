package view;

import components.CreateMenuObterDados;
import components.CreateMenuTelaInicial;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateView {
	public static void menuCreate(JPanel panelAtual, JPanel menuInicialPanel, JFrame frame) {
		CreateMenuTelaInicial createMenuTelaInicial = new CreateMenuTelaInicial(panelAtual, menuInicialPanel, frame);
		panelAtual.add(createMenuTelaInicial);
	}

	public static void obterDados(JPanel panelAnterior, JPanel panelPrincipal, JFrame frame) {
		JPanel novoPanel = new JPanel();
		MainView.atualizarPanel(novoPanel, panelAnterior, frame);
		CreateMenuObterDados createMenuObterDados = new CreateMenuObterDados(novoPanel, panelAnterior, frame);
		novoPanel.add(createMenuObterDados);
	}


	public static void adicionarAcoesConfirmarEVoltar(JButton botaoConfirmar, JButton botaoVoltar, JPanel panelAtual,
			JPanel panelPrincipal, JFrame frame) {
		MetodosDeApoioView.confirmar(botaoConfirmar);
		MetodosDeApoioView.voltar(botaoVoltar, panelAtual, panelPrincipal, frame);
	}

	public static void voltarParaMenuPrincipal(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		frame.remove(panelAtual);
		panelAtual.setVisible(false);
		frame.add(panelPrincipal);
		panelPrincipal.setVisible(true);
	}
}