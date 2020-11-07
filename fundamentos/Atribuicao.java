package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = a + b;
		
		c += b;
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		c =- b;
		
		System.out.println(c);
		
		c *= b;
		
		System.out.println(c);
		
		c /= b;
		
		System.out.println(c);
		
		c %= b;
		
		System.out.println(c);

	}

}
