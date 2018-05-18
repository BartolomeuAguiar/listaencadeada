package lista_encadeada;

import java.util.ArrayList;
import java.util.List;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro", 7);

		Aluno a2 = new Aluno("João", 12);

		Aluno a3 = new Aluno("Joaquin", 8);

		List alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);

		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = (Aluno) alunos.get(i);
			System.out.println("Nome: "+aluno.nome+", Idade: "+aluno.idade);
		}

	}

}
