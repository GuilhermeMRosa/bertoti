package biblioteca;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	
	public Cliente() {
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String alugarLivro(Cliente cliente ,Livro livro) {
		return ("Parabens " + cliente.getNome() + " voce alugou o livro " + livro.getNome() + " do tipo " + livro.getTipo());
		
	}
	
	
	
	
	
}

