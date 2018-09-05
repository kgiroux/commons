package com.giroux.kevin.dofustuff.commons.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Profile implements Comparable<Profile> {

    /**
     * Id du profile
     */
    private String id;

    /**
     * Nom
     */
    private String name;

    public String getNom() {
        return name;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{\"id\":\"" + id + "\", \"name\":\"" + name + "\"" + "}";
    }

    @Override
    public int compareTo(Profile profile) {
        if (name != null && profile.name != null) {
            return name.compareTo(profile.name);
        } else {
            if (name == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

