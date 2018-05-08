package escola;

public class Aluno {
	private String nome;
	private Integer matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Aluno(String nome, Integer matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

}
