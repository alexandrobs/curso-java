package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String y = "Bom dia"
				.replace("Bom", "Boa")
				.replace("dia", "noite")
				.toUpperCase()
				.concat(" !!!");
		System.out.println(y);
		
		//lembrando que tipos primitivos não tem operador ponto
	}

}
