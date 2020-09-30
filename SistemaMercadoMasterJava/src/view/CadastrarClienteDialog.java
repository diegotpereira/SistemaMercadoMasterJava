package view;


import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.InterfaceControl;

public class CadastrarClienteDialog extends javax.swing.JDialog{
	
	InterfaceControl controller;
	
	public CadastrarClienteDialog(java.awt.Frame parent, boolean modal, InterfaceControl interfaceControl) {
        super(parent, modal);
        this.controller = interfaceControl;
        initComponents();
    }

	private void initComponents() {
		// TODO Auto-generated method stub
		jPanel1 = new javax.swing.JPanel();
        CadastrarCliente = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        InputNome = new javax.swing.JTextField();
        LabelEndereco = new javax.swing.JLabel();
        InputEndereco = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        InputBairro = new javax.swing.JTextField();
        LabelBairro = new javax.swing.JLabel();
        InputComplemento = new javax.swing.JTextField();
        LabelComplemento = new javax.swing.JLabel();
        LabelNumero = new javax.swing.JLabel();
        InputNumero = new javax.swing.JFormattedTextField();
        LabelCEP = new javax.swing.JLabel();
        InputCEP = new javax.swing.JTextField();
        InputTelefone = new javax.swing.JTextField();
        BtncSalvar = new javax.swing.JButton();
        BtncCancelar = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CadastrarCliente.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CadastrarCliente.setText("CADASTRAR CLIENTE");

        LabelNome.setText("Nome");

        InputNome.setMinimumSize(new java.awt.Dimension(200, 25));
        InputNome.setPreferredSize(new java.awt.Dimension(200, 25));

        LabelEndereco.setText("Endereço");

        InputEndereco.setMinimumSize(new java.awt.Dimension(200, 25));
        InputEndereco.setPreferredSize(new java.awt.Dimension(200, 25));

        Telefone.setText("Telefone");

        InputBairro.setMinimumSize(new java.awt.Dimension(200, 25));
        InputBairro.setPreferredSize(new java.awt.Dimension(200, 25));

        LabelBairro.setText("Bairro");

        InputComplemento.setMinimumSize(new java.awt.Dimension(200, 25));
        InputComplemento.setPreferredSize(new java.awt.Dimension(200, 25));

        LabelComplemento.setText("Complemento");

        LabelNumero.setText("Numero");

        InputNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        InputNumero.setMinimumSize(new java.awt.Dimension(50, 25));
        InputNumero.setPreferredSize(new java.awt.Dimension(50, 25));

        LabelCEP.setText("CEP");

        InputCEP.setMinimumSize(new java.awt.Dimension(125, 25));
        InputCEP.setPreferredSize(new java.awt.Dimension(135, 25));

        InputTelefone.setMinimumSize(new java.awt.Dimension(200, 25));
        InputTelefone.setPreferredSize(new java.awt.Dimension(200, 25));

        BtncSalvar.setText("Salvar");
        BtncSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncSalvarActionPerformed(evt);
            }
        });

        BtncCancelar.setText("Cancelar");
        BtncCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CadastrarCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNome)
                            .addComponent(InputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefone)
                            .addComponent(InputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEndereco)
                            .addComponent(InputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBairro)
                            .addComponent(InputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelComplemento)
                            .addComponent(InputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNumero)
                            .addComponent(InputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCEP)
                            .addComponent(InputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtncCancelar)
                .addGap(87, 87, 87)
                .addComponent(BtncSalvar)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastrarCliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Telefone)
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCEP)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelComplemento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(InputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelNumero)
                            .addGap(31, 31, 31))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtncSalvar)
                    .addComponent(BtncCancelar))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

		
	}
	  protected void BtncCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void BtncSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		try {
            this.controller.getGerDao().inserirCliente(
                    InputNome.getText(),
                    InputTelefone.getText(),
                    InputCEP.getText(),
                    InputEndereco.getText(),
                    InputBairro.getText(),
                    InputComplemento.getText(),
                    Integer.valueOf(InputNumero.getText())
            );
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar Cliente \n"+ ex);
        }
        this.setVisible(false);
		
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtncCancelar;
    private javax.swing.JButton BtncSalvar;
    private javax.swing.JLabel CadastrarCliente;
    private javax.swing.JTextField InputBairro;
    private javax.swing.JTextField InputCEP;
    private javax.swing.JTextField InputComplemento;
    private javax.swing.JTextField InputEndereco;
    private javax.swing.JTextField InputNome;
    private javax.swing.JFormattedTextField InputNumero;
    private javax.swing.JTextField InputTelefone;
    private javax.swing.JLabel LabelBairro;
    private javax.swing.JLabel LabelCEP;
    private javax.swing.JLabel LabelComplemento;
    private javax.swing.JLabel LabelEndereco;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNumero;
    private javax.swing.JLabel Telefone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
