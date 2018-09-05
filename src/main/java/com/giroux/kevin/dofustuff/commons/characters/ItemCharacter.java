package com.giroux.kevin.dofustuff.commons.characters;

import java.util.List;

public class ItemCharacter implements Comparable<ItemCharacter>{

    private long id;
    private int itemId;
    private String name;
    private String type;
    private int level;
    private String setName;
    private List<Characteristic> characteristics;

    public ItemCharacter(){
    }

    public ItemCharacter(long id, int itemId, String name, String type, int level, String setName, List<Characteristic> caracteristics) {
        this.id = id;
        this.itemId = itemId;
        this.name = name;
        this.type = type;
        this.level = level;
        this.setName = setName;
        this.characteristics = caracteristics;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public List<Characteristic> getCaracteristics() {
        return characteristics;
    }

    public void setCaracteristics(List<Characteristic> caracteristics) {
        this.characteristics = caracteristics;
    }

    @Override
    public int compareTo(ItemCharacter itemCharacter) {
        return this.getName().compareTo(itemCharacter.getName());
    }
}
