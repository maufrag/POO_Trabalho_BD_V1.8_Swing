package components;

import javax.swing.JPanel;

import view.CreateView;
import view.MetodosDeApoioView;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class CreateMenuTelaInicial extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4379564746578828590L;

	/**
	 * Create the panel.
	 */
	public CreateMenuTelaInicial(JPanel panelAtual, JPanel panelPrincipal, JFrame frame) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 40, 0, -11, 0, 0, 0, 0, 13, 63, -16 };
		gridBagLayout.rowHeights = new int[] { 14, 0, 50, 20, 20, 20, 94, 0, 0, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Bem vindo ao create menu.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 6;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gostaria de cadastrar um produto?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		JButton btnNewButton = new JButton("Prosseguir");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 8;
		add(btnNewButton, gbc_btnNewButton);
		procederCadastro(btnNewButton, panelAtual, frame);
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 8;
		gbc_btnNewButton_1.gridy = 8;
		add(btnNewButton_1, gbc_btnNewButton_1);
		MetodosDeApoioView.voltar(btnNewButton_1, panelAtual, panelPrincipal, frame);
	
	}

	private void procederCadastro(JButton button, JPanel novoPanel, JFrame frame) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CreateView.obterDados(novoPanel, frame);
			}
		});
	}
		

}
