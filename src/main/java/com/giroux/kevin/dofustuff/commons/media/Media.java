package com.giroux.kevin.dofustuff.commons.media;

public class Media implements Comparable<Media>{

    /**
     * Identifiant fonctionnel
     */
    private String id;

    /**
     * Chemin du dossier contenant le fichier
     */
    private String path;

    /**
     * Nom fonctionnel
     */
    private String name;

    /**
     * Nom du fichier
     */
    private String fileName;

    /**
     * Type du média
     */
    private TypeMedia typeMedia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TypeMedia getTypeMedia() {
        return typeMedia;
    }

    public void setTypeMedia(TypeMedia typeMedia) {
        this.typeMedia = typeMedia;
    }

    public int compareTo(Media o) {
        return this.getName().compareTo(o.getName());
    }
}
