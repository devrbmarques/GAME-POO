package game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Personagem> personagem = new ArrayList<Personagem>();
		Dragao dragon1 = new Dragao("Krieger");
		Dragao dragon2 = new Dragao("Showei");
		Mago mago1 = new Mago("O fantastico mago");
		Mago mago2 = new Mago("O magoImpacavel");
		Cavaleiro cavaleiro1 = new Cavaleiro("Seiya");
		Cavaleiro cavaleiro2 =  new Cavaleiro("Goku");
		personagem.add(cavaleiro1);
		personagem.add(cavaleiro2);
		personagem.add(mago1);
		personagem.add(mago2);
		personagem.add(dragon1);
		personagem.add(dragon2);
		
		Jogo gameDuelo = new Jogo();
		
		
		for(Personagem personaC:personagem)
		{
			if(personaC instanceof Cavaleiro)
			{
				Cavaleiro cav = (Cavaleiro) personaC;
				gameDuelo.executaAcoesComuns(cav);
			
			}
			
			for(Personagem personaM:personagem)
			{
				if(personaM instanceof Mago)
				{
					Mago mags = (Mago) personaM;
					gameDuelo.executaAcoesComuns(mags);
				}
			}
			
			for(Personagem personaD:personagem)
			{
				if(personaD instanceof Dragao)
				{
					Dragao drags = (Dragao) personaD;
					gameDuelo.executaAcoesComuns(drags);
				}
			}
		
			Personagem p = new Mago("Salamin");
			((Mago)p).invisibilidade();
		
		}
  }
}

