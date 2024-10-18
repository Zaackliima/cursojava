package cursojava2024;

import java.util.Scanner;

public class VerificaDiasMes {

    // Método principal que executa o programa
    public static void main(String[] args) {
        // Scanner para capturar o nome do mês fornecido pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do mês
        System.out.print("Digite o nome do mês: ");
        String mes = scanner.nextLine().toLowerCase(); // Converte a entrada para minúsculas para evitar problemas de diferenciação

        // Estrutura switch para verificar os dias de cada mês
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês escolhido tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês escolhido tem 28 ou 29 dias (dependendo se é ano bissexto).");
                break;
            default:
                System.out.println("Erro: Mês inválido.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
