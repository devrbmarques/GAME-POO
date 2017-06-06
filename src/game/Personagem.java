package game;

public abstract class Personagem implements ComportamentoNormal {

	protected String nome;

	public Personagem(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void andar();
	public abstract void guardarItem();
	public abstract void usarItem();

}