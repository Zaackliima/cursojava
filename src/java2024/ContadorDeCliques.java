package java2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorDeCliques extends JFrame implements ActionListener {

    // Variáveis para o contador e os componentes
    private int contador = 0;  // Inicializa o contador em 0
    private JLabel labelContador;  // JLabel para exibir o valor
    private JButton btnContar;  // JButton para incrementar o contador

    public ContadorDeCliques() {
        // Configurações da Janela
        setTitle("Contador de Cliques");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());  // Layout simples de fluxo

        // Criação do JLabel para mostrar o contador
        labelContador = new JLabel("Contador: " + contador);
        labelContador.setFont(new Font("Arial", Font.PLAIN, 24));  // Define fonte do JLabel
        add(labelContador);  // Adiciona o JLabel na janela

        // Criação do JButton para incrementar o contador
        btnContar = new JButton("Clique aqui");
        btnContar.setFont(new Font("Arial", Font.BOLD, 16));  // Define fonte do botão
        btnContar.addActionListener(this);  // Adiciona o ActionListener
        add(btnContar);  // Adiciona o JButton na janela

        // Torna a janela visível
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Incrementa o contador a cada clique no botão
        contador++;
        labelContador.setText("Contador: " + contador);  // Atualiza o JLabel com o novo valor
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ContadorDeCliques();  // Cria e exibe a janela da calculadora
        });
    }
}
