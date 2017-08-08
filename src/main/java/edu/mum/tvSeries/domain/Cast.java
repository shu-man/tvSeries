package edu.mum.tvSeries.domain;

/**
 * Created by Hatake on 8/7/2017.
 */

import javax.persistence.*;

@Entity
public class Cast {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String birthPlace;
    private String characterName;
    private String biography;
    @Lob
    @Column(columnDefinition = "mediumblob")
    private byte[] castImage;

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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getcharacterName() {
        return characterName;
    }

    public void setcharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public byte[] getCastImage() {
        return castImage;
    }

    public void setCastImage(byte[] castImage) {
        this.castImage = castImage;
    }


}
