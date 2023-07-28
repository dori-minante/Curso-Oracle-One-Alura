
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			//contador += 1;
			//contador = contador + 1;
			contador++; // Incrementa o contador a cada iteração do loop
		}
		System.out.println(contador);
	}
}
