package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

import view.CadastrarClienteDialog;
import view.CadastrarProdutoDialog;
import view.ListarClientesDialog;
import view.ListarProdutosDialog;
import view.ListarVendasDialog;
import view.Menu;
import view.RealizarVendaDialog;




public class InterfaceControl {
	
	// incializa��o de componentes
	private Menu telaPrincipal;
	DaoController daoController;
	private CadastrarProdutoDialog dlgCadastrarProduto;
	private ListarProdutosDialog dlgListarProdutos;
	private CadastrarClienteDialog dlgCadastrarCliente;
	private ListarClientesDialog dlgListarClientes;
	private RealizarVendaDialog dlgRealizarVenda;
	private ListarVendasDialog dlgListarVendas;
	
public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Look and Feel n�o encontrado");
        }
        //</editor-fold>
        
         InterfaceControl gerIG;
         gerIG = new InterfaceControl();
         gerIG.janPrincipal();
         
    }

public void carregarCombo( JComboBox combo, Class classe ) {
    System.out.println("Entrou");
    List<?> lista;
    try {
        lista = daoController.listar(classe);
        combo.setModel( new DefaultComboBoxModel( lista.toArray() ) );
    } catch (HibernateException ex) {
        JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar COMBO. " + ex );
    }          
}

public InterfaceControl() throws ClassNotFoundException, SQLException {
	
	telaPrincipal = null;
	dlgListarProdutos = null;
	dlgCadastrarCliente = null;
	dlgListarClientes = null;
	dlgRealizarVenda = null;
	dlgListarVendas = null; 
	
	try {
		
		daoController = new DaoController();
		
	} catch (HibernateException ex) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(telaPrincipal, ex );
        System.exit(-1);
	}
}
	

	private void janPrincipal() {
	// TODO Auto-generated method stub
	if (telaPrincipal == null){            
        telaPrincipal = new Menu(this);
    }        
    telaPrincipal.setVisible(true); 
}
	
	 public DaoController getGerDao() {
	        return daoController;
	    }
	 
	public void janListarProduto() {
		// TODO Auto-generated method stub
		 if(dlgListarProdutos == null){
	            dlgListarProdutos = new ListarProdutosDialog(telaPrincipal, true, this);
	        }
	        dlgListarProdutos.setVisible(true);	
	}

	public void janRealizarVenda() {
		// Abrir janela realizar venda
		 if(dlgRealizarVenda == null){
	            dlgRealizarVenda = new RealizarVendaDialog(telaPrincipal, true, this);
	        }
	        dlgRealizarVenda.setVisible(true);
		
	}

	public void janListarCliente() {
		// Abrir janela com lista de clientes
		if(dlgListarClientes == null){
            dlgListarClientes = new ListarClientesDialog(telaPrincipal, true, this);
        }
        dlgListarClientes.setVisible(true);
    }

	public void janCadCliente() {
		// abrir cadastro de cliente
		if(dlgCadastrarCliente == null){
            dlgCadastrarCliente = new CadastrarClienteDialog(telaPrincipal, true, this);
        }
        dlgCadastrarCliente.setVisible(true);
		
	}

	public void janCadProduto() {
		// abrir janela de cadastro de produto
		if(dlgCadastrarProduto == null){
            dlgCadastrarProduto = new CadastrarProdutoDialog(telaPrincipal, true, this);
        }
        dlgCadastrarProduto.setVisible(true);
		
	}

	public void janListarVenda() {
		// Abrir jnela com lista de vendas
		if(dlgListarVendas == null){
            dlgListarVendas = new ListarVendasDialog(telaPrincipal, true, this);
        }
        dlgListarVendas.setVisible(true);
		
	}
	
}
