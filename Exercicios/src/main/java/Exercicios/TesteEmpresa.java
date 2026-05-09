package Exercicios;

public class TesteEmpresa {
    public static void main(String[] args) {
        // Instanciando a Empresa usando o construtor sem argumentos (padrão)
        Empresa empresa1 = new Empresa();
        System.out.println("Empresa criada sem argumentos:");
        empresa1.exibir();

        // Preenchendo os dados usando setters
        empresa1.setNome("Tech Solutions Ltda");
        empresa1.setEndereco("Avenida Paulista, 1000");
        empresa1.setCidade("São Paulo");
        empresa1.setEstado("SP");
        empresa1.setCep("01311-100");
        empresa1.setFone("(11) 3000-0000");

        System.out.println("Após preenchimento com setters:");
        empresa1.exibir();

        // Instanciando a Empresa usando o construtor com argumentos
        Empresa empresa2 = new Empresa(
            "Inovação Digital",
            "Rua das Flores, 500",
            "Rio de Janeiro",
            "RJ",
            "20000-000",
            "(21) 2500-0000"
        );

        System.out.println("Empresa criada com argumentos no construtor:");
        empresa2.exibir();

        // Modificando dados da empresa2
        empresa2.setEndereco("Avenida Atlântica, 2000");
        System.out.println("Após modificação do endereço:");
        empresa2.exibir();
    }
}
