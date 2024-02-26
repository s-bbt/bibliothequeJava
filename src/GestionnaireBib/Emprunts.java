package GestionnaireBib;

public class Emprunts {
		Usager usager;
		Livre livre;
	
	public Emprunts (Usager usager, Livre livre) {
		this.setUsager(usager);
		this.setLivre(livre);
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Usager getUsager() {
		return usager;
	}

	public void setUsager(Usager usager) {
		this.usager = usager;
	}
	
	@Override
	public String toString() { 
		return this.getUsager() + "\nEmprunts : " + this.getLivre();
	}
}
