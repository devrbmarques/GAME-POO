package game;

public class Dragao extends Personagem implements ComportamentoNormal {
	
	public Dragao(String nome)
	{
		super(nome);
	}
	
	public void atiraFogo(){
		System.out.println("O Dragao:"+super.nome+"esta atirando fogo em todo mundo");
	}
	
	public void voar(){
		System.out.println("O Dragao:"+super.nome+"\\"+"esta voando");
	}
	
	public void moder(){
		System.out.println("O Dragao:"+super.nome+"modeu com os cavaleiros de Lothric");
	}
	
	public void andar()
	{
		System.out.println("O Dragao:"+super.nome+"\\"+"esta andando");
	}
	public void guardaItem(){
		System.out.println("O Dragao:"+super.nome+"\\"+"esta Guardando o item");
	}
	public void usarItem(){
		System.out.println("O Dragao:"+super.nome+"\\"+"esta usando o item");
	}
}
