package br.com.k19.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.k19.modelo.Produto;

@ManagedBean
@SessionScoped
public class ProdutosBean implements Serializable {
	private static final long serialVersionUID = 7145838862424699794L;
	private List<Produto> produtos = new ArrayList<Produto>();
	private Produto produto = new Produto();
	
	public ProdutosBean(){
		Produto prd1 = new Produto();
		prd1.setNome("Banana");
		prd1.setPreco(2.44);
		prd1.setExibir(true);
		this.produtos.add(prd1);
		
		Produto prd2 = new Produto();
		prd2.setNome("Laranja");
		prd2.setPreco(3.00);
		prd2.setExibir(false);
		this.produtos.add(prd2); 
		
		System.out.println("ProdutosBean Construido!");
	}
	
	public void adicionaProduto(){
		this.produtos.add(produto);
		this.produto = new Produto();
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
