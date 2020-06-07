package main;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import CRUD.*;
import javax.swing.*;

public class ClasseMain {

	public static void main(String[] args) {
		System.out.println("Programa iniciado\n");
		JFrame frame = new JFrame();
		JPanel panelPrincipal = new JPanel();// é preciso usar um painel para agrupar esses componente
		configurarPanel(panelPrincipal);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.PAGE_AXIS));
		// panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		popularTelaComBotoes(obterItensMenu(), panelPrincipal, frame);
		frame.add(panelPrincipal);// coloca o conteudo do painel no frame
		configurarJFrame(frame);

	}

	public static void configurarJFrame(JFrame frame) {
		frame.setTitle("Produtos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(400, 350);// define o tamanho da janela
		frame.setVisible(true);// coloca a janela visivel
	}

	public static void configurarPanel(JPanel panel) {
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		JLabel label = new JLabel("Por favor, clique na opção que deseja executar:");
		label.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));
		panel.add(label);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

	public static void configurarBotao(int largura, int altura, JButton botao) {
		//botao.setAlignmentX(Component.CENTER_ALIGNMENT);
		botao.setMinimumSize(new Dimension(largura, altura));
		botao.setPreferredSize(new Dimension(largura, altura));
		botao.setMaximumSize(new Dimension(largura, altura));
		botao.setOpaque(false);
		//botao.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	}

	public static void popularTelaComBotoes(List<String> listaMenu, JPanel panel, JFrame frame) {
		for (String menu : listaMenu) {
			JButton botao = new JButton(menu);
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					irParaOpcaoSelecionada(menu, panel, frame);
				}
			});
			configurarBotao(100, 30, botao);
			panel.add(botao);
		}
	}

	public static List<String> obterItensMenu() {
		return Arrays.asList("Create", "Read", "Update", "Delete", "Sair");
	}

	public static void irParaOpcaoSelecionada(String nomeMenu, JPanel panel, JFrame frame) {
		JPanel novoPanel = new JPanel();
		switch (nomeMenu) {
		case "Create":
			panel.setVisible(false);
			frame.remove(panel);
			frame.add(novoPanel);
			Create.menuCreate(novoPanel);
			break;
		case "Read":
			Read.readMenu();
			break;
		case "Update":
			;
			Update.updateMenu();
			break;
		case "Delete":
			Delete.deleteMenu();
			break;
		case "Sair":
			// TODO
			break;
		}
	}
}
