package com.eduardo.DS_list.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity //Equivalente a uma tabela do banco relacional
@Table(name = "tb_game")

public class Game {
    @Id //Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define ID como autoincrement
    private Long id;
    private String title;

    @Column(name = "game_year") //costumizando o nome da coluna
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game() {
    }

    public Game(String longDescription, String shortDescription, String imgUrl, Double score, String platforms, String genre, Integer year, String title, Long id) {

        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
        this.score = score;
        this.platforms = platforms;
        this.genre = genre;
        this.year = year;
        this.title = title;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
