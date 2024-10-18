package java2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSoma extends JFrame implements ActionListener {

    // Componentes da interface
    private JTextField campoNumero1, campoNumero2;
    private JButton btnSomar;
    private JLabel resultadoLabel;

    public CalculadoraSoma() {
        // Configurações da janela
        setTitle("Calculadora de Soma");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Campo para o primeiro número
        campoNumero1 = new JTextField(10);
        campoNumero1.setFont(new Font("Arial", Font.PLAIN, 16));
        add(new JLabel("Número 1:"));
        add(campoNumero1);

        // Campo para o segundo número
        campoNumero2 = new JTextField(10);
        campoNumero2.setFont(new Font("Arial", Font.PLAIN, 16));
        add(new JLabel("Número 2:"));
        add(campoNumero2);

        // Botão para somar
        btnSomar = new JButton("Somar");
        btnSomar.setFont(new Font("Arial", Font.BOLD, 16));
        btnSomar.addActionListener(this);
        add(btnSomar);

        // Label para exibir o resultado
        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(resultadoLabel);

        // Exibe a janela
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Obtém os valores dos campos de texto e converte para double
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            double resultado = num1 + num2;

            // Exibe o resultado no JLabel
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            // Exibe mensagem de erro se a entrada for inválida
            resultadoLabel.setText("Erro: Entrada inválida");
        }
    }

    // Método principal para executar a calculadora
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraSoma(); // Cria e exibe a calculadora
        });
    }
}
