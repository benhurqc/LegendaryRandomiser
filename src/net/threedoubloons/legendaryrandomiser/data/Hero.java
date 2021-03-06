package net.threedoubloons.legendaryrandomiser.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

import net.threedoubloons.legendaryrandomiser.R;

final class C {
	static final int COVERT = R.drawable.col_covert;
	static final int INSTINCT = R.drawable.col_instinct; 
	static final int RANGED = R.drawable.col_ranged;
	static final int STRENGTH = R.drawable.col_strength;
	static final int TECH = R.drawable.col_tech;
}

final class T {
	static final int NONE = 0;
	static final int AVENGERS = R.drawable.team_avengers;
	static final int FFOUR = R.drawable.team_ffour;
	static final int KNIGHTS = R.drawable.team_marvelknights;
	static final int SHIELD = R.drawable.team_shield;
	static final int SPIDER = R.drawable.team_spiderfriends;
	static final int XMEN = R.drawable.team_xmen;
	static final int XFORCE = R.drawable.team_xforce; 
	static final int BROTHERHOOD = R.drawable.team_brotherhood; 
	static final int FASGARD = R.drawable.team_foesofasgard; 
	static final int SIN6 = R.drawable.team_sinister6; 
	static final int SYNDICATE = R.drawable.team_crimesyndicate; 
}

public enum Hero implements ICardBase {
	none(0, 0, 0, null),
	blackWidow(R.string.hero_blackWidow, R.drawable.hero_black_widow, T.AVENGERS, new int[]{C.TECH, C.COVERT, C.COVERT, C.COVERT}),
	captain(R.string.hero_captain, R.drawable.hero_captain_a, T.AVENGERS, new int[]{C.INSTINCT, C.STRENGTH, C.TECH, C.COVERT}),
	cyclops(R.string.hero_cyclops, R.drawable.hero_cyclops, T.XMEN, new int[]{C.STRENGTH, C.RANGED, C.RANGED, C.RANGED}),
	deadpool(R.string.hero_deadpool, R.drawable.hero_deadpool, T.NONE, new int[]{C.TECH, C.COVERT, C.INSTINCT, C.INSTINCT}),
	emmaFrost(R.string.hero_emmaFrost, R.drawable.hero_emma_frost, T.XMEN, new int[]{C.RANGED, C.COVERT, C.INSTINCT, C.STRENGTH}),
	gambit(R.string.hero_gambit, R.drawable.hero_gambit, T.XMEN, new int[]{C.RANGED, C.COVERT, C.INSTINCT, C.INSTINCT}),
	hawkeye(R.string.hero_hawkeye, R.drawable.hero_hawkeye, T.AVENGERS, new int[]{C.INSTINCT, C.TECH, C.TECH, C.TECH}),
	hulk(R.string.hero_hulk, R.drawable.hero_hulk, T.AVENGERS, new int[]{C.INSTINCT, C.STRENGTH, C.STRENGTH, C.STRENGTH}),
	ironMan(R.string.hero_ironMan, R.drawable.hero_ironman, T.AVENGERS, new int[]{C.RANGED, C.TECH, C.TECH, C.TECH}),
	nickFury(R.string.hero_nickFury, R.drawable.hero_nick_fury, T.SHIELD, new int[]{C.TECH, C.COVERT, C.STRENGTH, C.TECH}),
	rogue(R.string.hero_rogue, R.drawable.hero_rogue, T.XMEN, new int[]{C.STRENGTH, C.COVERT, C.COVERT, C.STRENGTH}),
	spiderman(R.string.hero_spiderman, R.drawable.hero_spiderman,  T.SPIDER, new int[]{C.INSTINCT, C.STRENGTH, C.TECH, C.COVERT}),
	storm(R.string.hero_storm, R.drawable.hero_storm, T.XMEN, new int[]{C.RANGED, C.RANGED, C.COVERT, C.RANGED}),
	thor(R.string.hero_thor, R.drawable.hero_thor, T.AVENGERS, new int[]{C.STRENGTH, C.RANGED, C.RANGED, C.RANGED}),
	wolverine(R.string.hero_wolverine, R.drawable.hero_wolverine, T.XMEN, new int[]{C.INSTINCT, C.INSTINCT, C.INSTINCT, C.INSTINCT}),
	
	//Dark City
	angel(R.string.hero_angel, R.drawable.hero_angel, T.XMEN, new int[]{C.COVERT, C.STRENGTH, C.INSTINCT, C.STRENGTH}, Sets.DarkCity),
	blade(R.string.hero_blade, R.drawable.hero_blade, T.KNIGHTS, new int[]{C.COVERT, C.STRENGTH, C.TECH, C.INSTINCT}, Sets.DarkCity),
	bishop(R.string.hero_bishop, R.drawable.hero_bishop, T.XMEN, new int[]{C.RANGED, C.COVERT, C.RANGED, C.TECH}, Sets.DarkCity),
	cable(R.string.hero_cable, R.drawable.hero_cable, T.XFORCE, new int[]{C.TECH, C.RANGED, C.COVERT, C.RANGED}, Sets.DarkCity),
	colossus(R.string.hero_colossus, R.drawable.hero_colossus, T.XFORCE, new int[]{C.STRENGTH, C.STRENGTH, C.COVERT, C.STRENGTH}, Sets.DarkCity),
	daredevil(R.string.hero_daredevil, R.drawable.hero_daredevil, T.KNIGHTS, new int[]{C.STRENGTH, C.INSTINCT, C.COVERT, C.INSTINCT}, Sets.DarkCity),
	domino(R.string.hero_domino, R.drawable.hero_domino, T.XFORCE, new int[]{C.TECH, C.INSTINCT, C.TECH, C.COVERT}, Sets.DarkCity),
	electra(R.string.hero_electra, R.drawable.hero_elektra, T.KNIGHTS, new int[]{C.COVERT, C.INSTINCT, C.INSTINCT, C.INSTINCT}, Sets.DarkCity),
	forge(R.string.hero_forge, R.drawable.hero_forge, T.XFORCE, new int[]{C.TECH, C.TECH, C.TECH, C.TECH}, Sets.DarkCity),
	ghostRider(R.string.hero_ghost_rider, R.drawable.hero_ghost_rider, T.KNIGHTS, new int[]{C.TECH, C.RANGED, C.STRENGTH, C.RANGED}, Sets.DarkCity),
	iceman(R.string.hero_iceman, R.drawable.hero_iceman, T.XMEN, new int[]{C.RANGED, C.RANGED, C.STRENGTH, C.RANGED}, Sets.DarkCity),
	ironFist(R.string.hero_ironfist, R.drawable.hero_iron_fist, T.KNIGHTS, new int[]{C.STRENGTH, C.INSTINCT, C.STRENGTH, C.STRENGTH}, Sets.DarkCity),
	jeanGrey(R.string.hero_jean_grey, R.drawable.hero_jean_grey, T.XMEN, new int[]{C.RANGED, C.COVERT, C.COVERT, C.RANGED}, Sets.DarkCity),
	nightCrawler(R.string.hero_nightcrawler, R.drawable.hero_nightcrawler, T.XMEN, new int[]{C.INSTINCT, C.COVERT, C.INSTINCT, C.COVERT}, Sets.DarkCity),
	professorX(R.string.hero_profx, R.drawable.hero_profx, T.XMEN, new int[]{C.RANGED, C.INSTINCT, C.RANGED, C.COVERT}, Sets.DarkCity),
	punisher(R.string.hero_punisher, R.drawable.hero_punisher, T.KNIGHTS, new int[]{C.TECH, C.TECH, C.STRENGTH, C.TECH}, Sets.DarkCity),
	wolverine_dc(R.string.hero_wolverine, R.drawable.hero_wolverine_dc, T.XFORCE, new int[]{C.INSTINCT, C.COVERT, C.STRENGTH, C.COVERT}, Sets.DarkCity),

	human_torch(R.string.hero_human_torch, R.drawable.hero_human_torch, T.FFOUR, new int[]{C.RANGED, C.INSTINCT, C.RANGED, C.RANGED}, Sets.FantasticFour),
	invisible_woman(R.string.hero_invisible_woman, R.drawable.hero_invisible_woman, T.FFOUR, new int[]{C.COVERT, C.RANGED, C.COVERT, C.RANGED}, Sets.FantasticFour),
	mr_fantastic(R.string.hero_mr_fantastic, R.drawable.hero_mr_fantastic, T.FFOUR, new int[]{C.TECH, C.TECH, C.INSTINCT, C.TECH}, Sets.FantasticFour),
	silver_surfer(R.string.hero_silver_surfer, R.drawable.hero_silver_surfer, T.NONE, new int[]{C.STRENGTH, C.COVERT, C.RANGED, C.RANGED}, Sets.FantasticFour),
	thing(R.string.hero_thing, R.drawable.hero_thing, T.FFOUR, new int[]{C.INSTINCT, C.STRENGTH, C.STRENGTH, C.STRENGTH}, Sets.FantasticFour),
	
	symbiote(R.string.hero_symbiote, R.drawable.hero_symbiote, T.SPIDER, new int[]{C.STRENGTH, C.INSTINCT, C.COVERT, C.RANGED}, Sets.PaintRed),
	blackCat(R.string.hero_black_cat, R.drawable.hero_black_cat, T.SPIDER, new int[]{C.COVERT, C.COVERT, C.INSTINCT, C.COVERT}, Sets.PaintRed),
	moonKnight(R.string.hero_moon_knight, R.drawable.hero_moon_knight, T.KNIGHTS, new int[]{C.INSTINCT, C.TECH, C.TECH, C.INSTINCT}, Sets.PaintRed),
	scarletSpider(R.string.hero_scarlet_spider, R.drawable.hero_scarlet_spider, T.SPIDER, new int[]{C.STRENGTH, C.INSTINCT, C.COVERT, C.STRENGTH}, Sets.PaintRed),
	spiderWoman(R.string.hero_spider_woman, R.drawable.hero_spider_woman, T.SPIDER, new int[]{C.STRENGTH, C.RANGED, C.RANGED, C.COVERT}, Sets.PaintRed),
	
	bullseye(R.string.hero_bullseye, R.drawable.hero_bullseye, T.SYNDICATE, new int[]{C.INSTINCT, C.RANGED, C.COVERT, C.RANGED}, Sets.Villains),
	kingpin(R.string.hero_kingpin, R.drawable.hero_kingpin, T.SYNDICATE, new int[]{C.STRENGTH, C.COVERT, C.TECH, C.STRENGTH}, Sets.Villains),
	ultron(R.string.hero_ultron, R.drawable.hero_ultron, T.NONE, new int[]{C.TECH, C.TECH, C.TECH, C.TECH}, Sets.Villains),
	loki(R.string.hero_loki, R.drawable.hero_loki, T.FASGARD, new int[]{C.COVERT, C.RANGED, C.COVERT, C.COVERT}, Sets.Villains),
	enchantress(R.string.hero_enchantress, R.drawable.hero_enchantress, T.FASGARD, new int[]{C.RANGED, C.COVERT, C.COVERT, C.COVERT}, Sets.Villains),
	sabretooth(R.string.hero_sabretooth, R.drawable.hero_sabretooth, T.BROTHERHOOD, new int[]{C.INSTINCT, C.INSTINCT, C.COVERT, C.STRENGTH}, Sets.Villains),
	mystique(R.string.hero_mystique, R.drawable.hero_mystique, T.BROTHERHOOD, new int[]{C.COVERT, C.TECH, C.INSTINCT, C.COVERT}, Sets.Villains),
	magneto(R.string.hero_magneto, R.drawable.hero_magneto, T.BROTHERHOOD, new int[]{C.RANGED, C.STRENGTH, C.RANGED, C.RANGED}, Sets.Villains),
	juggernaut(R.string.hero_juggernaut, R.drawable.hero_juggernaut, T.BROTHERHOOD, new int[]{C.STRENGTH, C.STRENGTH, C.STRENGTH, C.STRENGTH}, Sets.Villains),
	venom(R.string.hero_venom, R.drawable.hero_venom, T.SIN6, new int[]{C.STRENGTH, C.INSTINCT, C.STRENGTH, C.INSTINCT}, Sets.Villains),
	mysterio(R.string.hero_mysterio, R.drawable.hero_mysterio, T.SIN6, new int[]{C.COVERT, C.RANGED, C.TECH, C.INSTINCT}, Sets.Villains),
	kraven(R.string.hero_kraven, R.drawable.hero_kraven, T.SIN6, new int[]{C.INSTINCT, C.COVERT, C.STRENGTH, C.INSTINCT}, Sets.Villains),
	greenGoblin(R.string.hero_green_goblin, R.drawable.hero_green_goblin, T.SIN6, new int[]{C.TECH, C.TECH, C.INSTINCT, C.TECH}, Sets.Villains),
	drOctopus(R.string.hero_drOctopus, R.drawable.hero_drOctopus, T.FSIN6, new int[]{C.TECH, C.TECH, C.STRENGTH, C.TECH}, Sets.Villains),
	electro(R.string.hero_electro, R.drawable.hero_electro, T.SIN6, new int[]{C.RANGED, C.RANGED, C.RANGED, C.RANGED}, Sets.Villains),
	;
	
	private final CardBase card;
	private final int affiliationPictureId;
	private final int[] cardColours;
		
	private Hero(int name, int pictureId, int affiliationPictureId, int[] cardColours) {
		this(name, pictureId, affiliationPictureId, cardColours, Sets.CoreSet);
	}
	
	private Hero(int name, int pictureId, int affiliationPictureId, int[] cardColours, Sets set) {
		card = new CardBase(name, pictureId, set);
		this.affiliationPictureId = affiliationPictureId;
		this.cardColours = cardColours;
	}
	
	public int getAffiliationPictureId() {
		return affiliationPictureId;
	}
	
	public int getCardColour(int position) {
		if (cardColours == null) return 0;
		return cardColours[position];
	}

	@Override
	public CardBase getCard() {
		return card;
	}
	
	public static Hero get(String name) {
		return Enum.valueOf(Hero.class, name);
	}

	private static List<Hero> all;
	public static void initialiseAllList(EnumSet<Sets> activeSets) {
		List<Hero> all = new ArrayList<Hero>();

		for (Hero h : values()) {
			if (activeSets.contains(h.card.getExpansion())) {
				all.add(h);
			}
		}
		
		all.remove(none);
		
		Hero.all = Collections.unmodifiableList(all);
	}
	
	public final static List<Hero> getAll() {
		return all;
	}
}
