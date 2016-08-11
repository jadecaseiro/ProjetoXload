package interfaceGrafica;

import SistemaXload.Modelos.Cliente;
import SistemaXload.Repositorio.RepositorioClienteConexao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaCliente extends javax.swing.JFrame {

	private ArrayList<Cliente> lista;

	public ConsultaCliente() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		painelClientes = new javax.swing.JPanel();
		spClientes = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		btnAtualizar = new javax.swing.JButton();
		btnNovo = new javax.swing.JButton();
		btnAlterar = new javax.swing.JButton();
		btnRemover = new javax.swing.JButton();
		btnMenuPrincipal = new javax.swing.JButton();
		btnFechar = new javax.swing.JButton();
		lblPrincipal = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		painelClientes.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Tela de Clientes"));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "CPF", "Nome", "Email" }));
		spClientes.setViewportView(jTable1);

		btnAtualizar.setText("Atualizar");
		btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAtualizarActionPerformed(evt);
			}
		});

		btnNovo.setText("Novo");
		btnNovo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNovoActionPerformed(evt);
			}
		});

		btnAlterar.setText("Alterar");
		btnAlterar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAlterarActionPerformed(evt);
			}
		});

		btnRemover.setText("Remover");
		btnRemover.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRemoverActionPerformed(evt);
			}
		});

		btnMenuPrincipal.setText("Menu Principal");
		btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnMenuPrincipalActionPerformed(evt);
			}
		});

		btnFechar.setText("Fechar Janela");
		btnFechar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFecharActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(
				painelClientes);
		painelClientes.setLayout(painelClientesLayout);
		painelClientesLayout
				.setHorizontalGroup(painelClientesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								painelClientesLayout
										.createSequentialGroup()
										.addGroup(
												painelClientesLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																painelClientesLayout
																		.createSequentialGroup()
																		.addGap(66,
																				66,
																				66)
																		.addComponent(
																				btnAtualizar)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				btnNovo)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				btnAlterar)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				btnRemover))
														.addGroup(
																painelClientesLayout
																		.createSequentialGroup()
																		.addGap(44,
																				44,
																				44)
																		.addComponent(
																				spClientes,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				341,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																painelClientesLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				btnMenuPrincipal)
																		.addGap(190,
																				190,
																				190)
																		.addComponent(
																				btnFechar,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(30, Short.MAX_VALUE)));
		painelClientesLayout
				.setVerticalGroup(painelClientesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								painelClientesLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												spClientes,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(27, 27, 27)
										.addGroup(
												painelClientesLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btnAtualizar)
														.addComponent(btnNovo)
														.addComponent(
																btnAlterar)
														.addComponent(
																btnRemover))
										.addGap(28, 28, 28)
										.addGroup(
												painelClientesLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btnMenuPrincipal)
														.addComponent(btnFechar))
										.addContainerGap(30, Short.MAX_VALUE)));

		lblPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblPrincipal.setText("Clientes");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(36, 36,
																		36)
																.addComponent(
																		painelClientes,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(223,
																		223,
																		223)
																.addComponent(
																		lblPrincipal)))
								.addContainerGap(40, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addGap(23, 23, 23)
						.addComponent(lblPrincipal)
						.addGap(18, 18, 18)
						.addComponent(painelClientes,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(42, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAtualizarActionPerformed
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "Cpf", "Nome", "Email" });
		RepositorioClienteConexao instancia = RepositorioClienteConexao
				.obterInstancia();
		try {
			this.lista = instancia.listarTodos();
		} catch (Exception ex) {
			Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		for (int i = 0; i < lista.size(); i++) {
			modelo.addRow(new Object[] { this.lista.get(i).getCpf(),
					this.lista.get(i).getNome(), this.lista.get(i).getEmail() });

		}
		jTable1.setModel(modelo);
	}// GEN-LAST:event_btnAtualizarActionPerformed

	private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovoActionPerformed
		NovoCliente form = new NovoCliente();
		form.show();
	}// GEN-LAST:event_btnNovoActionPerformed

	private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarActionPerformed
		AlterarCliente form = new AlterarCliente(this.lista.get(jTable1
				.getSelectedRow()));
		form.show();
	}// GEN-LAST:event_btnAlterarActionPerformed

	private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoverActionPerformed
		try {
			RepositorioClienteConexao.obterInstancia().remover(
					this.lista.get(jTable1.getSelectedRow()));
			JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}// GEN-LAST:event_btnRemoverActionPerformed

	private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMenuPrincipalActionPerformed
		this.dispose();
		TelaPrincipal form = new TelaPrincipal();
		form.show();
	}// GEN-LAST:event_btnMenuPrincipalActionPerformed

	private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFecharActionPerformed
		this.dispose();
	}// GEN-LAST:event_btnFecharActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ConsultaCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ConsultaCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ConsultaCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ConsultaCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ConsultaCliente().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnAtualizar;
	private javax.swing.JButton btnFechar;
	private javax.swing.JButton btnMenuPrincipal;
	private javax.swing.JButton btnNovo;
	private javax.swing.JButton btnRemover;
	private javax.swing.JTable jTable1;
	private javax.swing.JLabel lblPrincipal;
	private javax.swing.JPanel painelClientes;
	private javax.swing.JScrollPane spClientes;
	// End of variables declaration//GEN-END:variables
}
