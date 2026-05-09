package Exercicios;

public class Contato extends Pessoa {
    private String telefone;
    private String email;

    // Construtor com parâmetros
    public Contato(String nome, Data dataAniversario, String endereco, String telefone, String email) {
        super(nome, dataAniversario, endereco);
        this.telefone = telefone;
        this.email = email;
    }

    // Construtor sem parâmetros
    public Contato() {
        super();
        this.telefone = "";
        this.email = "";
    }

    // Getters e Setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para exibir dados
    public void exibir() {
        super.exibir();
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println();
    }
}
