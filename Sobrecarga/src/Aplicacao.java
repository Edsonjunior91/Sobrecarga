
public class Aplicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20);
		System.out.println(soma);
		
		int soma2 = m.somar(10, 20, 30);
		System.out.println(soma2);
		
		double somaDouble = m.somar(10.2, 45.6);
			System.out.println(somaDouble);
		

	}

}
