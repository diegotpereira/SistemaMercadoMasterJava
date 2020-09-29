package view;

import java.awt.event.ActionEvent;

import controller.InterfaceControl;

public class CadastrarProdutoDialog extends javax.swing.JDialog{
	
	InterfaceControl controller;
	
	public CadastrarProdutoDialog(java.awt.Frame parent, boolean modal, InterfaceControl interfaceControl) {
        super(parent, modal);
        this.controller = interfaceControl;
        initComponents();
    }

	private void initComponents() {
		// TODO Auto-generated method stub
		 PainelGeral = new javax.swing.JPanel();
	        LabelTitulo = new javax.swing.JLabel();
	        LabelNomeProduto = new javax.swing.JLabel();
	        InputProduto = new javax.swing.JTextField();
	        InputPesoLitros = new javax.swing.JTextField();
	        LabelPesoLitros = new javax.swing.JLabel();
	        LabelValor = new javax.swing.JLabel();
	        LabelEstoque = new javax.swing.JLabel();
	        BtnSalvar = new javax.swing.JButton();
	        BtnCancelar = new javax.swing.JButton();
	        InputEstoque = new javax.swing.JFormattedTextField();
	        InputValor = new javax.swing.JFormattedTextField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        LabelTitulo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
	        LabelTitulo.setText("CADASTRAR PRODUTO");

	        LabelNomeProduto.setText("Nome do Produto");

	        InputProduto.setMinimumSize(new java.awt.Dimension(200, 25));
	        InputProduto.setPreferredSize(new java.awt.Dimension(200, 25));
	        InputProduto.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                InputProdutoActionPerformed(evt);
	            }
	        });

	        InputPesoLitros.setMinimumSize(new java.awt.Dimension(100, 25));
	        InputPesoLitros.setPreferredSize(new java.awt.Dimension(100, 25));
	        InputPesoLitros.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                InputPesoLitrosActionPerformed(evt);
	            }
	        });

	        LabelPesoLitros.setText("Peso/Litros");

	        LabelValor.setText("Valor R$");

	        LabelEstoque.setText("Estoque");

	        BtnSalvar.setText("Salvar");
	        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                BtnSalvarActionPerformed(evt);
	            }
	        });

	        BtnCancelar.setText("Cancelar");
	        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                BtnCancelarActionPerformed(evt);
	            }
	        });

	        InputEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
	        InputEstoque.setMinimumSize(new java.awt.Dimension(100, 25));
	        InputEstoque.setPreferredSize(new java.awt.Dimension(100, 25));

	        InputValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
	        InputValor.setMinimumSize(new java.awt.Dimension(100, 25));
	        InputValor.setPreferredSize(new java.awt.Dimension(100, 25));

	        javax.swing.GroupLayout PainelGeralLayout = new javax.swing.GroupLayout(PainelGeral);
	        PainelGeral.setLayout(PainelGeralLayout);
	        PainelGeralLayout.setHorizontalGroup(
	            PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(PainelGeralLayout.createSequentialGroup()
	                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(PainelGeralLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(LabelNomeProduto)
	                            .addComponent(InputProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(LabelTitulo)
	                            .addGroup(PainelGeralLayout.createSequentialGroup()
	                                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(LabelPesoLitros)
	                                    .addComponent(InputPesoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(18, 18, 18)
	                                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(LabelValor)
	                                    .addComponent(InputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(27, 27, 27)
	                                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(LabelEstoque)
	                                    .addComponent(InputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addGap(0, 12, Short.MAX_VALUE))
	                    .addGroup(PainelGeralLayout.createSequentialGroup()
	                        .addGap(85, 85, 85)
	                        .addComponent(BtnCancelar)
	                        .addGap(38, 38, 38)
	                        .addComponent(BtnSalvar)))
	                .addContainerGap())
	        );
	        PainelGeralLayout.setVerticalGroup(
	            PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(PainelGeralLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(PainelGeralLayout.createSequentialGroup()
	                        .addComponent(LabelTitulo)
	                        .addGap(24, 24, 24)
	                        .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(InputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(PainelGeralLayout.createSequentialGroup()
	                                .addComponent(LabelNomeProduto)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(InputProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(LabelPesoLitros)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(InputPesoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                    .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(InputEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelGeralLayout.createSequentialGroup()
	                            .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                .addComponent(LabelEstoque)
	                                .addComponent(LabelValor))
	                            .addGap(31, 31, 31))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
	                .addGroup(PainelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(BtnSalvar)
	                    .addComponent(BtnCancelar))
	                .addGap(29, 29, 29))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(PainelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(PainelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	}
	protected void BtnCancelarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void BtnSalvarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void InputPesoLitrosActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void InputProdutoActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
	// Declaração de variaveis
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JFormattedTextField InputEstoque;
    private javax.swing.JTextField InputPesoLitros;
    private javax.swing.JTextField InputProduto;
    private javax.swing.JFormattedTextField InputValor;
    private javax.swing.JLabel LabelEstoque;
    private javax.swing.JLabel LabelNomeProduto;
    private javax.swing.JLabel LabelPesoLitros;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JPanel PainelGeral;
    // End of variables declaration//GEN-END:variables

}
