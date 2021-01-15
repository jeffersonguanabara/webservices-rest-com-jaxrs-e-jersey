package br.com.alura.loja.modelo;

public class Projeto {

	private String nome;
	private long id;
	private int anoDeInicio;
	
	public Projeto() {
		super();
	}
	
	public Projeto(long id, String nome, int anoDeInicio) {
		super();
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}
}
