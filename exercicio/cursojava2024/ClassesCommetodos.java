package cursojava2024;

public class ClassesCommetodos {
	//Método 01 : calcula a soma de 2 numeros:
		public int soma( int a, int b ) {	
		return a + b;
		}
		
		//Metodo 02: Verificar se 1 numero é par
		public boolean ehPar(int numero) {
			return numero % 2 == 0;
		}
		
		//Metodo 03: inverter String:
		public String inversao (String texto) {
			return new StringBuilder(texto).reverse().toString();
		}
		
		//Metodo 04: calcula o fatorial de um numero:
		public int fatorial(int numero) {
			if ( numero == 0 || numero == 1) {
				return 1;
			}
			return numero * fatorial(numero - 1);
		}
		
		
		
		public static void main(String[] args) {
	//instanciando a classe:
			ClassesCommetodos utilidades = new ClassesCommetodos();
			//chamando metodos:
//			System.out.println("A Soma de 5 e 3 é: "+ utilidades.soma(656435,  2101563 ));
//			("O numero 17 é par?:" + utilidades.ehPar(17));
	
	
	System.out.println(utilidades.inversao("EU AMO PROGRAMACIONES KKKKKKKKKK"));
	
	
		System.out.println("Fatorial de 5 é: "+ utilidades.fatorial(5));
		
		
		}
}
