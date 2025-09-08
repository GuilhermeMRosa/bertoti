package biblioteca;

public class Livro {


	public String nome;
	public String tipo;
	
	
	public Livro(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}

}