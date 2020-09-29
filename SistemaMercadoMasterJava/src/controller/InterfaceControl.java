package controller;

import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;

import view.Menu;



public class InterfaceControl {
	
	// incialização de componentes
	private Menu telaPrincipal;
	DaoController daoController;
	
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

public InterfaceControl() throws ClassNotFoundException, SQLException {
	
	telaPrincipal = null;
	
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
		
	}

	public void janRealizarVenda() {
		// TODO Auto-generated method stub
		
	}

	public void janListarCliente() {
		// TODO Auto-generated method stub
		
	}

	public void janCadCliente() {
		// TODO Auto-generated method stub
		
	}

	public void janCadProduto() {
		// TODO Auto-generated method stub
		
	}
	
}
