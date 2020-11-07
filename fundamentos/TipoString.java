package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá boa tarde".charAt(2));
		
		String a = "Bom dia";//String é um tipo imutável em Java
		a = "boa tarde";//aqui estamos substituindo a String a e não alterando
		System.out.println(a);
		System.out.println(a.startsWith("boa"));
		System.out.println(a.endsWith("tardes"));
		System.out.println(a.equals("boa tarde"));
		System.out.println(a.length());
		System.out.println(a.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Alex";
		var sobrenome = "Silva";
		var idade = 34;
		var salario = 2000.00;
		
		System.out.println("Nome: " + nome
				+"\nSobrenome: " + sobrenome
				+"\nIdade: " + idade
				+"\nSalário: " + salario);
		
		System.out.printf("O senhor %s %s com a idade %d ganha R$%.2f", 
				nome, sobrenome, idade, salario);//ou
		System.out.println("\n");
		String frase = String.format("O senhor %s %s com a idade %d ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}
}
