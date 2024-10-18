package cursojava2024;

public class ArrayFrutas {
private String nome;
private String cor;
private double peso; // em gramas


//Constutor da classe Frutas:
	public ArrayFrutas( String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
	//Métodos para acessar os atributos:
			//Acessando o nome;
			public String getNome() {
				return nome;
			}
	//Acessando o Peso:
			public double getPeso() {
				return peso;
				
			}
	//Método para imprimir as informações das frutas:
			public void imprimirInfos() {
				System.out.println("Fruta:" + nome + ", Cor:" + cor + ",Peso: " + peso + " g");
			}
			
			public class Main {
			
	public static void main(String[] args) {
	//criação de um array de Objetos de classe ArrayFrutas:
		ArrayFrutas[] arrayFrutas = {
				new ArrayFrutas("Maçã", "Vermelha", 150.5);
				new ArrayFrutas("Banana", "Vermelha", 125.5);
				new ArrayFrutas("Laranja", "Laranja", 180);
			    new	ArrayFrutas("Banana", "Vermelha", 125.5);
		
		
		
		};
	}
		
		
		
		
		
	
	}
}
