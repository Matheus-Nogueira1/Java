package academia.exercicios;

public class Circulo {
    private double raio;

    // Construtor que recebe o raio como argumento
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter
    public double getRaio() {
        return raio;
    }

    // Setter
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double getArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular a circunferência do círculo
    public double getCircunferencia() {
        return 2 * Math.PI * raio;
    }

    // Método para aumentar o raio por um percentual
    public void aumentarRaio(double percentual) {
        this.raio = raio + (raio * percentual / 100);
    }

    // Método para exibir os dados do círculo
    public void exibir() {
        System.out.println("=== Dados do Círculo ===");
        System.out.println("Raio: " + String.format("%.2f", raio));
        System.out.println("Área: " + String.format("%.2f", getArea()));
        System.out.println("Circunferência: " + String.format("%.2f", getCircunferencia()));
        System.out.println();
    }
}
