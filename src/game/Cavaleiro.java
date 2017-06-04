package game;

public class Cavaleiro extends Personagem implements ComportamentoHeroico,ComportamentoNormal {
	
	public Cavaleiro(String nome){
		super(nome);
	}

	
	public void usarItem(){
		System.out.println("O cavaleiro:"+super.nome+"\\"+"esta usando o usando o item");
	}
	
	public void guardaItem(){
		System.out.println("O cavaleiro:"+super.nome+"\\"+"esta guardando usando o item");
		
	}
	
	public void andar(){
		System.out.println("O cavaleiro:"+super.nome+"\\"+"andou");
	}
	
	
	@Override
	public void atacar() {
	
		System.out.println("O cavaleiro:"+super.nome+"atacou");
	}

	@Override
	public void defender() {
	
		System.out.println("O cavaleiro:"+super.nome+"defendeu");
	}

	@Override
	public void saltar() {
	
		System.out.println("O cavaleiro:"+super.nome+"se defendeu");
	}
}

