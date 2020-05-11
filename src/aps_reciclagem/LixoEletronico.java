package aps_reciclagem;

import java.util.ArrayList;

public class LixoEletronico {
	private String nomeLixo;
	private String descricaoLixo;
	
	ArrayList<Categoria> categoriasLixo;
	ArrayList<Endereco> enderecos;
	
	public LixoEletronico( String nomeLixo, String descricaoLixo) {
		this.nomeLixo = nomeLixo;
		this.descricaoLixo = descricaoLixo;
		
		categoriasLixo = new ArrayList<Categoria>();
		enderecos = new ArrayList<Endereco>();
	}

	public String getNomeLixo() {
		return nomeLixo;
	}
	public void setNomeLixo(String nomeLixo) {
		this.nomeLixo = nomeLixo;
	}
	public String getDescricaoLixo() {
		return descricaoLixo;
	}
	public void setDescricaoLixo(String descricaoLixo) {
		this.descricaoLixo = descricaoLixo;
	}
	
	public void imprime() {
		System.out.println("----------------------" + this.getNomeLixo() + "----------------------");
		System.out.println(this.getDescricaoLixo());
		String cat = "";
		for(Categoria categoria: this.categoriasLixo) {
			cat += categoria.getNomeCategoria() + " | ";
		}
		System.out.println("\nCategorias: " + cat);
		System.out.println("\nEndereços: ");
		for(Endereco endereco: this.enderecos) {
			System.out.println(endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco());
		}
		System.out.println("Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n");
	}
}