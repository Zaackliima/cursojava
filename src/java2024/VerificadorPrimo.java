package java2024;

import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        // 1. Criando a estrutura básica do programa
        Scanner scanner = new Scanner(System.in);
        
        // 2. Declarando a variável 'numero'
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        // 3. Contando o número de divisores
        int contadorDivisores = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }
        
        // 4. Verificando se o número é primo
        if (contadorDivisores > 2) {
            System.out.println(numero + " não é um número primo.");
        } else {
            System.out.println(numero + " é um número primo.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
        //

	}

}
