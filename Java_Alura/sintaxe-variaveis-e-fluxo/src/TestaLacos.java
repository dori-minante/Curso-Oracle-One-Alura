
public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <=10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" "); // Adiciona um espaço após cada resultado
			}
			System.out.println(); // Adiciona uma nova linha após cada tabuada
		}
		
	}
}
