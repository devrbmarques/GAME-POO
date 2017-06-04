package game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Personagem> personagem = new ArrayList<Personagem>();
		Dragao dr1 = new Dragao("Srket");
		Dragao dr2 = new Dragao("Felps");
		Mago m1 = new Mago("O fantastico mago");
		Mago m2 = new Mago("O magoImpacavel");
		Cavaleiro cav1 = new Cavaleiro("Lothric");
		Cavaleiro cav2 =  new Cavaleiro("Goku");
		personagem.add(cav1);
		personagem.add(cav2);
		personagem.add(m1);
		personagem.add(m2);
		personagem.add(dr1);
		personagem.add(dr2);
		
		Jogo Dk = new Jogo("dd");
		
		
		for(Personagem perso:personagem){
			if(perso instanceof Cavaleiro)
			{
				Cavaleiro cav = (Cavaleiro) perso;
				Dk.ExecutaAcoesComuns(cav);
			
			}
			for(Personagem per:personagem){
				if(per instanceof Mago)
				{
					Mago mags = (Mago) per;
					Dk.ExecutaAcoesComuns(mags);
				}
			}
			
			for(Personagem pir:personagem)
			{
				if(pir instanceof Dragao)
				{
					Dragao drags = (Dragao) pir;
					Dk.ExecutaAcoesComuns(drags);
				}
			}
			
		
		Personagem p = new Mago("Salamin");
		((Mago)p).invisibilidade();
		
	}

  }
	
}

