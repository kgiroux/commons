package com.giroux.kevin.dofustuff.commons.item;

public enum ItemCategory {
	UNKNOWN("Unknown"),
    CHAPEAU("Chapeau"),
	DOFUS("Dofus"),
	MARTEAU("Marteau"),
	FAMILIER("Familier"),
	AMULETTE("Amulette"),
	DAGUE("Dague"),
	MONTILIER("Montilier"),
	MONTURE("Monture"),
	TROPHEE("Trophée"),
	BOTTES("Bottes"),
	CEINTURE("Ceinture"),
	PIOCHE("Pioche"),
	BAGUETTE("Baguette"),
	SACADOS("Sac à dos"),
	ANNEAU("Anneau"),
	CAPE("Cape"),
	MULDO("Muldo"),
	PELLE("Pelle"),
	EPPE("Épée"),
	BATON("Bâton"),
	HACHE("Hache"),
	ARC("Arc"),
	FAUX("Faux"),
	BOUCLIER("Bouclier");
	
    private String category;
    ItemCategory(String category){
       this.category = category;
    }
    
    public static ItemCategory findByCategory(final String category) {
    	for(ItemCategory cat : values()){
            if( cat.category.equals(category)){
                return cat;
            }
        }
		return UNKNOWN;
    }
    
}
