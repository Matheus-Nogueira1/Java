package academia.exercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContato extends JFrame {
    private JTextField nomeField;
    private JTextField diaField;
    private JTextField mesField;
    private JTextField anoField;
    private JTextField enderecoField;
    private JTextField telefoneField;
    private JTextField emailField;
    private JTextArea areaExibicao;
    private Contato contato;

    public TelaContato() {
        // Configurações da janela
        setTitle("Gerenciador de Contatos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel de entrada de dados
        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new GridLayout(8, 2, 5, 5));
        painelEntrada.setBorder(BorderFactory.createTitledBorder("Dados do Contato"));

        // Campos de entrada
        painelEntrada.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        painelEntrada.add(nomeField);

        painelEntrada.add(new JLabel("Dia de Aniversário:"));
        diaField = new JTextField();
        painelEntrada.add(diaField);

        painelEntrada.add(new JLabel("Mês:"));
        mesField = new JTextField();
        painelEntrada.add(mesField);

        painelEntrada.add(new JLabel("Ano:"));
        anoField = new JTextField();
        painelEntrada.add(anoField);

        painelEntrada.add(new JLabel("Endereço:"));
        enderecoField = new JTextField();
        painelEntrada.add(enderecoField);

        painelEntrada.add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        painelEntrada.add(telefoneField);

        painelEntrada.add(new JLabel("Email:"));
        emailField = new JTextField();
        painelEntrada.add(emailField);

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDados();
            }
        });
        painelBotoes.add(btnSalvar);

        JButton btnExibir = new JButton("Exibir");
        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirDados();
            }
        });
        painelBotoes.add(btnExibir);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
        painelBotoes.add(btnLimpar);

        // Área de exibição de dados
        areaExibicao = new JTextArea();
        areaExibicao.setEditable(false);
        areaExibicao.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(areaExibicao);
        scroll.setBorder(BorderFactory.createTitledBorder("Visualização de Dados"));

        // Adicionando componentes à janela
        add(painelEntrada, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        // Inicializando um contato vazio
        contato = new Contato();

        setVisible(true);
    }

    private void salvarDados() {
        try {
            String nome = nomeField.getText();
            int dia = Integer.parseInt(diaField.getText());
            int mes = Integer.parseInt(mesField.getText());
            int ano = Integer.parseInt(anoField.getText());
            String endereco = enderecoField.getText();
            String telefone = telefoneField.getText();
            String email = emailField.getText();

            if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!", 
                    "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Data dataAniversario = new Data(dia, mes, ano);
            contato = new Contato(nome, dataAniversario, endereco, telefone, email);

            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", 
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida! Digite números para data.", 
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exibirDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Dados do Contato ===\n");
        sb.append("Nome: ").append(contato.getNome()).append("\n");
        sb.append("Data de Aniversário: ").append(contato.getDataAniversario().exibir()).append("\n");
        sb.append("Endereço: ").append(contato.getEndereco()).append("\n");
        sb.append("Telefone: ").append(contato.getTelefone()).append("\n");
        sb.append("Email: ").append(contato.getEmail()).append("\n");

        areaExibicao.setText(sb.toString());
    }

    private void limparCampos() {
        nomeField.setText("");
        diaField.setText("");
        mesField.setText("");
        anoField.setText("");
        enderecoField.setText("");
        telefoneField.setText("");
        emailField.setText("");
        areaExibicao.setText("");
        contato = new Contato();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaContato();
            }
        });
    }
}
