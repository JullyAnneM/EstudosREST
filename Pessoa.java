package helloworld;

import javax.persistence.*;

@Entity
public class Pessoa {
	
	@Id
	private int rg;
	private String nome;
	
	public Pessoa () {
		
	}
	
	public Pessoa(int rg, String nome) {
		super();
		this.rg = rg;
		this.nome = nome;
	}
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String junto = rg + ", " + nome;
		return junto;
	}
	
}
