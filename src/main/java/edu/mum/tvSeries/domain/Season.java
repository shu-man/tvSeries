package edu.mum.tvSeries.domain;

/**
 * Created by Hatake on 8/7/2017.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue
    private int id;
    private String summary;
    private Date year;
    @Lob
    @Column(columnDefinition = "mediumblob")
    private byte[] poster;
    @OneToMany
    @JoinTable(name = "season_episode")
    private List<Episode> episodeList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }


}