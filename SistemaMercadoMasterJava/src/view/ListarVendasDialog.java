package view;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.InterfaceControl;
import model.Venda;


public class ListarVendasDialog extends javax.swing.JDialog{
	
	InterfaceControl controller;
	
	public ListarVendasDialog(java.awt.Frame parent, boolean modal, InterfaceControl interfaceControl) {
        super(parent, modal);
        this.controller = interfaceControl;
        initComponents();
        this.preencherVendas(TableVendas);
    }

	private void preencherVendas(JTable tableVendas2) {
		// TODO Auto-generated method stub
		 DefaultTableModel modelo = (DefaultTableModel) tableVendas2.getModel();
	        List<Venda> listaVendas = new ArrayList<>();
	        
	        listaVendas = this.controller.getGerDao().listar(Venda.class);
	        
	        for(Venda venda : listaVendas) {
	            modelo.addRow(new Object[]{
	                venda.getCliente().getNome(), 
	                venda.getDataVenda(), 
	                venda.getListaProdutos().toString(), 
	            });
	        }
	        
	        tableVendas2.setModel(modelo);
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		 jScrollPane1 = new javax.swing.JScrollPane();
	        TableVendas = new javax.swing.JTable();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        setTitle("Listar Clientes");

	        TableVendas.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Cliente", "Data", "Itens"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(TableVendas);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
	        );

	        pack();
	}
	// Declaração de variaveis
    private javax.swing.JTable TableVendas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
