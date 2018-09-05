package com.giroux.kevin.dofustuff.commons.characters;


import com.giroux.kevin.dofustuff.commons.constants.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kevin on 25/11/2016.
 */
public class Character {
    private long id;
    private String classGame;
    private String sex;


    private String name;
    private List<ItemCharacter> equipments;
    private List<CharacteristicClass> characteristicClasses;
    private List<Characteristic> parchemin;
    private List<Characteristic> caracteristics;
    private List<Sort> spells;
    private String nbCharacteristicPointAvailableStringOb;
    private String pointChance;
    private String pointForce;
    private String pointIntelligence;
    private String pointVitality;
    private String pointAgility;
    private String pointSagesse;

    private int level;
    private String levelString;
    public static Character create(){
        Character character = new Character();
        character.initCharacter();
        return character;
    }



    public Character() {
       //initCharacter();
    }

    public void initCharacter(){
        caracteristics = new ArrayList<>();
        parchemin = new ArrayList<>();
        spells = new ArrayList<>();
         /*
         * Init base caracteristic
         */
        Characteristic caracteristic = new Characteristic(TypeCharacteristic.VITALITE.toString(),0,0,11,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.SAGESSE.toString(),0,0,12,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.FORCE.toString(),0,0,13,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.INTELLIGENCE.toString(),0,0,14,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.CHANCE.toString(),0,0,15,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.AGILITE.toString(),0,0,16,0);
        caracteristics.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.LEVEL.toString(),1,200,-1,200);
        caracteristics.add(caracteristic);

        /*
         *  Parchemin caractéristique
         */

        caracteristic = new Characteristic(TypeCharacteristic.VITALITE.toString(),0,100,11,100);
        parchemin.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.SAGESSE.toString(),0,100,12,100);
        parchemin.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.FORCE.toString(),0,100,13,100);
        parchemin.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.INTELLIGENCE.toString(),0,100,14,100);
        parchemin.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.CHANCE.toString(),0,100,15,100);
        parchemin.add(caracteristic);
        caracteristic = new Characteristic(TypeCharacteristic.AGILITE.toString(),0,100,16,100);
        parchemin.add(caracteristic);


        characteristicClasses = new ArrayList<>();
        CharacteristicClass characteristicClass = new CharacteristicClass(0,TypeCharacteristic.VITALITE.toString(),1);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(0,TypeCharacteristic.SAGESSE.toString(),3);
        characteristicClasses.add(characteristicClass);
        // Agility
        characteristicClass = new CharacteristicClass(0,TypeCharacteristic.AGILITE.toString(),1);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(1,TypeCharacteristic.AGILITE.toString(),2);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(2,TypeCharacteristic.AGILITE.toString(),3);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(3,TypeCharacteristic.AGILITE.toString(),4);
        characteristicClasses.add(characteristicClass);

        // Luck
        characteristicClass = new CharacteristicClass(0,TypeCharacteristic.CHANCE.toString(),1);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(1,TypeCharacteristic.CHANCE.toString(),2);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(2,TypeCharacteristic.CHANCE.toString(),3);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(3,TypeCharacteristic.CHANCE.toString(),4);
        characteristicClasses.add(characteristicClass);

        // Strengh
        characteristicClass = new CharacteristicClass(0,TypeCharacteristic.FORCE.toString(),1);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(1,TypeCharacteristic.FORCE.toString(),2);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(2,TypeCharacteristic.FORCE.toString(),3);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(3,TypeCharacteristic.FORCE.toString(),4);
        characteristicClasses.add(characteristicClass);




        characteristicClass = new CharacteristicClass(0,TypeCharacteristic.INTELLIGENCE.toString(),1);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(1,TypeCharacteristic.INTELLIGENCE.toString(),2);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(2,TypeCharacteristic.INTELLIGENCE.toString(),3);
        characteristicClasses.add(characteristicClass);
        characteristicClass = new CharacteristicClass(3,TypeCharacteristic.INTELLIGENCE.toString(),4);
        characteristicClasses.add(characteristicClass);

    }
    public Character(final String name, final int level ){
       initCharacter();
    }

    public Characteristic getCharacteristic(final String value) {
            return this.caracteristics.stream().filter(caracteristic -> caracteristic.getNameCharacteristic().equals(value)).collect(Collectors.toList()).get(0);

    }

    private List<CharacteristicClass> getCharacteristicClass(final String value) {
        return this.characteristicClasses.stream().filter(caracteristic -> caracteristic.getTypeCharacteristic().equals(value)).collect(Collectors.toList());
    }


    public String getClassGame() {
        return classGame;
    }
    public void setClassGame(String classGame) {
        this.classGame = classGame;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemCharacter> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<ItemCharacter> equipments) {
        this.equipments = equipments;
    }

    public List<Characteristic> getParchemin() {
        return parchemin;
    }

    public void setParchemin(List<Characteristic> parchemin) {
        this.parchemin = parchemin;
    }

    public List<Characteristic> getCharacteristics() {
        return caracteristics;
    }

    public void setCharacteristics(List<Characteristic> caracteristics) {
        this.caracteristics = caracteristics;
    }

    public List<Sort> getSpells() {
        return spells;
    }

    public void setSpells(List<Sort> spells) {
        this.spells = spells;
    }

    public int getLevel() {
        return level;
    }

    public String getLevelString() {
        return levelString;
    }

    public String getNbCharacteristicPointAvailableStringOb() {
        return nbCharacteristicPointAvailableStringOb;
    }

    public void setNbCharacteristicPointAvailableStringOb(String nbCharacteristicPointAvailableStringOb) {
        this.nbCharacteristicPointAvailableStringOb = nbCharacteristicPointAvailableStringOb;
    }

    public void setLevelString(String levelString) {
        this.levelString = levelString;
        try{
            if(!this.levelString.equals("")){
                this.level = Integer.parseInt(this.levelString);
                if(level>0 && level<=Constants.MAX_LEVEL){
                    this.setNbCharacteristicPointAvailableStringOb(String.valueOf((level -1) * 5));
                }
            }
        }catch (NumberFormatException ex){
           // TODO logger to implements
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getPointChance() {
        return pointChance;
    }

    public void setPointChance(String pointChance) {

        this.pointChance = pointChance;
        if(Integer.parseInt(pointChance) <= 995){
            try{
                if(!this.pointChance.equals("")){
                    if(isManyPointAvailable(pointChance,TypeCharacteristic.CHANCE)){
                        this.getCharacteristic(TypeCharacteristic.CHANCE.toString()).setCurrentValue(Integer.parseInt(this.pointChance));
                    }
                }

            }catch (NumberFormatException ex){
                // TODO logger to implements
            }
        }
    }

    private boolean isManyPointAvailable(String nbPointWanted, TypeCharacteristic caracteristic) throws NumberFormatException{
        int value = Integer.parseInt(nbPointWanted);
        List<CharacteristicClass> characteristicClasses = this.getCharacteristicClass(caracteristic.toString());
        Collections.sort(characteristicClasses);
        int requiredPoint = 0;
        for(CharacteristicClass c : characteristicClasses){
                if((value - Constants.SIZE_PALIER_CARA) <= 0 ){
                    requiredPoint = requiredPoint + value * c.getCostForOne();
                    break;
                }else{
                    requiredPoint += c.getCostForOne() * Constants.SIZE_PALIER_CARA;
                    value -= Constants.SIZE_PALIER_CARA;
                }
        }
        if(requiredPoint <Integer.parseInt(this.nbCharacteristicPointAvailableStringOb)){
            int lastPoint = Integer.parseInt(this.nbCharacteristicPointAvailableStringOb) - requiredPoint;
            this.nbCharacteristicPointAvailableStringOb = String.valueOf(lastPoint);
        }
        return requiredPoint <Integer.parseInt(this.nbCharacteristicPointAvailableStringOb);
    }


    public String getPointForce() {
        return pointForce;
    }

    public void setPointForce(String pointForce) {
        this.pointForce = pointForce;
    }

    public String getPointIntelligence() {
        return pointIntelligence;
    }

    public void setPointIntelligence(String pointIntelligence) {
        this.pointIntelligence = pointIntelligence;
    }

    public String getPointVitality() {
        return pointVitality;
    }

    public void setPointVitality(String pointVitality) {
        this.pointVitality = pointVitality;
    }

    public String getPointAgility() {
        return pointAgility;
    }

    public void setPointAgility(String pointAgility) {
        this.pointAgility = pointAgility;
    }

    public String getPointSagesse() {
        return pointSagesse;
    }

    public void setPointSagesse(String pointSagesse) {
        this.pointSagesse = pointSagesse;
    }

}
