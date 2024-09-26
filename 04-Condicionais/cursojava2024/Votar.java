package cursojava2024;
import java.util.Scanner;

public class Votar {  // A classe deve ter o mesmo nome do arquivo
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa tem idade para dirigir
        if (idade >= 18) {
            System.out.println("Você tem idade para dirigir.");
        } else {
            System.out.println("Você não tem idade para dirigir.");
        }

        // Fecha o scanner
        scanner.close();
    }
}