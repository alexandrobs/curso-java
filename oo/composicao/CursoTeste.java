package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Ana");
		
		Curso curso1 = new Curso("Android");
		Curso curso2 = new Curso("Java");
		Curso curso3 = new Curso("SQL");
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso2);
		
		curso1.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou no curso 1 " + "Nomes: " + aluno.nome);
		}
		
		for(Aluno aluno : curso2.alunos) {
			System.out.println("Estou no curso 2 " + "Nomes: " + aluno.nome);
		}
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou no curso 3 " + "Nomes: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("android");
		
		if (cursoEncontrado != null) {
		System.out.println(cursoEncontrado.nome);
		System.out.println(cursoEncontrado.alunos);
		}
	}

}
