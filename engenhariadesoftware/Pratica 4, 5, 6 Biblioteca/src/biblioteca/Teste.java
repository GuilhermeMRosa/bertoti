package biblioteca;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {			
				Cliente jorge = new Cliente();
				jorge.setNome("Jorge");
				jorge.setCpf("549.322.209.22");
				jorge.setIdade(25);
				
				
				System.out.println(jorge.getNome());
				
				
				Livro harryPotter = new Livro("Pedra Filosofal", "Fantasia");
				System.out.println(jorge.alugarLivro(jorge, harryPotter));
				
				
			}

		}
		
		
		


