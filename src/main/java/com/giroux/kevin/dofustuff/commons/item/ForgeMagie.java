package com.giroux.kevin.dofustuff.commons.item;

import java.io.Serializable;

public class ForgeMagie implements Serializable {
    
    private int id;

    private int value;

    private String elt;

    private int min;

    private int max;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getElt() {
        return elt;
    }

    public void setElt(String elt) {
        this.elt = elt;
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
}
