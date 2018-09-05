package com.giroux.kevin.dofustuff.commons.characters;
/**
 * Created by kevin on 26/11/2016.
 */
public class CharacteristicClass implements Comparable<CharacteristicClass> {
    private long id;
    private int levelSeuil;
    private String typeCharacteristic;
    private int costForOne;

    public CharacteristicClass(){

    }

    public CharacteristicClass(int levelSeuil, String typeCaracteristic, int costForOne) {
        this.levelSeuil = levelSeuil;
        this.typeCharacteristic = typeCaracteristic;
        this.costForOne = costForOne;
    }

    public int getLevelSeuil() {
        return levelSeuil;
    }

    public void setLevelSeuil(int levelSeuil) {
        this.levelSeuil = levelSeuil;
    }

    public String getTypeCharacteristic() {
        return typeCharacteristic;
    }

    public void setTypeCharacteristic(String typeCaracteristic) {
        this.typeCharacteristic = typeCaracteristic;
    }

    public int getCostForOne() {
        return costForOne;
    }

    public void setCostForOne(int costForOne) {
        this.costForOne = costForOne;
    }

    @Override
    public int compareTo(CharacteristicClass characteristicClass) {
        return this.getLevelSeuil() - characteristicClass.getLevelSeuil();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
