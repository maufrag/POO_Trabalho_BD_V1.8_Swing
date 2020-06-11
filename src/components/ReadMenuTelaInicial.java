package components;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JRadioButton;
import view.MetodosDeApoioView;
import view.ReadView;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.SwingConstants;

import controller.TesteEnum;

import javax.swing.JFormattedTextField;

public class ReadMenuTelaInicial extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public ReadMenuTelaInicial(JPanel panelAtual, JPanel panelAntigo, JFrame frame) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 452, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 36, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_2.gridx = 0;
		gbc_rigidArea_2.gridy = 0;
		add(rigidArea_2, gbc_rigidArea_2);

		JLabel lblNewLabel = new JLabel("Como voc\u00EA deseja selecionar registros do banco?");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_rigidArea_1.gridx = 0;
		gbc_rigidArea_1.gridy = 2;
		add(rigidArea_1, gbc_rigidArea_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Selecionar tudo");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 3;
		add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Selecionar uma quantidade especifica");
		buttonGroup.add(rdbtnNewRadioButton_1);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 4;
		add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);

		JPanel paneEscondido = new JPanel();
		GridBagConstraints gbc_paneEscondido = new GridBagConstraints();
		gbc_paneEscondido.insets = new Insets(0, 0, 5, 0);
		gbc_paneEscondido.anchor = GridBagConstraints.NORTH;
		gbc_paneEscondido.fill = GridBagConstraints.HORIZONTAL;
		gbc_paneEscondido.gridx = 0;
		gbc_paneEscondido.gridy = 5;
		add(paneEscondido, gbc_paneEscondido);
		GridBagLayout gbl_paneEscondido = new GridBagLayout();
		gbl_paneEscondido.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_paneEscondido.rowHeights = new int[] { 0, 0 };
		gbl_paneEscondido.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneEscondido.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		paneEscondido.setLayout(gbl_paneEscondido);

		JLabel lblNewLabel_1 = new JLabel("Informe a quantidade:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		paneEscondido.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 0, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 2;
		gbc_formattedTextField.gridy = 0;
		paneEscondido.add(formattedTextField, gbc_formattedTextField);
		paneEscondido.setVisible(false);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 6;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 3;
		gbc_rigidArea.gridy = 0;
		panel_1.add(rigidArea, gbc_rigidArea);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 3;
		gbc_rigidArea_3.gridy = 1;
		panel_1.add(rigidArea_3, gbc_rigidArea_3);

		JButton btnNewButton = new JButton("Prosseguir");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		panel_1.add(btnNewButton, gbc_btnNewButton);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 3;
		gbc_rigidArea_4.gridy = 2;
		panel_1.add(rigidArea_4, gbc_rigidArea_4);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 4;
		gbc_rigidArea_5.gridy = 2;
		panel_1.add(rigidArea_5, gbc_rigidArea_5);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_6.gridx = 6;
		gbc_rigidArea_6.gridy = 2;
		panel_1.add(rigidArea_6, gbc_rigidArea_6);

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_7.gridx = 8;
		gbc_rigidArea_7.gridy = 2;
		panel_1.add(rigidArea_7, gbc_rigidArea_7);

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_8.gridx = 9;
		gbc_rigidArea_8.gridy = 2;
		panel_1.add(rigidArea_8, gbc_rigidArea_8);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_9 = new GridBagConstraints();
		gbc_rigidArea_9.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_9.gridx = 10;
		gbc_rigidArea_9.gridy = 2;
		panel_1.add(rigidArea_9, gbc_rigidArea_9);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 11;
		gbc_rigidArea_10.gridy = 2;
		panel_1.add(rigidArea_10, gbc_rigidArea_10);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_11 = new GridBagConstraints();
		gbc_rigidArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_11.gridx = 12;
		gbc_rigidArea_11.gridy = 2;
		panel_1.add(rigidArea_11, gbc_rigidArea_11);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 13;
		gbc_btnNewButton_1.gridy = 2;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);

		MetodosDeApoioView.voltar(btnNewButton_1, panelAtual, panelAntigo, frame);

		Component glue = Box.createGlue();
		GridBagConstraints gbc_glue = new GridBagConstraints();
		gbc_glue.gridwidth = 9;
		gbc_glue.insets = new Insets(0, 0, 0, 5);
		gbc_glue.gridx = 4;
		gbc_glue.gridy = 3;
		panel_1.add(glue, gbc_glue);

		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneEscondido.setVisible(true);
				formattedTextField.setVisible(true);
			}
		});

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneEscondido.setVisible(false);
				formattedTextField.setVisible(false);

			}
		});
		prosseguir(btnNewButton, panelAtual, panelAntigo, frame, formattedTextField);
	}

	public void prosseguir(JButton button, JPanel panelAtual, JPanel panelAntigo, JFrame frame,
			JFormattedTextField formattedTextField) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (formattedTextField.isVisible()) {
					int qtdSelecionada;
					try {
						qtdSelecionada = Integer.parseInt(formattedTextField.getText());
					} catch (Exception e1) {
						qtdSelecionada = -1;
					}
					ReadView.listar(panelAtual, frame, qtdSelecionada);
				} else {

					ReadView.listar(panelAtual, frame, TesteEnum.TodosOsValores.getValue());
				}
			}
		});
	}
}
