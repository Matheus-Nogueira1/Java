package academia.exercicios;

public class Pessoa {
    private String nome;
    private Data dataAniversario;
    private String endereco;

    // Construtor com parâmetros
    public Pessoa(String nome, Data dataAniversario, String endereco) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }

    // Construtor sem parâmetros
    public Pessoa() {
        this.nome = "";
        this.dataAniversario = new Data();
        this.endereco = "";
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Data dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir dados
    public void exibir() {
        System.out.println("=== Dados da Pessoa ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Aniversário: " + dataAniversario.exibir());
        System.out.println("Endereço: " + endereco);
        System.out.println();
    }
}
