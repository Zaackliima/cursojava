package cursojava2024;

public class Trabalhandocomstrings2 {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		String texto = "Bem vindo ao curso de JAVA";
		String texto2 = "Vamos Aprender String";
		
		//1.comprimento da string:
		String nome = "Isac de Lima Pereira";
		System.out.println("Comprimento da String: "+texto.length());
		
		//2.concatenar strings
		String textoCompleto = texto + " "+ texto2;
		System.out.println("Text Completo: " + textoCompleto);
		//String nome2 = "Isac";
		
	//.3	
		System.out.println("MAIUSCULAS:"+ texto.toUpperCase());
		System.out.println("minusculas:"+ texto.toLowerCase());
		
		//4.substituir uma parte da string:
	String novotexto = texto.replace("Java", "Vitoria");
		
		//5.buscar por uma sub string:
	int posicao = texto.indexOf("curso");
	System.out.println("posição da palavra 'curso': "+ posicao);
		
//6.  Verificar se uma string começa ou termina ou termina com 1 substring:
	System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
	System.out.println("Começa com 'Bem': " + texto.endsWith("java"));
	
	
	//7. Dividir string:
	String[] palavras = textoCompleto.split(" ");
	System.out.println("Palavrfas no texto completo");
	for  ( String palavra : palavras) {
		System.out.println(palavra);
	}
	
	//8 remover espaços em branco:
	String textoComespaços = "   Texto com espaços    ";
	System.out.println("texto sem espaços: '"+ textoComEspacos.trim()+ "'");
	}

}
