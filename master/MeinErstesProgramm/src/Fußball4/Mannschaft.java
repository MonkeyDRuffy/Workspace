package Fuﬂball4;

import java.util.ArrayList;

public class Mannschaft {

	private String name;
	private Trainer trainer;
	private Torwart torwart;
	private ArrayList<Spieler> kader;

	public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> kader) {
		
		this.name = name;
		this.trainer = trainer;
		this.torwart = torwart;
		this.kader = kader;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Torwart getTorwart() {
		return torwart;
	}

	public void setTorwart(Torwart torwart) {
		this.torwart = torwart;
	}

	public ArrayList<Spieler> getKader() {
		return kader;
	}

	public void setKader(ArrayList<Spieler> kader) {
		this.kader = kader;
	}



}


