package main.java.academia;

public class Main {
    public static void main(String[] args) {

        // Gerente
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setIdade(40);
        gerente.setSexo("M");
        gerente.setSalario(8000);
        gerente.setMatricula("G001");
        gerente.setNomeGerencia("Academia Central");

        // Vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setIdade(28);
        vendedor.setSexo("F");
        vendedor.setSalario(2500);
        vendedor.setMatricula("V001");
        vendedor.setValorVendas(15000);
        vendedor.setQntVendas(30);

        // Cliente
        ClienteEmpresa cliente = new ClienteEmpresa();
        cliente.setNome("João");
        cliente.setIdade(22);
        cliente.setSexo("M");
        cliente.setValorDivida(200);
        cliente.setAnoNascimento(2002);

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Cliente: " + cliente.getNome());
    }
}