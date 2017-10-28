package com.giroux.kevin.dofustuff.commons.item;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable{

	public  String id;
    private String name;
    private String description;
    private int level;
    private String cloth;
    private Integer imageId;
    private ItemCategory category;
    private Property property;
    private List<Effect> effects;

    public Item() {
    		this.cloth = "NONE";
    }
    
    public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

	/**
	 * @return the category
	 */
	public ItemCategory getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	/**
	 * @return the imageId
	 */
	public Integer getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public List<Effect> getEffects() {
		return effects;
	}

	public void setEffects(List<Effect> effects) {
		this.effects = effects;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
