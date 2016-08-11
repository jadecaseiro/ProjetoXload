package interfaceGrafica;

import SistemaXload.Modelos.Cliente;
import SistemaXload.Repositorio.RepositorioClienteConexao;
import javax.swing.JOptionPane;

public class AlterarCliente extends javax.swing.JFrame {
	Cliente clienteAlterar;

	public AlterarCliente(Cliente cliente) {
		initComponents();
		this.clienteAlterar = cliente;
		txtCpf.setText(this.clienteAlterar.getCpf());
		txtNome.setText(this.clienteAlterar.getNome());
		txtEmail.setText(this.clienteAlterar.getEmail());
	}

	public AlterarCliente() {
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		painelAlterarCliente = new javax.swing.JPanel();
		lblCpf = new javax.swing.JLabel();
		txtCpf = new javax.swing.JTextField();
		lblNome = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		lblEmail = new javax.swing.JLabel();
		txtEmail = new javax.swing.JTextField();
		btnSalvar = new javax.swing.JButton();
		btnCancelar = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		painelAlterarCliente.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Alteração de Clientes"));

		lblCpf.setText("CPF");

		lblNome.setText("Nome");

		lblEmail.setText("Email");

		btnSalvar.setText("Salvar");
		btnSalvar.setName(""); // NOI18N
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarActionPerformed(evt);
			}
		});

		btnCancelar.setText("Cancelar");
		btnCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCancelarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout painelAlterarClienteLayout = new javax.swing.GroupLayout(
				painelAlterarCliente);
		painelAlterarCliente.setLayout(painelAlterarClienteLayout);
		painelAlterarClienteLayout
				.setHorizontalGroup(painelAlterarClienteLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								painelAlterarClienteLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												painelAlterarClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																painelAlterarClienteLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblCpf)
																		.addGap(26,
																				26,
																				26)
																		.addComponent(
																				txtCpf))
														.addGroup(
																painelAlterarClienteLayout
																		.createSequentialGroup()
																		.addGroup(
																				painelAlterarClienteLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lblNome)
																						.addComponent(
																								lblEmail))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				painelAlterarClienteLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								painelAlterarClienteLayout
																										.createSequentialGroup()
																										.addComponent(
																												btnSalvar)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												41,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnCancelar)
																										.addGap(21,
																												21,
																												21))
																						.addComponent(
																								txtEmail)
																						.addComponent(
																								txtNome))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		painelAlterarClienteLayout
				.setVerticalGroup(painelAlterarClienteLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								painelAlterarClienteLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												painelAlterarClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCpf)
														.addComponent(
																txtCpf,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												painelAlterarClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblNome)
														.addComponent(
																txtNome,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												painelAlterarClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblEmail)
														.addComponent(
																txtEmail,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												painelAlterarClienteLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnSalvar)
														.addComponent(
																btnCancelar))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setText("Alterar Clientes");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(32, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jLabel4)
																.addGap(114,
																		114,
																		114))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		painelAlterarCliente,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(29, 29,
																		29)))));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel4)
						.addGap(18, 18, 18)
						.addComponent(painelAlterarCliente,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
		this.dispose();
	}// GEN-LAST:event_btnCancelarActionPerformed

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
		try {
			clienteAlterar.setCpf(txtCpf.getText());
			clienteAlterar.setNome(txtNome.getText());
			clienteAlterar.setEmail(txtEmail.getText());
			// RepositorioCliente.obterInstancia().atualizar(clienteAlterar);
			RepositorioClienteConexao.obterInstancia()
					.atualizar(clienteAlterar);
			JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
			this.dispose();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());

		}
	}// GEN-LAST:event_btnSalvarActionPerformed

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
			java.util.logging.Logger.getLogger(AlterarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AlterarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AlterarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AlterarCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AlterarCliente().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCancelar;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblNome;
	private javax.swing.JPanel painelAlterarCliente;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	// End of variables declaration//GEN-END:variables
}
