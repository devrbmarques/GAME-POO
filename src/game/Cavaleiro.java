package game;
import javax.swing.JOptionPane;

public class Cavaleiro extends Personagem implements ComportamentoHeroico, ComportamentoNormal {
	
	public Cavaleiro(String nome) {
		super(nome);
	}

	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" esta usando o machado");
	}
	
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" guardou o machado");
	}
	
	public void andar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" andou");
	}
	
	@Override
	public void atacar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" atacou");
	}

	@Override
	public void defender() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" defendeu");
	}

	@Override
	public void saltar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+super.nome+" saltou");
	}
}

