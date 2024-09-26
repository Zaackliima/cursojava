package cursojava2024;

public class atividade1 {
	import java.util.Scanner;

	public class Palindromo {
	    
	    // Função para verificar se uma palavra é palíndromo
	    public static boolean verificarPalindromo(String palavra) {
	        // Remove espaços e converte para minúsculas
	        palavra = palavra.replace(" ", "").toLowerCase();
	        
	        // Variável para armazenar a palavra invertida
	        String invertida = new StringBuilder(palavra).reverse().toString();
	        
	        // Verifica se a palavra é igual à sua inversa
	        return palavra.equals(invertida);
	    }

	    public static void main(String[] args) {
	        // Scanner para obter a entrada do usuário
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicita ao usuário que digite uma palavra
	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();
	        
	        // Verifica se a palavra é um palíndromo e exibe o resultado
	        if (verificarPalindromo(palavra)) {
	            System.out.println("\"" + palavra + "\" é um palíndromo!");
	        } else {
	            System.out.println("\"" + palavra + "\" não é um palíndromo.");
	        }
	        
	        // Fecha o scanner
	        scanner.close();
	    }
	}

}
