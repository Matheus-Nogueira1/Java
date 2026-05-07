package academia.exercicios;

public class TesteCirculo {
    public static void main(String[] args) {
        // Criando um círculo com raio 5
        Circulo circulo = new Circulo(5);
        
        System.out.println("Círculo criado com raio 5:");
        circulo.exibir();

        // Aumentando o raio em 20%
        System.out.println("Aumentando o raio em 20%...");
        circulo.aumentarRaio(20);
        circulo.exibir();

        // Criando outro círculo
        Circulo circulo2 = new Circulo(10);
        System.out.println("Novo círculo com raio 10:");
        circulo2.exibir();

        // Aumentando o raio em 50%
        System.out.println("Aumentando o raio em 50%...");
        circulo2.aumentarRaio(50);
        circulo2.exibir();
    }
}
