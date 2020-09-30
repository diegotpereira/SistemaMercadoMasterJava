package view;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.InterfaceControl;
import model.Cliente;

public class ListarClientesDialog extends javax.swing.JDialog {
	
	InterfaceControl controller;
	
	public ListarClientesDialog(java.awt.Frame parent, boolean modal, InterfaceControl interfaceControl) {
        super(parent, modal);
        this.controller = interfaceControl;
        initComponents();
        this.preencherClientes(TableClientes);
    }

	private void preencherClientes(JTable tableClientes2) {
		// TODO Auto-generated method stub
		 DefaultTableModel modelo = (DefaultTableModel) tableClientes2.getModel();
	        List<Cliente> listaClientes = new ArrayList<>();
	        
	        listaClientes = this.controller.getGerDao().listar(Cliente.class);
	        
	        for(Cliente cliente : listaClientes) {
	            modelo.addRow(new Object[]{
	                cliente.getNome(), 
	                cliente.getTelefone(), 
	                cliente.getCep(), 
	                cliente.getEndereco(),
	                cliente.getBairro(),
	                cliente.getNumero(),
	                cliente.getComplemento()
	            });
	        }
	        
	        tableClientes2.setModel(modelo);
		
	}

	private void initComponents() {
		// Inicialização de componentes
		jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CEP", "EndereÃ§o", "Bairro", "Numero", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableClientes);

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
    private javax.swing.JTable TableClientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
