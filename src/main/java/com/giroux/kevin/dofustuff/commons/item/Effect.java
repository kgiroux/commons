package com.giroux.kevin.dofustuff.commons.item;

public class Effect {

    private int id;
    private String internalId;
    private  String name;
    private String type;
    private int min;
    private int max;
    private String other;
    private String emotes;
    private String title;
    private String spell;
    private ForgeMagie fm;
    private boolean exo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getEmotes() {
        return emotes;
    }

    public void setEmotes(String emotes) {
        this.emotes = emotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public ForgeMagie getFm() {
        return fm;
    }

    public void setFm(ForgeMagie fm) {
        this.fm = fm;
    }

    public boolean isExo() {
        return exo;
    }

    public void setExo(boolean exo) {
        this.exo = exo;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }
}
