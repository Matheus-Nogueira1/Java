package academia.exercicios;

public class TesteData {
    public static void main(String[] args) {
        // Criando uma data com parâmetros
        Data data1 = new Data(15, 8, 1990);
        System.out.println("Data criada com parâmetros: " + data1.exibir());

        // Criando uma data com a data atual do sistema
        Data data2 = new Data();
        System.out.println("Data atual do sistema: " + data2.exibir());

        // Modificando valores usando setters
        data1.setDia(25);
        data1.setMes(12);
        data1.setAno(2000);
        System.out.println("Data após modificação: " + data1.exibir());

        // Acessando valores usando getters
        System.out.println("\nAcessando valores da data1:");
        System.out.println("Dia: " + data1.getDia());
        System.out.println("Mês: " + data1.getMes());
        System.out.println("Ano: " + data1.getAno());

        // Usando JOptionPane para editar a data
        System.out.println("\nPara editar a data com interface gráfica, descomente a linha abaixo:");
        // data1.editar();
        // data1.visualizar();
    }
}
