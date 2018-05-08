package escola;

import java.util.Scanner;

public class Turma {
	private String disciplina;
	private Aluno[] aluno;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	
	public Turma(String disciplina, int quantidade) {
		super();
		this.disciplina = disciplina;

		Aluno[] a = new Aluno[quantidade];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Aluno("João_"+i, 2000+i);
		}
		
		this.aluno = a;	
	}
	
	public void listarAlunos() {
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Aluno: "+this.aluno[i].getNome());	
		}
	}
	
	public void fazchamada() {
        Scanner t = new Scanner(System.in);
        String[] presenca = null;
        
        System.out.println("\n------ Alunos ------");
        this.listarAlunos();

		for (int i = 0; i < aluno.length; i++) {
			System.out.print(this.aluno[i].getNome()+" Presença: ");
            presenca[i] = t.nextLine();
		}
		
		for (int i = 0; i < presenca.length; i++) {
			System.out.println(this.aluno[i].getNome()+": "+ presenca[i]);
		} 
		
	}
	
	

	
}
