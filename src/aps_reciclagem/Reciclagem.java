package aps_reciclagem;

import java.util.*;
import javax.swing.JOptionPane;

public class Reciclagem {
	
	public static void main(String[] args) {
		
		LixoEletronico hd = new LixoEletronico(
			"HD",
			"O disco rígido, popularmente conhecido como HD (Hard Disk), é um dispositivo que é usado em computadores capaz de armazenar dados. Possui plástico e metais que podem ser reciclados."
		);
		hd.categoriasLixo.add(new Categoria("Plástico"));
		hd.categoriasLixo.add(new Categoria("Metal"));		
		hd.enderecos.add(new Endereco("Morumbi", "Avenida Giovani Gronchi, 3.413"));
		hd.enderecos.add(new Endereco("Parque Boturussu", "Rua Nélio Batista Guimarães, n° 183"));
		
		LixoEletronico cooler = new LixoEletronico(
			"Cooler",
			"O cooler é uma espécie de ventiladorzinho que tem a função de reduzir o calor gerado pelos componentes da máquina, principalmente o produzido pelo próprio processador. Ou seja, é o responsável por \"refrescar o computador\". Possuí plasticos que podem ser reciclados."
		);
		cooler.categoriasLixo.add(new Categoria("Plástico"));
		cooler.categoriasLixo.add(new Categoria("Metal"));	
		cooler.enderecos.add(new Endereco("Parque Boturussu", "Rua Nélio Batista Guimarães, n° 183"));
		cooler.enderecos.add(new Endereco("Vila Zat", "Rua Vigário Godói, n° 480"));		
		
		LixoEletronico monitor = new LixoEletronico(
			"Monitor",
			"O disco rígido, popularmente conhecido como HD (Hard Disk), é um dispositivo que é usado em computadores capaz de armazenar dados. Possui plástico e metais que podem ser reciclados."
		);
		monitor.categoriasLixo.add(new Categoria("Vidro"));
		monitor.categoriasLixo.add(new Categoria("Plástico"));
		monitor.categoriasLixo.add(new Categoria("Metal"));
		monitor.enderecos.add(new Endereco("Vila Zat", "Rua Vigário Godói, n° 480"));
		monitor.enderecos.add(new Endereco("Liberdade", "Rua Jaceguai, Nº 67 x Av. Liberdade"));
		
		LixoEletronico pilha = new LixoEletronico(
			"Pilha",
			"Pilhas ou célula voltaicas são dispositivos que transformam energia química em energia elétrica por meio de um sistema apropriado e montado para aproveitar o fluxo de elétrons provenientes de uma reação química de oxirredução. Devem ser recicladas em lugares específicos."
		);	
		pilha.categoriasLixo.add(new Categoria("Metal"));
		pilha.categoriasLixo.add(new Categoria("Cobre"));
		pilha.enderecos.add(new Endereco("Liberdade", "Rua Jaceguai, Nº 67 x Av. Liberdade"));
		pilha.enderecos.add(new Endereco("São Lucas", "Rua Florêncio Sanches, nº 307"));
		
		LixoEletronico bateria = new LixoEletronico(
			"Bateria",
			"Uma bateria é um aparelho ou dispositivo que transforma em corrente elétrica a energia desenvolvida numa reação química. Cada célula de uma bateria contém um terminal positivo e um terminal negativo. O processo químico de troca de elétrons é conhecido como oxirredução. Devem ser recicladas em lugares específicos."
		);
		bateria.categoriasLixo.add(new Categoria("Metal"));
		bateria.categoriasLixo.add(new Categoria("Lítio"));
		bateria.enderecos.add(new Endereco("São Lucas", "Rua Florêncio Sanches, nº 307"));
		bateria.enderecos.add(new Endereco("Morumbi", "Avenida Giovani Gronchi, 3.413"));
		
		List<LixoEletronico> lixosEletronicos = new ArrayList<LixoEletronico>() {
			{
				add(hd);
				add(cooler);
				add(monitor);
				add(pilha);
				add(bateria);
			}
		};
		
		PainelLixosEletronicos(lixosEletronicos);
	}
	
	private static void PainelLixosEletronicos(List<LixoEletronico> lixosEletronicos) {
		String opcao ="";
		String cat = "";
		String end = "";
		do {
			opcao = JOptionPane.showInputDialog(
					"Olá Recycler, escolha uma opção:\n" + 
					"1 - HD\n"
						+ "2 - Cooler\n"
						+ "3 - Monitor\n"
						+ "4 - Pilha\n"
						+ "5 - Bateria\n"
						+ "6 - Sair"
					);
			switch (opcao) {
				case "1":
					LixoEletronico hd = lixosEletronicos.stream()
												.filter(x -> "HD".equals(x.getNomeLixo())).findAny().orElse(null);
					hd.imprime();
					
					cat = "";
					for(Categoria categoria: hd.categoriasLixo) {
						cat += categoria.getNomeCategoria() + " | ";
					}
					
					end = "\n";
					for(Endereco endereco: hd.enderecos) {
						end += endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco() + "\n";
					}
						
					JOptionPane.showMessageDialog(
							null, 
							"---------------------- " + hd.getNomeLixo() + " ----------------------"
									+ "\n" + hd.getDescricaoLixo() + "\nCategorias: " + cat
									+ "\nEndereços: " + end + 
									"Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n"						
						);
				break;
				case "2":
					LixoEletronico cooler = lixosEletronicos.stream()
												.filter(x -> "Cooler".equals(x.getNomeLixo())).findAny().orElse(null);
					cooler.imprime();
					
					cat = "";
					for(Categoria categoria: cooler.categoriasLixo) {
					cat += categoria.getNomeCategoria() + " | ";
					}
					
					end = "\n";
					for(Endereco endereco: cooler.enderecos) {
					end += endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco() + "\n";
					}
					
					JOptionPane.showMessageDialog(
							null, 
							"---------------------- " + cooler.getNomeLixo() + " ----------------------"
									+ "\n" + cooler.getDescricaoLixo() + "\nCategorias: " + cat
									+ "\nEndereços: " + end + 
									"Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n"						
					);
				break;
				case "3":
					LixoEletronico monitor = lixosEletronicos.stream()
												.filter(x -> "Monitor".equals(x.getNomeLixo())).findAny().orElse(null);
					monitor.imprime();
					
					cat = "";
					for(Categoria categoria: monitor.categoriasLixo) {
					cat += categoria.getNomeCategoria() + " | ";
					}
					
					end = "\n";
					for(Endereco endereco: monitor.enderecos) {
					end += endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco() + "\n";
					}
					
					JOptionPane.showMessageDialog(
							null, 
							"---------------------- " + monitor.getNomeLixo() + " ----------------------"
									+ "\n" + monitor.getDescricaoLixo() + "\nCategorias: " + cat
									+ "\nEndereços: " + end + 
									"Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n"						
					);
				break;
				case "4":
					LixoEletronico pilha = lixosEletronicos.stream()
													.filter(x -> "Pilha".equals(x.getNomeLixo())).findAny().orElse(null);
					pilha.imprime();
					
					cat = "";
					for(Categoria categoria: pilha.categoriasLixo) {
					cat += categoria.getNomeCategoria() + " | ";
					}
					
					end = "\n";
					for(Endereco endereco: pilha.enderecos) {
					end += endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco() + "\n";
					}
					
					JOptionPane.showMessageDialog(
							null, 
							"---------------------- " + pilha.getNomeLixo() + " ----------------------"
									+ "\n" + pilha.getDescricaoLixo() + "\nCategorias: " + cat
									+ "\nEndereços: " + end + 
									"Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n"						
					);
				break;
				case "5":
					LixoEletronico bateria = lixosEletronicos.stream()
													.filter(x -> "Bateria".equals(x.getNomeLixo())).findAny().orElse(null);
					bateria.imprime();
					
					cat = "";
					for(Categoria categoria: bateria.categoriasLixo) {
					cat += categoria.getNomeCategoria() + " | ";
					}
					
					end = "\n";
					for(Endereco endereco: bateria.enderecos) {
					end += endereco.getDescricaoEndereco() + " - Bairro: " + endereco.getBairroEndereco() + "\n";
					}
					
					JOptionPane.showMessageDialog(
							null, 
							"---------------------- " + bateria.getNomeLixo() + " ----------------------"
									+ "\n" + bateria.getDescricaoLixo() + "\nCategorias: " + cat
									+ "\nEndereços: " + end + 
									"Caso o descarte não seja viável, você pode recorrer à coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Plástico, Orgânico, Metal, Reciclável) e contribuindo com a preservação do meio ambiente.\n\n"						
					);
				break;		
			}
		} while(!opcao.equals("6"));
	}
}