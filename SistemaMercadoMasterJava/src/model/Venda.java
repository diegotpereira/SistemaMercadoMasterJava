package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity(name = "venda")
public class Venda implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "datavenda")
    private String dataVenda;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "venda_produto",
        joinColumns = {@JoinColumn(name = "venda_id")},
        inverseJoinColumns = {@JoinColumn(name = "produto_id")})
    private List<Produto> listaProdutos;

	public Venda() {
		
	}

	public Venda(Long id, String dataVenda, model.Cliente cliente, List<model.Produto> listaProdutos) {
		super();
		this.id = id;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
