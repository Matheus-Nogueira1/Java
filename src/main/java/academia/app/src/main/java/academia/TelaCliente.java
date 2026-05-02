package academia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCliente extends JFrame {

    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtTelefone;
    private JTextField txtPlano;
    private JButton btnCadastrar;

    public TelaCliente() {
        setTitle("Cadastro de Cliente - Academia");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Nome
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 20, 100, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 20, 180, 25);
        add(txtNome);

        // Idade
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(10, 60, 100, 25);
        add(lblIdade);

        txtIdade = new JTextField();
        txtIdade.setBounds(120, 60, 180, 25);
        add(txtIdade);

        // Telefone
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 100, 100, 25);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(120, 100, 180, 25);
        add(txtTelefone);

        // Plano
        JLabel lblPlano = new JLabel("Plano:");
        lblPlano.setBounds(10, 140, 100, 25);
        add(lblPlano);

        txtPlano = new JTextField();
        txtPlano.setBounds(120, 140, 180, 25);
        add(txtPlano);

        // Botão
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(100, 190, 120, 30);
        add(btnCadastrar);

        // Evento do botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Cliente cliente = new Cliente();

                    cliente.setNome(txtNome.getText());
                    cliente.setIdade(Integer.parseInt(txtIdade.getText()));
                    cliente.setTelefone(txtTelefone.getText());
                    cliente.setPlano(txtPlano.getText());

                    JOptionPane.showMessageDialog(null,
                            "Cliente cadastrado com sucesso!\n\n" +
                            "Nome: " + cliente.getNome() + "\n" +
                            "Idade: " + cliente.getIdade() + "\n" +
                            "Telefone: " + cliente.getTelefone() + "\n" +
                            "Plano: " + cliente.getPlano()
                    );

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Idade deve ser um número!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaCliente().setVisible(true);
    }
}