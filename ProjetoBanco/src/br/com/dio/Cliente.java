package br.com.dio;

public class Cliente {
	
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
		System.out.println("O cliente "+nome+" foi criado.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("O nome foi alterado.");
	}
	

}
