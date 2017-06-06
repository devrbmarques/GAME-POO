package game;

public class Jogo {
	
	public Jogo() {};
	

	public void executaAcoesComuns(Personagem tipo){
		tipo.andar();
		tipo.guardarItem();
		tipo.usarItem();
	}
}
