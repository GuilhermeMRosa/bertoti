package veterinario;

class Teste {
    public static void main(String[] args){
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setTelefone("99999-1234");
        maria.setEndereco("Rua das Flores, 123");

        Animal rex = new Animal("Rex", "Cachorro", 5);
        System.out.println(maria.cadastrarAnimal(rex));

        Consulta consulta = new Consulta("12/11/2025", "Dr. João", 120.0);
        System.out.println(maria.agendarConsulta(rex, consulta));
    }
}
