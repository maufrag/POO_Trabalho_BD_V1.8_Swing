package view;
import components.CreateMenuObterDados;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CreateView {
	public static void menuCreate(JPanel panelAtual, JPanel menuInicialPanel, JFrame frame) {
		CreateMenuObterDados teste = new CreateMenuObterDados();
		panelAtual.add(teste);
		/*JPanel panelBox = new JPanel();
		panelBox.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
		JPanel panelBotoes = new JPanel();
		GridBagConstraints c = new GridBagConstraints();
		
		//panelBotoes.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoConfirmar = new JButton("Confirmar");
		//panelBox.setLayout(new GridLayout(5, 2));
		panelBox.add(new JLabel("Bem vindo ao menu Create."));
		panelBox.add(new JLabel("Gostaria de cadastrar um produto?"));
		//panelBotoes.setLayout(new BorderLayout());
		
		panelBox.add(botaoConfirmar, BorderLayout.WEST);
		panelBox.add(botaoVoltar, BorderLayout.EAST);
		panelBox.add(panelBotoes);
		panelAtual.add(panelBox);
		
		/*
		panelBox.add(panelBotoes);
		adicionarAcoesConfirmarEVoltar(botaoConfirmar, botaoVoltar, panelAtual, menuInicialPanel, frame);
		obterDados(panelBotoes);
		*/
// mainPanel.add(panelBotoes);

	}

	public static void obterDados(JPanel panel) {

		GridLayout gridBagLayout = new GridLayout(1, 1);
		panel.setLayout(gridBagLayout);
		Label nomeProdutoLabel = new Label("Informe o nome do produto: ");
		JTextField nomeProdutoTextField = new JTextField(15);
		panel.add(nomeProdutoLabel);
		panel.add(nomeProdutoTextField);

		Label descricaoProdutoLabel = new Label("Informe a decrição do produto: ");
		JTextField descricaoProdutoTextField = new JTextField(15);
		panel.add(descricaoProdutoLabel);
		panel.add(descricaoProdutoTextField);

		Label valorCompraProdutoLabel = new Label("Informe o nome do produto: ");
		JTextField valorCompraProdutoTextField = new JTextField(15);
		panel.add(valorCompraProdutoLabel);
		panel.add(valorCompraProdutoTextField);

		JButton botaoConfirmar = new JButton("Confirmar");
		panel.add(botaoConfirmar);

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
