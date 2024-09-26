package cursojava2024;

import java.util.Scanner;

public class Atividade2 {
	 // Função para contar o número de vogais em uma frase
    public static int contarVogais(String frase) {
        int contagem = 0;
        String vogais = "aeiou";
        
        // Converte a frase para letras minúsculas
        frase = frase.toLowerCase();
        
        // Percorre cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            // Verifica se o caractere é uma vogal
            if (vogais.indexOf(letra) != -1) {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        // Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        // Chama a função e exibe o número de vogais
        int quantidadeVogais = contarVogais(frase);
        System.out.println("A frase contém " + quantidadeVogais + " vogais.");
        
        // Fecha o scanner
        scanner.close();
    }
}

