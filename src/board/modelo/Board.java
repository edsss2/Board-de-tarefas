package board.modelo;

public class Board {

	private String nome;
	private Integer id;
	
	public Board(String nome, Integer id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
