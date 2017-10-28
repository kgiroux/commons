package com.giroux.kevin.dofustuff.commons.item;

import java.io.Serializable;

public class Property implements Serializable {

    private int id;
    private int paCost;
    private String  poRange;
    private int ccBonus;
    private int ccRate;
    private int ccHits;
    private int hitsCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaCost() {
        return paCost;
    }

    public void setPaCost(int paCost) {
        this.paCost = paCost;
    }

    public String getPoRange() {
        return poRange;
    }

    public void setPoRange(String poRange) {
        this.poRange = poRange;
    }

    public int getCcBonus() {
        return ccBonus;
    }

    public void setCcBonus(int ccBonus) {
        this.ccBonus = ccBonus;
    }

    public int getCcRate() {
        return ccRate;
    }

    public void setCcRate(int ccRate) {
        this.ccRate = ccRate;
    }

    public int getCcHits() {
        return ccHits;
    }

    public void setCcHits(int ccHits) {
        this.ccHits = ccHits;
    }

    public int getHitsCount() {
        return hitsCount;
    }

    public void setHitsCount(int hitsCount) {
        this.hitsCount = hitsCount;
    }
}
