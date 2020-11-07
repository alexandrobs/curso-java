package fundamentos;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
//		int idade = 18;
//		if(idade < 12) {
//			System.out.println("Criança");
//		}else if(idade >= 12 && idade < 18) {
//			System.out.println("Adolescente");
//		}else {
//			System.out.println("Adulto");
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("\nDigite a sua opção no menu: \n");
//		System.out.println("1 suporte\n2 assinaturas\n3 atendimento\n4 faturas\n");
//		int digitoUsuario = scan.nextInt();
//		
//		switch (digitoUsuario) {
//		case 1:
//			System.out.println("Suporte técnico");
//			break;
//		case 2:
//			System.out.println("Assinaturas e tv a cabo");
//			break;
//		case 3:
//			System.out.println("Falar diretamente com um atendente");
//			break;
//		case 4:
//			System.out.println("2ª via de fatura");
//			break;
//		default :
//			System.out.println("Opção digitada inválida");
//		}
//		
//		System.out.println("\nProfessor digite a nota do Aluno:\n ");
//		int notaDoAluno = scan.nextInt();
//		scan.close();
//		
//		switch(notaDoAluno) {
//		case 10:
//		case 9:
//			System.out.println("Ótimo");
//			break;
//		case 8:
//			System.out.println("Bom");
//			break;
//		case 7:
//			System.out.println("Regular");
//			break;
//		case 6:
//		case 5:
//		case 4:
//		case 3:
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("Ruim");
//			break;
//		default:
//			System.out.println("Digite uma nota válida entre 0 a 10");
//		}
//		
//		//int a = 1;
//		
//		/*
//		 * while(a < 1) { a++; System.out.println("\na: " + a); }
//		 */
//		
//		//Não descomente esse código, loop infinito
////		while(true) {
////			System.out.println("Vou morrer de executar pro resto da vida");
////		}
//		
//		int x = 0;
//		while (x < 5) {
//			System.out.println("Execute");
//			x++;
//		}
//		
//		String[] postagens = new String[10];
//		postagens[0] = "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
//		postagens[1] = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//		postagens[2] = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
//		postagens[3] = "ccccccccccccccccccccccccccccccccccccc";
//		postagens[4] = "ddddddddddddddddddddddddddddddddddddd";
//		postagens[5] = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
//		postagens[6] = "fffffffffffffffffffffffffffffffffffff";
//		postagens[7] = "ggggggggggggggggggggggggggggggggggggg";
//		postagens[8] = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
//		postagens[9] = "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
//		
//		int i=0;
//		while(i < postagens.length) {
//			System.out.println("\nPosts: "+ postagens[i]);
//			i++;
//		}
		
//		int num = 12;
//		
//		do {
//			System.out.println(num);
//		}
//		
//		while (num < 10);
//		System.out.println(num);
//		//num = num +1;
		
		String[] nomes = new String[2];
		nomes[0] = "alex";
		nomes[1] = "sofia";
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("for: " + nomes[i]);
		}
	}

}