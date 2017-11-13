package com.giroux.kevin.dofustuff.commons.item;

import java.io.Serializable;

public enum ItemCategory implements Serializable {
	UNKNOWN("unknown"),
    CHAPEAU("chapeau"),
	DOFUS("dofus"),
	MARTEAU("marteau"),
	FAMILIER("familier"),
	AMULETTE("amulette"),
	DAGUE("dague"),
	MONTILIER("montilier"),
	MONTURE("monture"),
	TROPHEE("trophée"),
	BOTTES("bottes"),
	CEINTURE("ceinture"),
	PIOCHE("pioche"),
	BAGUETTE("baguette"),
	SACADOS("sac à dos"),
	ANNEAU("anneau"),
	CAPE("cape"),
	MULDO("muldo"),
	PELLE("pelle"),
	EPPE("épée"),
	BATON("bâton"),
	HACHE("hache"),
	ARC("arc"),
	FAUX("faux"),
	BOUCLIER("bouclier");
	
    private String category;
    ItemCategory(String category){
       this.category = category;
    }

	public String getCategory() {
		return category;
	}

	public static ItemCategory findByCategory(final String category) {
    	String toCompare = category.toLowerCase();
    	for(ItemCategory cat : values()) {
			if (cat.getCategory().equals(toCompare)) {
				return cat;
			}
		}
		return UNKNOWN;
    }
    
}
