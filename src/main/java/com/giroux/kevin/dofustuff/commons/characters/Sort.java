package com.giroux.kevin.dofustuff.commons.characters;

import java.util.ArrayList;
import java.util.List;

/**
 * File created by Kevin on 05/10/2014 for DofusPanoManager
 */
public class Sort {
    private long id;
    private String nom_sort;
    private int type;
    private String classe;
    private String description;
    private List<CharacteristicSort> characteristicSort;

    public Sort() {
        nom_sort = "";
        type = 0;
        classe = "";
        description = "";
        characteristicSort = new ArrayList<>();
    }

    public String toString(int niveau) {
        CharacteristicSort caract = null;
        for (CharacteristicSort aCharacteristicSort : characteristicSort) {
            if (niveau == aCharacteristicSort.getLv()) {
                caract = aCharacteristicSort;
            }
        }
        if (caract != null) {
            return description + "\n"
                    + caract.toString();
        } else {
            return description + "\n";
        }


    }

    public void setCharacteristicSort(List<CharacteristicSort> characteristicSort) {
        this.characteristicSort = characteristicSort;
    }

    public String getNom_sort() {
        return nom_sort;
    }

    public void setNom_sort(String nom_sort) {
        this.nom_sort = nom_sort;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
