package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {

	private String nome;
	private long id;
	private int anoDeIninio;
	
	public Projeto() {
		super();
	}

	public Projeto(long id, String nome, int anoDeIninio) {
		super();
		this.nome = nome;
		this.id = id;
		this.anoDeIninio = anoDeIninio;
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

	public int getAnoDeIninio() {
		return anoDeIninio;
	}
	
	public String toXML() {
		return new XStream().toXML(this);
	}

	public String toJson() {
		return new Gson().toJson(this);
	}
}
