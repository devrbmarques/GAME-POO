package game;
import javax.swing.JOptionPane;

public class Mago extends Personagem implements ComportamentoMagico,ComportamentoNormal {
	
	public Mago(String nome) {
		super(nome);
	}

	public void andar()	{
		JOptionPane.showMessageDialog(null, "O mago"+super.nome+" andou");
	}
	
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O mago"+super.nome+" guardou o item");
	}
	
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O mago"+super.nome+" esta usando o item");
	}

	@Override
	public void invisibilidade() {
		JOptionPane.showMessageDialog(null, "O mago"+super.nome+" se tornou invisivel");
	}

	@Override
	public void ultraRapidez() {
		JOptionPane.showMessageDialog(null, "O mago"+super.nome+" esta mais rapido que a luz!!!");
	}
	
	
}
