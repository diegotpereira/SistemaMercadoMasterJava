package controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;

import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import model.Cliente;
import model.Produto;
import model.Venda;

public class DaoController {
	
	private final ProdutoDAO produtoDAO;
    private final ClienteDAO clienteDAO;
    private final VendaDAO vendaDAO;
    private final GenericDAO genericDAO;
    
    public DaoController() throws ClassNotFoundException, SQLException {
    	
    	 ConexaoHibernate.getSessionFactory();
         this.produtoDAO = new ProdutoDAO();
         this.clienteDAO = new ClienteDAO();
         this.genericDAO = new GenericDAO();
         this.vendaDAO = new VendaDAO();
    }
    
    public List listar( Class classe) throws HibernateException {
        return genericDAO.listar( classe );
    }
    public void inserirProduto(String nome, Integer medida, Double valor, Integer estoque) throws ClassNotFoundException, SQLException{
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setMedida(medida);
        produto.setValor(valor);
        produto.setEstoque(estoque);
        
        produtoDAO.inserir(produto);
    }
    
    private List<Produto> abaterLista(List<Produto> listaProdutos){
        listaProdutos.forEach(element -> {
            element.setEstoque(element.getEstoque() - 1);
        });
        
        return listaProdutos;
    }
   
    private void updateListaProdutos(List<Produto> listaProdutos){
        listaProdutos.forEach(element -> {
            produtoDAO.alterar(element);
        });
    }
    
    public void alterarEstoqueProduto(Long id, Integer novoEstoque){
        Produto produto = produtoDAO.buscarPorId(id);
        produto.setEstoque(novoEstoque);
        produtoDAO.alterar(produto);
    }
    
    public void inserirVenda(Cliente cliente, List listaProdutos){
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setListaProdutos(listaProdutos);
        venda.setDataVenda(new Date().toString());
        
        vendaDAO.inserir(venda);
        
        listaProdutos = abaterLista(listaProdutos);
        updateListaProdutos(listaProdutos);
        
    }
    
    public void inserirCliente(String nome, String telefone, String cep, String endereco, String bairro, String complemento, Integer numero) throws ClassNotFoundException, SQLException{
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setCep(cep);
        cliente.setEndereco(endereco);
        cliente.setBairro(bairro);
        cliente.setComplemento(complemento);
        cliente.setNumero(numero);
        
        clienteDAO.inserir(cliente);
    }

}
