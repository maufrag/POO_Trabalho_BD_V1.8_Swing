package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MetodosDeApoioView {

	public static void sair() {
		System.exit(0);
	}

	public static void voltar(JButton button, JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				voltarParaMenuAnterior(panelAtual, panelPrincipal, frame);
			}
		});
	}

	public static void voltarParaMenuAnterior(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		frame.remove(panelAtual);
		panelAtual.setVisible(false);
		frame.add(panelPrincipal);
		panelPrincipal.setVisible(true);
	}

	public static void ajustarTabela(JTable table) {
		Dimension dimension = table.getPreferredSize();
		table.setPreferredScrollableViewportSize(new Dimension(dimension.width, table.getRowHeight() * 7 + 1));
	}

}
