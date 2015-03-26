package net.threedoubloons.legendaryrandomiser.data;

import java.util.EnumSet;

import net.threedoubloons.legendaryrandomiser.R;

public enum Sets {
	CoreSet(R.drawable.exp_core, R.string.set_core),
	DarkCity(R.drawable.exp_darkcity, R.string.set_darkcity),
	FantasticFour(R.drawable.exp_ffour, R.string.set_ffour),
	PaintRed(R.drawable.exp_paint_red, R.string.set_paint_red),
	PaintRed(R.drawable.exp_guardians_galaxy, R.string.guardians_galaxy),
	PaintRed(R.drawable.exp_fear_itself, R.string.set_fear_itself),
	;
	
	private final int symbol;
	private final int name;
	
	private Sets(int symbol, int name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public long mask() {
		return (1L << ordinal());
	}
	
	public int getSymbol() {
		return symbol;
	}

	public int getName() {
		return name;
	}

	public static EnumSet<Sets> make(long flags) {
		EnumSet<Sets> sets = EnumSet.noneOf(Sets.class);
		
		for (Sets s : Sets.values()) {
			if ((flags & s.mask()) != 0) {
				sets.add(s);
			}
		}		
		
		return sets;
	}
	
	public static EnumSet<Sets> make(Sets... sets) {
		EnumSet<Sets> ret = EnumSet.noneOf(Sets.class);
		
		for (Sets s : sets) {
			ret.add(s);
		}		
		
		return ret;
	}
	
	public static long unmake(EnumSet<Sets> sets) {
		long ret = 0L;
		for (Sets s : sets) {
			ret |= s.mask();
		}
		
		return ret;
	}
	
	public static long unmake(Sets... sets) {
		long ret = 0L;
		for (Sets s : sets) {
			ret |= s.mask();
		}
		
		return ret;
	}
}
