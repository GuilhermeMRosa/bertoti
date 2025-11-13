package veterinario;

public class Consulta {

    private String data;
    private String veterinario;
    private double valor;

    public Consulta(String data, String veterinario, double valor) {
        this.data = data;
        this.veterinario = veterinario;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public double getValor() {
        return valor;
    }
}
