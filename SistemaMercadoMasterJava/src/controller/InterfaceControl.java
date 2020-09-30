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
import view.ListarProdutos;
import view.Menu;



public class InterfaceControl {
	
	// incialização de componentes
	private Menu telaPrincipal;
	DaoController daoController;
	private CadastrarProdutoDialog dlgCadastrarProduto;
	private ListarProdutos dlgListarProdutos;
	private CadastrarClienteDialog dlgCadastrarCliente;
	private ListarClientesDialog dlgListarClientes;
	
	
public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Look and Feel não encontrado");
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
	            dlgListarProdutos = new ListarProdutos(telaPrincipal, true, this);
	        }
	        dlgListarProdutos.setVisible(true);	
	}

	public void janRealizarVenda() {
		// TODO Auto-generated method stub
		
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
	
}
