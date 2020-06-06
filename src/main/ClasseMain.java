package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import CRUD.*;
import MetodosGerais.MetodosDeApoio;
import javax.swing.*;

public class ClasseMain {

	public static void main(String[] args) {
		System.out.println("Programa iniciado\n");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();//é preciso usar um painel para agrupar esses componente
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		List<String> listaMenu = obterItensMenu();
		for(String menu : listaMenu) {
			Button botao = new Button(menu);
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					irParaOpcaoSelecionada(menu);
					}
			});
			//botao.setBounds(10, 10, 10, 10);
			//botao.setPreferredSize(new Dimension(400, 400));
			panel.add(botao);
		}
		
		frame.add(panel);//coloca o conteudo do painel no frame
		//frame.setSize(500, 500);//define o tamanho da janela
		frame.pack();
		frame.setVisible(true);//coloca a janela visivel
		montarMenu(obterItensMenu());
		System.out.println("\nPrograma encerrado");
	}

	public static void montarMenu(List<String> listaMenu) {
		int valor = -1;
		do {
			MetodosDeApoio.listarMenu(listaMenu);
			valor = MetodosDeApoio.obterInputTratado(1, listaMenu.size());
			//irParaOpcaoSelecionada(valor);

		} while (valor != listaMenu.size());

	}

	public static List<String> obterItensMenu() {
		return Arrays.asList("Create", "Read", "Update", "Delete", "Sair");
	}

	public static void irParaOpcaoSelecionada(String nomeMenu) {
		switch (nomeMenu) {
		case "Create":
			Create.menuCreate();
			break;
		case "Read":
			Read.readMenu();
			break;
		case "Update":;
			Update.updateMenu();
			break;
		case "Delete":
			Delete.deleteMenu();
			break;
		case "Sair":
			//TODO
			break;
		}
	}
}
