package view;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateView {
	public static void menuCreate(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {// criar outros panel para
		// estarem deste
// panel
		JPanel panelTexto = new JPanel();
		panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.PAGE_AXIS));
		panelTexto.add(new JLabel("Bem vindo ao menu Create."));
		panelTexto.add(new JLabel("Gostaria de cadastrar um produto?"));
		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoConfirmar = new JButton("Confirmar");
		panelBotoes.add(botaoConfirmar);
		panelBotoes.add(botaoVoltar);
		panelTexto.add(panelBotoes);
		adicionarAcoesConfirmarEVoltar(botaoConfirmar, botaoVoltar, panelAtual, panelPrincipal, frame);
		panelAtual.add(panelTexto);
// mainPanel.add(panelBotoes);

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
