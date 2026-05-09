package Exercicios;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private double valor;

    // Construtor que inicializa os dados
    public Veiculo(String modelo, String marca, int ano, String cor, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para calcular valor com 5% de acréscimo
    public double getValorComAcrescimo() {
        return valor * 1.05;
    }

    // Método para exibir dados do veículo
    public void exibir() {
        System.out.println("=== Dados do Veículo ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor Original: R$ " + String.format("%.2f", valor));
        System.out.println("Valor com 5% de acréscimo: R$ " + String.format("%.2f", getValorComAcrescimo()));
        System.out.println();
    }
}
