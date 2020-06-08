package view;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Produto.Produto;

public class CreateView {
	public static void menuCreate(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		
		JPanel panelTexto = new JPanel();
		panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.PAGE_AXIS));
		panelTexto.add(new JLabel("Bem vindo ao menu Create."));
		panelTexto.add(new JLabel("Gostaria de cadastrar um produto?"));
		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new SpringLayout());
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoConfirmar = new JButton("Confirmar");
		panelBotoes.add(botaoConfirmar);
		panelBotoes.add(botaoVoltar);
		panelTexto.add(panelBotoes);
		adicionarAcoesConfirmarEVoltar(botaoConfirmar, botaoVoltar, panelAtual, panelPrincipal, frame);
		panelAtual.add(panelTexto);
		obterDados(panelBotoes);
// mainPanel.add(panelBotoes);

	}
	public static void obterDados(JPanel panel) {

		
		GridBagLayout gridBagLayout = new GridBagLayout();
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
