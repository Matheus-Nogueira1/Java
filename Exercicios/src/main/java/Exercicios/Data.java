package Exercicios;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor com parâmetros
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor sem parâmetros que inicializa com a data atual do sistema
    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    // Getters e Setters para dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    // Getters e Setters para mês
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Getters e Setters para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir a data no formato DD/MM/YYYY
    public String exibir() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    // Método para editar a data com JOptionPane
    public void editar() {
        try {
            String diaStr = JOptionPane.showInputDialog("Digite o dia (1-31):", dia);
            if (diaStr != null) {
                int novoDia = Integer.parseInt(diaStr);
                if (novoDia >= 1 && novoDia <= 31) {
                    this.dia = novoDia;
                } else {
                    JOptionPane.showMessageDialog(null, "Dia inválido!");
                }
            }

            String mesStr = JOptionPane.showInputDialog("Digite o mês (1-12):", mes);
            if (mesStr != null) {
                int novoMes = Integer.parseInt(mesStr);
                if (novoMes >= 1 && novoMes <= 12) {
                    this.mes = novoMes;
                } else {
                    JOptionPane.showMessageDialog(null, "Mês inválido!");
                }
            }

            String anoStr = JOptionPane.showInputDialog("Digite o ano:", ano);
            if (anoStr != null) {
                int novoAno = Integer.parseInt(anoStr);
                if (novoAno > 0) {
                    this.ano = novoAno;
                } else {
                    JOptionPane.showMessageDialog(null, "Ano inválido!");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.");
        }
    }

    // Método para visualizar a data com JOptionPane
    public void visualizar() {
        JOptionPane.showMessageDialog(null, "Data: " + exibir());
    }
}
