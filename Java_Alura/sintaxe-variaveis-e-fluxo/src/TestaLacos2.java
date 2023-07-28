public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {				
				System.out.print("*"); // Adiciona um espaço após cada resultado
			}
			System.out.println(); // Adiciona uma nova linha após cada tabuada
		}
		
	}
}
