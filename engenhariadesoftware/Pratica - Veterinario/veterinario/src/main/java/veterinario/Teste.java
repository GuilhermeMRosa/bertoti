package veterinario;

import org.junit.jupiter.api.Test;

class Teste {

    @Test
    void test() {
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setTelefone("99999-1234");
        maria.setEndereco("Rua das Flores, 123");

        System.out.println(maria.getNome());
        System.out.println(maria.getTelefone());
        System.out.println(maria.getEndereco());

        Animal rex = new Animal("Rex", "Cachorro", 5);
        System.out.println(maria.cadastrarAnimal(rex));

        Consulta consulta = new Consulta("12/11/2025", "Dr. João", 120.0);
        System.out.println(maria.agendarConsulta(rex, consulta));
    }
}
