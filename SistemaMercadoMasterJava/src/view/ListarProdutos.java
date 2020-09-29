package view;

import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.InterfaceControl;
import model.Produto;


public class ListarProdutos extends javax.swing.JDialog{
	
	InterfaceControl controller;
	private JPopupMenu popupMenu = new JPopupMenu();
	private JMenuItem editarEstoque = null;
	
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarProdutos dialog = new ListarProdutos(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
	
    public ListarProdutos(java.awt.Frame parent, boolean modal, InterfaceControl InterfaceControl) {
        super(parent, modal);
        this.controller = InterfaceControl;
        initComponents();
        createPopupEditarEstoque();
        this.preencherProdutos(TableProdutos);
    }

	private void preencherProdutos(JTable tableProdutos2) {
		// TODO Auto-generated method stub
		DefaultTableModel modelo = (DefaultTableModel) tableProdutos2.getModel();
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos = controller.getGerDao().listar(Produto.class);
		
		for(Produto produto : listaProdutos){
            modelo.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getMedida(), produto.getValor(), produto.getEstoque()});
        }
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		jPopupMenu1 = new javax.swing.JPopupMenu();
        OpEditarEstoque = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();

        OpEditarEstoque.setText("Editar Estoque");
        jPopupMenu1.add(OpEditarEstoque);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Produtos");
        setModal(true);

        TableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Peso/Litros", "Valor R$", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();

		
	}
	protected void TableProdutosMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Auto-generated method stub
		int posX = MouseInfo.getPointerInfo().getLocation().x;
        int posY = MouseInfo.getPointerInfo().getLocation().y;
        
        popupMenu.show(this, posX, posY);
		
	}

	private void createPopupEditarEstoque() {
		// TODO Auto-generated method stub
		 editarEstoque = new JMenuItem("Editar Estoque");
	        
	        editarEstoque.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String novoEstoque = JOptionPane.showInputDialog("Valor do estoque:");
	                Long id = (Long) TableProdutos.getValueAt(TableProdutos.getSelectedRow(), 0);
	                controller.getGerDao().alterarEstoqueProduto(id, Integer.parseInt(novoEstoque));
	            }
	        });
	        
	        popupMenu.add(editarEstoque);
		
	}
	
	// Declaração de variaveis
    private javax.swing.JMenuItem OpEditarEstoque;
    private javax.swing.JTable TableProdutos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
