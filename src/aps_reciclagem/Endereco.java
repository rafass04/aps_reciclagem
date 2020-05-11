package aps_reciclagem;

public class Endereco {
	private String bairroEndereco;
	private String descricaoEndereco;
	
	public Endereco(String bairroEndereco, String descricaoEndereco) {
		this.bairroEndereco = bairroEndereco;
		this.descricaoEndereco = descricaoEndereco;
	}
	
	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}
	public String getDescricaoEndereco() {
		return descricaoEndereco;
	}
	public void setDescricaoEndereco(String descricaoEndereco) {
		this.descricaoEndereco = descricaoEndereco;
	}
}