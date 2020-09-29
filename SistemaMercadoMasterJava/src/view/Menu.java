package view;


import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import controller.InterfaceControl;

public class Menu extends javax.swing.JFrame {
	
	private InterfaceControl interfaceControl;
	
	public Menu(InterfaceControl interfaceControl) {
        this.interfaceControl = interfaceControl;
        initComponents();
    }

	private void initComponents() {
		// TODO Auto-generated method stub
		jSplitPane1 = new javax.swing.JSplitPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Produto = new javax.swing.JMenu();
        CadastrarProduto = new javax.swing.JMenuItem();
        ListarProduto = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        CadastrarCliente = new javax.swing.JMenuItem();
        ListarCliente = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        RealizarVenda = new javax.swing.JMenuItem();
        ListarVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Produto.setText("Produto");

        CadastrarProduto.setText("Cadastrar");
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });
        Produto.add(CadastrarProduto);

        ListarProduto.setText("Listar");
        ListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProdutoActionPerformed(evt);
            }
        });
        Produto.add(ListarProduto);

        jMenuBar1.add(Produto);

        Cliente.setText("Cliente");

        CadastrarCliente.setText("Cadastrar");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteActionPerformed(evt);
            }
        });
        Cliente.add(CadastrarCliente);

        ListarCliente.setText("Listar");
        ListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClienteActionPerformed(evt);
            }
        });
        Cliente.add(ListarCliente);

        jMenuBar1.add(Cliente);

        Venda.setText("Venda");

        RealizarVenda.setText("Realizar Venda");
        RealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaActionPerformed(evt);
            }
        });
        Venda.add(RealizarVenda);

        ListarVendas.setText("Listar Vendas");
        ListarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVendasActionPerformed(evt);
            }
        });
        Venda.add(ListarVendas);

        jMenuBar1.add(Venda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
		
	}
	 protected void ListarVendasActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janListarProduto();
		
	}

	protected void RealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janRealizarVenda();
		
	}

	protected void ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janListarCliente();
	}

	protected void CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janCadCliente();
		
	}

	protected void ListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janListarProduto();
		
	}

	protected void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		interfaceControl.janCadProduto();
		
	}
	
    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
	// Declação de variaveis 
    private javax.swing.JMenuItem CadastrarCliente;
    private javax.swing.JMenuItem CadastrarProduto;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem ListarCliente;
    private javax.swing.JMenuItem ListarProduto;
    private javax.swing.JMenuItem ListarVendas;
    private javax.swing.JMenu Produto;
    private javax.swing.JMenuItem RealizarVenda;
    private javax.swing.JMenu Venda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

}
