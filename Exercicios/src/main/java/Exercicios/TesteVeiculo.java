package Exercicios;

public class TesteVeiculo {
    public static void main(String[] args) {
        // Criando um veículo usando o construtor
        Veiculo veiculo1 = new Veiculo("Civic", "Honda", 2023, "Prata", 120000.00);
        veiculo1.exibir();

        // Criando outro veículo
        Veiculo veiculo2 = new Veiculo("Corolla", "Toyota", 2022, "Branco", 95000.00);
        veiculo2.exibir();

        // Criando e modificando um veículo
        Veiculo veiculo3 = new Veiculo("Gol", "Volkswagen", 2021, "Preto", 65000.00);
        veiculo3.exibir();

        // Modificando dados do veículo
        System.out.println("Após modificação:");
        veiculo3.setValor(70000.00);
        veiculo3.setCor("Vermelho");
        veiculo3.exibir();
    }
}
