package veterinario;

public class Cliente {

    private String nome;
    private String telefone;
    private String endereco;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String cadastrarAnimal(Animal animal) {
        return "O cliente " + nome + " cadastrou o animal " + animal.getNome() + " (" + animal.getEspecie() + ")";
    }

    public String agendarConsulta(Animal animal, Consulta consulta) {
        return "Consulta marcada para o animal " + animal.getNome() + " com o veterinário "
                + consulta.getVeterinario() + " na data " + consulta.getData();
    }
}
