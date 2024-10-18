package cursojava2024;

public class CopasDoMundo {

    // Método principal que executa o programa
    public static void main(String[] args) {
        // Define o ano da primeira Copa do Mundo
        int anoInicial = 1930;
        // Define o ano atual
        int anoAtual = 2024;

        System.out.println("Anos de ocorrência das Copas do Mundo:");

        // Estrutura for para iterar pelos anos, começando em 1930 e incrementando de 4 em 4
        for (int ano = anoInicial; ano <= anoAtual; ano += 4) {
            // Condição para ignorar os anos 1942 e 1946 (Segunda Guerra Mundial)
            if (ano == 1942 || ano == 1946) {
                continue; // Ignora esses anos e continua o loop
            }
            // Exibe o ano da Copa
            System.out.println("Copa do Mundo em " + ano);
        }
    }
}
