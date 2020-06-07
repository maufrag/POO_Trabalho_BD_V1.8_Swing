package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetodosDeApoioView {
	public static void sair() {
		System.exit(0);
	}

	public static void confirmar(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
	}

	public static void voltar(JButton button, JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				voltarParaMenuPrincipal(panelAtual, panelPrincipal, frame);
			}
		});
	}

	public static void voltarParaMenuPrincipal(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		frame.remove(panelAtual);
		panelAtual.setVisible(false);
		frame.add(panelPrincipal);
		panelPrincipal.setVisible(true);
	}

	public static void adicionarAcoesConfirmarEVoltar(JButton botaoConfirmar, JButton botaoVoltar, JPanel panelAtual,
			JPanel panelPrincipal, JFrame frame) {
		confirmar(botaoConfirmar);
		voltar(botaoVoltar, panelAtual, panelPrincipal, frame);
	}
}
