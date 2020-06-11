package components;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.DeleteController;
import controller.ReadController;
import controller.TesteEnum;
import view.MetodosDeApoioView;

public class DeleteMenuListagem extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DeleteMenuListagem(JPanel panelAtual, JPanel panelSuperior, JFrame frame) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel panel = new JPanel();

		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);

		table = new JTable();
		MetodosDeApoioView.ajustarTabela(table);
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("Selecione a linha que deseja remover");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 2;
		gbc_rigidArea.gridy = 4;
		add(rigidArea, gbc_rigidArea);

		JButton btnNewButton = new JButton("Remover");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Voltar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 5;
		add(btnNewButton_1, gbc_btnNewButton_1);
		MetodosDeApoioView.voltar(btnNewButton_1, panelAtual, panelSuperior, frame);
		ReadController.gerarListaDeProduto(TesteEnum.TodosOsValores.getValue(), table);
		removerLinha(btnNewButton, table);
	}

	public void removerLinha(JButton button, JTable table) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			int idProduto;
			int linhaSelecionada = table.getSelectedRow();
			int coluna = 0;
			idProduto = Integer.parseInt(table.getValueAt(linhaSelecionada, 0).toString());
			System.out.println(table.getValueAt(linhaSelecionada, 0));
			DeleteController.delete(idProduto);
			model.removeRow(linhaSelecionada);
			}
		});
	}
}
