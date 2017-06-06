package game;

import javax.swing.JOptionPane;

public class Dragao extends Personagem implements ComportamentoNormal {
	
	public Dragao(String nome) {
		super(nome);
	}
	
	public void atiraFogo() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" esta cuspindo fogo!");
	}
	
	public void voar() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" esta voando!");
	}
	
	public void moder() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" acabou de morder os cavaleiros.");
	}
	
	public void andar() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" andou.");
	}
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" guardou o item.");
	}
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O Dragao"+super.nome+" esta usando o item.");
	}
}
