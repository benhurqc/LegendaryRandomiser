package net.threedoubloons.legendaryrandomiser.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

import net.threedoubloons.legendaryrandomiser.R;

public enum Villain implements ICardBase {
	none(0, 0),
	skrulls(R.string.vil_skrulls, R.drawable.vil_skrulls),
	spiderfoes(R.string.vil_spiderfoes, R.drawable.vil_spiderfoes),
	enemiesOfAsgard(R.string.vil_frost_giants, R.drawable.vil_enemies_of_asgard),
	brotherhood(R.string.vil_brotherhood, R.drawable.vil_brotherhood),
	hydra(R.string.vil_hydra, R.drawable.vil_hydra),
	mastersOfEvil(R.string.vil_masters_of_evil, R.drawable.vil_masters),
	radiation(R.string.vil_radiation, R.drawable.vil_radiation),
	
	// Dark City
	emissariesOfEvil(R.string.vil_emissaries_of_evil, R.drawable.vil_emissaries, false, Sets.DarkCity),
	fourHorsemen(R.string.vil_four_horsemen, R.drawable.vil_4horsemen, false, Sets.DarkCity),
	marauders(R.string.vil_marauders, R.drawable.vil_marauders, false, Sets.DarkCity),
	mlf(R.string.vil_mlf, R.drawable.vil_mlf, false, Sets.DarkCity),
	streetsOfNY(R.string.vil_streets_ny, R.drawable.vil_streets_of_ny, false, Sets.DarkCity),
	underworld(R.string.vil_underworld, R.drawable.vil_underworld, false, Sets.DarkCity),
	
	//Fantastic Four
	heralds(R.string.vil_heralds, R.drawable.vil_heralds, false, Sets.FantasticFour),
	subterranea(R.string.vil_subterranea, R.drawable.vil_subterranea, false, Sets.FantasticFour),
	
	// Paint the Town Red
	maxCarnage(R.string.vil_max_carnage, R.drawable.vil_max_carnage, false, Sets.PaintRed),
	sinisterSix(R.string.vil_sinister_six, R.drawable.vil_sinister_six, false, Sets.PaintRed),
	
	// Villains
	avengers(R.string.vil_avengers, R.drawable.vil_avengers, false, Sets.Villains),
	defenders(R.string.vil_defenders, R.drawable.vil_defenders, false, Sets.Villains),
	marvelKnights(R.string.vil_marvelKnights, R.drawable.vil_marvelKnights, false, Sets.Villains),
	spiderFriends(R.string.vil_spider_friends, R.drawable.vil_spider_friends, false, Sets.DarkCity),
	uncannyAvengers(R.string.vil_uncanny_avengers, R.drawable.vil_uncanny_avengers, false, Sets.Villains),
	uncannyXmen(R.string.vil_uncanny_xmen, R.drawable.vil_uncanny_xmen, false, Sets.Villains),
	xmenFirstClass(R.string.vil_xmen1Class, R.drawable.vil_xmen1Class, false, Sets.Villains),


	handNinja(R.string.hen_hand_ninja, R.drawable.hen_hand_ninja, true),
	doombots(R.string.hen_doombots, R.drawable.hen_doombots, true),
	sentinel(R.string.hen_sentinel, R.drawable.hen_sentinel, true),
	mutates(R.string.hen_mutates, R.drawable.hen_mutates, true),
	
	//Dark city
	maggiaGoons(R.string.hen_goons, R.drawable.hen_goons, true, Sets.DarkCity),
	phalanx(R.string.hen_phalanx, R.drawable.hen_phalanx, true, Sets.DarkCity),
	
	//Villains
	asgardianWarrior(R.string.hen_asgardian_warrior, R.drawable.hen_asgardian_warrior, true, Sets.Villains),
	cops(R.string.hen_cops, R.drawable.hen_cops, true, Sets.Villains),
	multipleMan(R.string.hen_multiple_man, R.drawable.hen_multiple_man, true, Sets.Villains),
	assaultSquad(R.string.hen_assault_squad, R.drawable.hen_assault_squad, true, Sets.Villains),
	;
	
	private CardBase card;
	private boolean isHenchman;
	
	private Villain(int name, int pictureId) {
		this(name, pictureId, false, Sets.CoreSet);
	}

	private Villain(int name, int pictureId, boolean isHenchman) {
		this(name, pictureId, isHenchman, Sets.CoreSet);
	}
	
	private Villain(int name, int pictureId, boolean isHenchman, Sets set) {
		card = new CardBase(name, pictureId, set);
		this.isHenchman = isHenchman;
	}
	
	public CardBase getCard() {
		return card;
	}
	
	public boolean isHenchman() {
		return isHenchman;
	}
	

	public static Villain get(String name) {
		return Enum.valueOf(Villain.class, name);
	}

	private static List<Villain> allVillain;
	private static List<Villain> allHenchmen;
	public static void initialiseAllList(EnumSet<Sets> activeSets) {
		List<Villain> allV = new ArrayList<Villain>();
		List<Villain> allH = new ArrayList<Villain>();
		
		for (Villain v : values()) {
			if (activeSets.contains(v.card.getExpansion())) {
				if (v.isHenchman()) {
					allH.add(v);
				} else {
					allV.add(v);
				}
			}
		}
		
		allV.remove(none);
		allH.remove(none);
		
		Villain.allVillain = Collections.unmodifiableList(allV);
		Villain.allHenchmen = Collections.unmodifiableList(allH);
	}
	
	public static List<Villain> getAll() {
		return allVillain;
	}

	public static List<Villain> getAllHenchmen() {
		return allHenchmen;
	}
}
