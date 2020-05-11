package aps_reciclagem;

import java.util.*;
import javax.swing.JOptionPane;

public class Reciclagem {
	
	public static void main(String[] args) {
		
		LixoEletronico hd = new LixoEletronico(
			"HD",
			"O disco r�gido, popularmente conhecido como HD (Hard Disk), � um dispositivo que � usado em computadores capaz de armazenar dados. Possui pl�stico e metais que podem ser reciclados."
		);
		hd.categoriasLixo.add(new Categoria("Pl�stico"));
		hd.categoriasLixo.add(new Categoria("Metal"));		
		hd.enderecos.add(new Endereco("Morumbi", "Avenida Giovani Gronchi, 3.413"));
		hd.enderecos.add(new Endereco("Parque Boturussu", "Rua N�lio Batista Guimar�es, n� 183"));
		
		LixoEletronico cooler = new LixoEletronico(
			"Cooler",
			"O cooler � uma esp�cie de ventiladorzinho que tem a fun��o de reduzir o calor gerado pelos componentes da m�quina, principalmente o produzido pelo pr�prio processador. Ou seja, � o respons�vel por \"refrescar o computador\". Possu� plasticos que podem ser reciclados."
		);
		cooler.categoriasLixo.add(new Categoria("Pl�stico"));
		cooler.categoriasLixo.add(new Categoria("Metal"));	
		cooler.enderecos.add(new Endereco("Parque Boturussu", "Rua N�lio Batista Guimar�es, n� 183"));
		cooler.enderecos.add(new Endereco("Vila Zat", "Rua Vig�rio God�i, n� 480"));		
		
		LixoEletronico monitor = new LixoEletronico(
			"Monitor",
			"O disco r�gido, popularmente conhecido como HD (Hard Disk), � um dispositivo que � usado em computadores capaz de armazenar dados. Possui pl�stico e metais que podem ser reciclados."
		);
		monitor.categoriasLixo.add(new Categoria("Vidro"));
		monitor.categoriasLixo.add(new Categoria("Pl�stico"));
		monitor.categoriasLixo.add(new Categoria("Metal"));
		monitor.enderecos.add(new Endereco("Vila Zat", "Rua Vig�rio God�i, n� 480"));
		monitor.enderecos.add(new Endereco("Liberdade", "Rua Jaceguai, N� 67 x Av. Liberdade"));
		
		LixoEletronico pilha = new LixoEletronico(
			"Pilha",
			"Pilhas ou c�lula voltaicas s�o dispositivos que transformam energia qu�mica em energia el�trica por meio de um sistema apropriado e montado para aproveitar o fluxo de el�trons provenientes de uma rea��o qu�mica de oxirredu��o. Devem ser recicladas em lugares espec�ficos."
		);	
		pilha.categoriasLixo.add(new Categoria("Metal"));
		pilha.categoriasLixo.add(new Categoria("Cobre"));
		pilha.enderecos.add(new Endereco("Liberdade", "Rua Jaceguai, N� 67 x Av. Liberdade"));
		pilha.enderecos.add(new Endereco("S�o Lucas", "Rua Flor�ncio Sanches, n� 307"));
		
		LixoEletronico bateria = new LixoEletronico(
			"Bateria",
			"Uma bateria � um aparelho ou dispositivo que transforma em corrente el�trica a energia desenvolvida numa rea��o qu�mica. Cada c�lula de uma bateria cont�m um terminal positivo e um terminal negativo. O processo qu�mico de troca de el�trons � conhecido como oxirredu��o. Devem ser recicladas em lugares espec�ficos."
		);
		bateria.categoriasLixo.add(new Categoria("Metal"));
		bateria.categoriasLixo.add(new Categoria("L�tio"));
		bateria.enderecos.add(new Endereco("S�o Lucas", "Rua Flor�ncio Sanches, n� 307"));
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
					"Ol� Recycler, escolha uma op��o:\n" + 
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
									+ "\nEndere�os: " + end + 
									"Caso o descarte n�o seja vi�vel, voc� pode recorrer � coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Pl�stico, Org�nico, Metal, Recicl�vel) e contribuindo com a preserva��o do meio ambiente.\n\n"						
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
									+ "\nEndere�os: " + end + 
									"Caso o descarte n�o seja vi�vel, voc� pode recorrer � coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Pl�stico, Org�nico, Metal, Recicl�vel) e contribuindo com a preserva��o do meio ambiente.\n\n"						
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
									+ "\nEndere�os: " + end + 
									"Caso o descarte n�o seja vi�vel, voc� pode recorrer � coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Pl�stico, Org�nico, Metal, Recicl�vel) e contribuindo com a preserva��o do meio ambiente.\n\n"						
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
									+ "\nEndere�os: " + end + 
									"Caso o descarte n�o seja vi�vel, voc� pode recorrer � coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Pl�stico, Org�nico, Metal, Recicl�vel) e contribuindo com a preserva��o do meio ambiente.\n\n"						
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
									+ "\nEndere�os: " + end + 
									"Caso o descarte n�o seja vi�vel, voc� pode recorrer � coleta domiciliar seletiva, separando seu lixo por categorias(Papel, Vidro, Pl�stico, Org�nico, Metal, Recicl�vel) e contribuindo com a preserva��o do meio ambiente.\n\n"						
					);
				break;		
			}
		} while(!opcao.equals("6"));
	}
}