package game;

public class Mago extends Personagem implements ComportamentoMagico,ComportamentoNormal {
	
	public Mago(String nome){
		super(nome);
	}

	public void andar(){
		System.out.println("O mago:"+super.nome+"\\"+"o esta andando");
	}
	
	public void guardaItem(){
		System.out.println("O mago:"+super.nome+"\\"+"esta guardando o item");
	}
	
	public void usarItem(){
		System.out.println("O mago:"+super.nome+"\\"+"esta usando o usando o item");
	}

	@Override
	public void invisibilidade() {
	
		System.out.println("O mago:"+super.nome+"esta invisivel");
	}

	@Override
	public void ultraRapidez() {
	
		System.out.println("O mago:"+super.nome+"\\"+"esta mais rapido que the flash");
	}
	
	
}
