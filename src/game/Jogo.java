package game;

public class Jogo {
	
	
	private String nome;
	public Jogo(String nome){
		this.nome = nome;
	};
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void ExecutaAcoesComuns(Personagem tipo){
		tipo.andar();
		tipo.guardaItem();
		tipo.usarItem();

	}
	
}
